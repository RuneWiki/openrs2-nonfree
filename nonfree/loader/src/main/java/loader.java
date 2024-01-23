import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.security.MessageDigest;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!loader")
public final class loader extends Applet implements Runnable {

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString345;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString346;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString347;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt5750;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt5752;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt5749 = 32;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean393 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean394 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean395 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean396 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt5751 = 0;

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BI)Z")
	private boolean method4808(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(10) FileOutputStream local10 = new FileOutputStream(arg0);
			local10.write(arg1, 0, arg1.length);
			local10.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method4813("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLloader!f;Z)Z")
	private boolean method4809(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class196 arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg0);
			@Pc(26) byte[] local26 = local10.digest();
			for (@Pc(28) int local28 = 0; local28 < 20; local28++) {
				if (arg1.anIntArray509[local28] != local26[local28]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(48) Exception local48) {
			this.method4813("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean395 = false;
		this.aBoolean393 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B)[B")
	private byte[] method4810(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(13) int local13 = (int) arg0.length();
			@Pc(16) byte[] local16 = new byte[local13];
			@Pc(27) DataInputStream local27 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local27.readFully(local16, 0, local13);
			local27.close();
			return local16;
		} catch (@Pc(37) IOException local37) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean393 = false;
		this.aBoolean395 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;Lloader!rj;BZ)[B")
	private byte[] method4811(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class199 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(7) File local7;
		try {
			local7 = Class199.method4838(this.anInt5749, arg0.aString343, aString345);
		} catch (@Pc(9) Exception local9) {
			this.method4813("nocache");
			return null;
		}
		@Pc(20) byte[] local20 = this.method4810(local7);
		if (!this.method4809(local20, arg0, arg2)) {
			local20 = this.method4812(arg0, false);
			if (local20 == null) {
				local20 = this.method4812(arg0, true);
			}
			if (local20 == null) {
				this.method4813("download");
				return null;
			}
			if (!this.method4808(local7, local20)) {
				return null;
			}
			local20 = this.method4810(local7);
			if (!this.method4809(local20, arg0, false)) {
				this.method4813("mismatch");
				return null;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean396 = true;
		this.aBoolean395 = this.aBoolean393 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;ZI)[B")
	private byte[] method4812(@OriginalArg(0) Class196 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(27) byte[] local27 = new byte[arg0.anInt5747];
		try {
			@Pc(38) InputStream local38;
			if (arg1) {
				@Pc(43) URL local43 = this.getCodeBase();
				@Pc(51) Socket local51 = new Socket(InetAddress.getByName(local43.getHost()), 443);
				local51.setSoTimeout(10000);
				@Pc(57) OutputStream local57 = local51.getOutputStream();
				local57.write(17);
				local57.write(("JAGGRAB " + local43.getFile() + arg0.aString344 + "\n\n").getBytes());
				local38 = local51.getInputStream();
			} else {
				local38 = (new URL(this.getCodeBase(), arg0.aString344)).openStream();
			}
			@Pc(82) int local82 = -1;
			@Pc(84) int local84 = 0;
			while (local84 < local27.length) {
				@Pc(98) int local98 = local27.length - local84;
				if (local98 > 1000) {
					local98 = 1000;
				}
				@Pc(109) int local109 = local38.read(local27, local84, local98);
				if (local109 < 0) {
					throw new EOFException();
				}
				local84 += local109;
				@Pc(130) int local130 = local84 * 100 / local27.length;
				if (local130 != local82) {
					try {
						@Pc(137) Graphics local137 = this.getGraphics();
						if (local137 == null) {
							this.repaint();
						} else {
							local137.setColor(Color.black);
							local82 = local130;
							local137.fillRect(0, 0, this.anInt5752, this.anInt5750);
							local137.setColor(local17);
							local137.drawRect(this.anInt5752 / 2 - 152, this.anInt5750 / 2 + -18, 303, 33);
							@Pc(193) String local193 = arg0.aStringArray41[this.anInt5751] + " - " + local130 + "%";
							local137.setFont(local8);
							local137.setColor(Color.white);
							local137.drawString(local193, (this.anInt5752 - local12.stringWidth(local193)) / 2, this.anInt5750 / 2 + 4);
						}
					} catch (@Pc(219) Exception local219) {
					}
				}
			}
			local38.close();
			if (arg0.anInt5747 != arg0.anInt5746) {
				@Pc(237) byte[] local237 = new byte[arg0.anInt5746];
				@Pc(242) Inflater local242 = new Inflater(true);
				local242.setInput(local27);
				local242.inflate(local237);
				local27 = local237;
			}
		} catch (@Pc(253) Exception local253) {
			return null;
		}
		return this.method4809(local27, arg0, false) ? local27 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method4813(@OriginalArg(1) String arg0) {
		if (this.aBoolean394) {
			return;
		}
		this.aBoolean394 = true;
		try {
			if (aString347 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString347 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(50) Exception local50) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean396 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString346 = this.getParameter("unsignedurl");
			if (aString346 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean394 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString346), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			@Pc(35) String local35 = this.getParameter("pre142url");
			@Pc(42) String local42;
			if (local35 != null) {
				try {
					local42 = System.getProperty("java.version");
					if (local42.startsWith("1.3.") || local42.startsWith("1.4.0") || local42.startsWith("1.4.1")) {
						this.getAppletContext().showDocument(new URL(local35), "_self");
					}
				} catch (@Pc(65) Exception local65) {
				}
			}
			aString347 = this.getParameter("crashurl");
			aString345 = this.getParameter("cachesubdir");
			if (aString345 == null) {
				aString345 = "runescape";
			}
			this.anInt5752 = this.getSize().width;
			this.anInt5750 = this.getSize().height;
			try {
				@Pc(93) int local93 = Integer.parseInt(this.getParameter("modewhat"));
				this.anInt5749 += local93;
			} catch (@Pc(101) Exception local101) {
			}
			try {
				local42 = this.getParameter("lang");
				if (local42 != null) {
					this.anInt5751 = Integer.parseInt(local42);
				}
			} catch (@Pc(114) Exception local114) {
			}
			@Pc(123) Class199 local123;
			try {
				local123 = new Class199(this, this.anInt5749, aString345, 29);
			} catch (@Pc(125) Exception local125) {
				this.method4813("nocache");
				return;
			}
			@Pc(134) ClassLoader_Sub1 local134 = new ClassLoader_Sub1();
			@Pc(144) byte[] local144;
			try {
				Class.forName("java.util.jar.Pack200");
				local144 = this.method4811(Class194.aClass196_2, local123, false);
				if (local144 == null) {
					return;
				}
				local134.anUnpack1 = new unpack_Sub1(local144);
				@Pc(162) byte[] local162 = this.method4811(Class194.aClass196_4, local123, false);
				if (local162 == null) {
					return;
				}
				local134.anUnpack2 = new unpack_Sub1(local162);
			} catch (@Pc(175) Throwable local175) {
			}
			@Pc(258) byte[] local258;
			if (local134.anUnpack1 == null) {
				local144 = this.method4811(Class194.aClass196_1, local123, false);
				if (local144 == null) {
					return;
				}
				@Pc(193) ClassLoader_Sub1 local193 = new ClassLoader_Sub1();
				local193.anUnpack1 = new unpack(local144);
				@Pc(202) Class local202 = Class.forName("unpack");
				local193.aHashtable1.put(local202.getName(), local202);
				@Pc(213) Class local213 = local193.loadClass("unpackclass");
				@Pc(220) byte[] local220 = this.method4811(Class194.aClass196_3, local123, false);
				if (local220 == null) {
					return;
				}
				local134.anUnpack1 = (unpack) local213.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local220, Boolean.TRUE);
				local258 = this.method4811(Class194.aClass196_5, local123, false);
				if (local258 == null) {
					return;
				}
				local134.anUnpack2 = (unpack) local213.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local258, Boolean.TRUE);
			}
			@Pc(293) String local293 = System.getProperty("os.name").toLowerCase();
			@Pc(297) String local297 = System.getProperty("os.arch").toLowerCase();
			@Pc(311) byte local311;
			if (local293.startsWith("win")) {
				if (local297.startsWith("amd64") || local297.startsWith("x86_64")) {
					local311 = 4;
				} else {
					local311 = 0;
				}
			} else if (local293.startsWith("linux")) {
				local311 = 1;
			} else if (!local293.startsWith("mac")) {
				this.method4813("os");
				return;
			} else if (local297.startsWith("ppc")) {
				local311 = 2;
			} else {
				local311 = 3;
			}
			for (@Pc(342) int local342 = 0; local342 < Class194.aClass196ArrayArray1[local311].length; local342++) {
				local258 = this.method4811(Class194.aClass196ArrayArray1[local311][local342], local123, this.getParameter("suppress_sha") != null);
				if (local258 == null) {
					return;
				}
			}
			if (Class194.aClass196Array1 != null) {
				@Pc(378) String local378 = System.getProperty("os.name").toLowerCase();
				if (local378.startsWith("win")) {
					local297 = System.getProperty("os.arch").toLowerCase();
					@Pc(397) byte local397;
					if (local297.startsWith("amd64") || local297.startsWith("x86_64")) {
						local397 = 2;
					} else {
						local397 = 0;
					}
					@Pc(415) byte[] local415 = this.method4811(Class194.aClass196Array1[local397], local123, this.getParameter("suppress_sha") != null);
					if (local415 == null) {
						return;
					}
				}
			}
			@Pc(422) Class local422 = Class.forName("Class198");
			local134.aHashtable1.put(local422.getName(), local422);
			@Pc(432) Class local432 = Class.forName("Class199");
			local134.aHashtable1.put(local432.getName(), local432);
			@Pc(442) Class local442 = Class.forName("Class200");
			local134.aHashtable1.put(local442.getName(), local442);
			@Pc(452) Class local452 = Class.forName("Class201");
			local134.aHashtable1.put(local452.getName(), local452);
			@Pc(462) Class local462 = Class.forName("Interface6");
			local134.aHashtable1.put(local462.getName(), local462);
			@Pc(473) Class local473 = local134.loadClass("client");
			synchronized (this) {
				if (this.aBoolean396) {
					return;
				}
				this.anApplet2 = (Applet) local473.getDeclaredConstructor().newInstance();
				local473.getMethod("providesignlink", local432).invoke(null, local123);
				this.anApplet2.init();
				if (this.aBoolean395) {
					this.anApplet2.start();
				}
				if (this.aBoolean393) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(532) Exception local532) {
			RuntimeException_Sub2.anInt5744 = 1935945671;
			if (local532 instanceof InvocationTargetException) {
				@Pc(541) Throwable local541 = ((InvocationTargetException) local532).getTargetException();
				if (local541 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method4789(local541, local532.toString(), this);
			} else {
				RuntimeException_Sub2.method4789(local532, null, this);
			}
			this.method4813("crash");
		}
	}
}
