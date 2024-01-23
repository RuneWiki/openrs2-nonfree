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
	private static String aString198;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString199;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString200;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt5957;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt5958;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean429 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean430 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt5959 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt5956 = 32;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean431 = false;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Z")
	private boolean aBoolean432 = false;

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean429 = true;
		this.aBoolean432 = this.aBoolean431 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method4693(@OriginalArg(0) String arg0) {
		if (this.aBoolean430) {
			return;
		}
		this.aBoolean430 = true;
		try {
			if (aString198 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString198 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;B)Z")
	private boolean method4694(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method4693("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!g;B)[B")
	private byte[] method4695(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class200 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(21) byte[] local21 = new byte[arg1.anInt5954];
		try {
			@Pc(40) InputStream local40;
			if (arg0) {
				@Pc(45) URL local45 = this.getCodeBase();
				@Pc(53) Socket local53 = new Socket(InetAddress.getByName(local45.getHost()), 443);
				local53.setSoTimeout(10000);
				@Pc(59) OutputStream local59 = local53.getOutputStream();
				local59.write(17);
				local59.write(("JAGGRAB " + local45.getFile() + arg1.aString196 + "\n\n").getBytes());
				local40 = local53.getInputStream();
			} else {
				local40 = (new URL(this.getCodeBase(), arg1.aString196)).openStream();
			}
			@Pc(84) int local84 = 0;
			@Pc(86) int local86 = -1;
			while (local21.length > local84) {
				@Pc(100) int local100 = local21.length - local84;
				if (local100 > 1000) {
					local100 = 1000;
				}
				@Pc(113) int local113 = local40.read(local21, local84, local100);
				if (local113 < 0) {
					throw new EOFException();
				}
				local84 += local113;
				@Pc(133) int local133 = local84 * 100 / local21.length;
				if (local133 != local86) {
					try {
						@Pc(143) Graphics local143 = this.getGraphics();
						if (local143 == null) {
							this.repaint();
						} else {
							local143.setColor(Color.black);
							local143.fillRect(0, 0, this.anInt5957, this.anInt5958);
							local86 = local133;
							local143.setColor(local17);
							local143.drawRect(this.anInt5957 / 2 - 152, this.anInt5958 / 2 + -18, 303, 33);
							@Pc(199) String local199 = arg1.aStringArray48[this.anInt5959] + " - " + local133 + "%";
							local143.setFont(local8);
							local143.setColor(Color.white);
							local143.drawString(local199, (this.anInt5957 - local12.stringWidth(local199)) / 2, this.anInt5958 / 2 + 4);
						}
					} catch (@Pc(225) Exception local225) {
					}
				}
			}
			local40.close();
			if (arg1.anInt5953 != arg1.anInt5954) {
				@Pc(243) byte[] local243 = new byte[arg1.anInt5953];
				@Pc(248) Inflater local248 = new Inflater(true);
				local248.setInput(local21);
				local21 = local243;
				local248.inflate(local243);
			}
		} catch (@Pc(259) Exception local259) {
			return null;
		}
		return this.method4696(arg1, false, local21) ? local21 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean432 = false;
		this.aBoolean431 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!g;Z[B)Z")
	private boolean method4696(@OriginalArg(1) Class200 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null) {
				return false;
			}
			@Pc(19) MessageDigest local19 = MessageDigest.getInstance("SHA");
			local19.reset();
			local19.update(arg2);
			@Pc(27) byte[] local27 = local19.digest();
			for (@Pc(29) int local29 = 0; local29 < 20; local29++) {
				if (arg0.anIntArray538[local29] != local27[local29]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(50) Exception local50) {
			this.method4693("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean429 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString200 = this.getParameter("unsignedurl");
			if (aString200 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean430 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString200), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			@Pc(36) String local36 = this.getParameter("pre142url");
			@Pc(43) String local43;
			if (local36 != null) {
				try {
					local43 = System.getProperty("java.version");
					if (local43.startsWith("1.3.") || local43.startsWith("1.4.0") || local43.startsWith("1.4.1")) {
						this.getAppletContext().showDocument(new URL(local36), "_self");
					}
				} catch (@Pc(65) Exception local65) {
				}
			}
			aString198 = this.getParameter("crashurl");
			aString199 = this.getParameter("cachesubdir");
			if (aString199 == null) {
				aString199 = "runescape";
			}
			this.anInt5957 = this.getSize().width;
			this.anInt5958 = this.getSize().height;
			try {
				@Pc(93) int local93 = Integer.parseInt(this.getParameter("modewhat"));
				this.anInt5956 += local93;
			} catch (@Pc(101) Exception local101) {
			}
			try {
				local43 = this.getParameter("lang");
				if (local43 != null) {
					this.anInt5959 = Integer.parseInt(local43);
				}
			} catch (@Pc(114) Exception local114) {
			}
			@Pc(123) Class202 local123;
			try {
				local123 = new Class202(this, this.anInt5956, aString199, 29);
			} catch (@Pc(125) Exception local125) {
				this.method4693("nocache");
				return;
			}
			@Pc(134) ClassLoader_Sub1 local134 = new ClassLoader_Sub1();
			@Pc(144) byte[] local144;
			try {
				Class.forName("java.util.jar.Pack200");
				local144 = this.method4698(local123, false, Class199.aClass200_2);
				if (local144 == null) {
					return;
				}
				local134.anUnpack1 = new unpack_Sub1(local144);
				@Pc(161) byte[] local161 = this.method4698(local123, false, Class199.aClass200_4);
				if (local161 == null) {
					return;
				}
				local134.anUnpack2 = new unpack_Sub1(local161);
			} catch (@Pc(173) Throwable local173) {
			}
			@Pc(257) byte[] local257;
			if (local134.anUnpack1 == null) {
				local144 = this.method4698(local123, false, Class199.aClass200_1);
				if (local144 == null) {
					return;
				}
				@Pc(192) ClassLoader_Sub1 local192 = new ClassLoader_Sub1();
				local192.anUnpack1 = new unpack(local144);
				@Pc(201) Class local201 = Class.forName("unpack");
				local192.aHashtable1.put(local201.getName(), local201);
				@Pc(212) Class local212 = local192.loadClass("unpackclass");
				@Pc(219) byte[] local219 = this.method4698(local123, false, Class199.aClass200_3);
				if (local219 == null) {
					return;
				}
				local134.anUnpack1 = (unpack) local212.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local219, Boolean.TRUE);
				local257 = this.method4698(local123, false, Class199.aClass200_5);
				if (local257 == null) {
					return;
				}
				local134.anUnpack2 = (unpack) local212.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local257, Boolean.TRUE);
			}
			@Pc(293) String local293 = System.getProperty("os.name").toLowerCase();
			@Pc(297) String local297 = System.getProperty("os.arch").toLowerCase();
			@Pc(307) byte local307;
			if (local293.startsWith("win")) {
				if (local297.startsWith("amd64") || local297.startsWith("x86_64")) {
					local307 = 4;
				} else {
					local307 = 0;
				}
			} else if (local293.startsWith("linux")) {
				local307 = 1;
			} else if (!local293.startsWith("mac")) {
				this.method4693("os");
				return;
			} else if (local297.startsWith("ppc")) {
				local307 = 2;
			} else {
				local307 = 3;
			}
			for (@Pc(342) int local342 = 0; local342 < Class199.aClass200ArrayArray1[local307].length; local342++) {
				local257 = this.method4698(local123, this.getParameter("suppress_sha") != null, Class199.aClass200ArrayArray1[local307][local342]);
				if (local257 == null) {
					return;
				}
			}
			if (Class199.aClass200Array1 != null) {
				@Pc(379) String local379 = System.getProperty("os.name").toLowerCase();
				if (local379.startsWith("win")) {
					local297 = System.getProperty("os.arch").toLowerCase();
					@Pc(397) byte local397;
					if (local297.startsWith("amd64") || local297.startsWith("x86_64")) {
						local397 = 2;
					} else {
						local397 = 0;
					}
					@Pc(416) byte[] local416 = this.method4698(local123, this.getParameter("suppress_sha") != null, Class199.aClass200Array1[local397]);
					if (local416 == null) {
						return;
					}
				}
			}
			@Pc(422) Class local422 = Class.forName("Class203");
			local134.aHashtable1.put(local422.getName(), local422);
			@Pc(432) Class local432 = Class.forName("Class202");
			local134.aHashtable1.put(local432.getName(), local432);
			@Pc(442) Class local442 = Class.forName("Class197");
			local134.aHashtable1.put(local442.getName(), local442);
			@Pc(452) Class local452 = Class.forName("Class201");
			local134.aHashtable1.put(local452.getName(), local452);
			@Pc(462) Class local462 = Class.forName("Interface6");
			local134.aHashtable1.put(local462.getName(), local462);
			@Pc(473) Class local473 = local134.loadClass("client");
			synchronized (this) {
				if (this.aBoolean429) {
					return;
				}
				this.anApplet2 = (Applet) local473.getDeclaredConstructor().newInstance();
				local473.getMethod("providesignlink", local432).invoke(null, local123);
				this.anApplet2.init();
				if (this.aBoolean432) {
					this.anApplet2.start();
				}
				if (this.aBoolean431) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(532) Exception local532) {
			RuntimeException_Sub2.anInt5951 = -2039003541;
			if (local532 instanceof InvocationTargetException) {
				@Pc(548) Throwable local548 = ((InvocationTargetException) local532).getTargetException();
				if (local548 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method4678(local532.toString(), this, local548);
			} else {
				RuntimeException_Sub2.method4678(null, this, local532);
			}
			this.method4693("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method4697(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(24) byte[] local24 = new byte[local9];
			@Pc(35) DataInputStream local35 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local35.readFully(local24, 0, local9);
			local35.close();
			return local24;
		} catch (@Pc(45) IOException local45) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!nf;ZLloader!g;Z)[B")
	private byte[] method4698(@OriginalArg(0) Class202 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class200 arg2) {
		@Pc(16) File local16;
		try {
			local16 = Class202.method4701(aString199, this.anInt5956, arg2.aString197);
		} catch (@Pc(18) Exception local18) {
			this.method4693("nocache");
			return null;
		}
		@Pc(29) byte[] local29 = this.method4697(local16);
		if (!this.method4696(arg2, arg1, local29)) {
			local29 = this.method4695(false, arg2);
			if (local29 == null) {
				local29 = this.method4695(true, arg2);
			}
			if (local29 == null) {
				this.method4693("download");
				return null;
			}
			if (!this.method4694(local29, local16)) {
				return null;
			}
			local29 = this.method4697(local16);
			if (!this.method4696(arg2, false, local29)) {
				this.method4693("mismatch");
				return null;
			}
		}
		return local29;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean432 = true;
		this.aBoolean431 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}
}
