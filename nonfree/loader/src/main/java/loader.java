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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/lang/String;")
	private static String aString456;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString457;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString458;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt6329;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt6330;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean421 = false;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean420 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt6332 = 0;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean422 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt6331 = 32;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Z")
	private boolean aBoolean423 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method4798(@OriginalArg(1) String arg0) {
		if (this.aBoolean422) {
			return;
		}
		this.aBoolean422 = true;
		try {
			if (aString458 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString458 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(49) Exception local49) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString457 = this.getParameter("unsignedurl");
			if (aString457 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean422 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString457), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			@Pc(36) String local36 = this.getParameter("pre142url");
			@Pc(42) String local42;
			if (local36 != null) {
				try {
					local42 = System.getProperty("java.version");
					if (local42.startsWith("1.3.") || local42.startsWith("1.4.0") || local42.startsWith("1.4.1")) {
						this.getAppletContext().showDocument(new URL(local36), "_self");
					}
				} catch (@Pc(64) Exception local64) {
				}
			}
			aString458 = this.getParameter("crashurl");
			aString456 = this.getParameter("cachesubdir");
			if (aString456 == null) {
				aString456 = "runescape";
			}
			this.anInt6330 = this.getSize().width;
			this.anInt6329 = this.getSize().height;
			try {
				@Pc(92) int local92 = Integer.parseInt(this.getParameter("modewhat"));
				this.anInt6331 += local92;
			} catch (@Pc(100) Exception local100) {
			}
			try {
				local42 = this.getParameter("lang");
				if (local42 != null) {
					this.anInt6332 = Integer.parseInt(local42);
				}
			} catch (@Pc(113) Exception local113) {
			}
			@Pc(122) Class202 local122;
			try {
				local122 = new Class202(this, this.anInt6331, aString456, 29);
			} catch (@Pc(124) Exception local124) {
				this.method4798("nocache");
				return;
			}
			@Pc(133) ClassLoader_Sub1 local133 = new ClassLoader_Sub1();
			@Pc(143) byte[] local143;
			try {
				Class.forName("java.util.jar.Pack200");
				local143 = this.method4802(local122, Class201.aClass200_2, false);
				if (local143 == null) {
					return;
				}
				local133.anUnpack1 = new unpack_Sub1(local143);
				@Pc(159) byte[] local159 = this.method4802(local122, Class201.aClass200_4, false);
				if (local159 == null) {
					return;
				}
				local133.anUnpack2 = new unpack_Sub1(local159);
			} catch (@Pc(171) Throwable local171) {
			}
			@Pc(257) byte[] local257;
			if (local133.anUnpack1 == null) {
				local143 = this.method4802(local122, Class201.aClass200_1, false);
				if (local143 == null) {
					return;
				}
				@Pc(192) ClassLoader_Sub1 local192 = new ClassLoader_Sub1();
				local192.anUnpack1 = new unpack(local143);
				@Pc(201) Class local201 = Class.forName("unpack");
				local192.aHashtable1.put(local201.getName(), local201);
				@Pc(212) Class local212 = local192.loadClass("unpackclass");
				@Pc(219) byte[] local219 = this.method4802(local122, Class201.aClass200_3, false);
				if (local219 == null) {
					return;
				}
				local133.anUnpack1 = (unpack) local212.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local219, Boolean.TRUE);
				local257 = this.method4802(local122, Class201.aClass200_5, false);
				if (local257 == null) {
					return;
				}
				local133.anUnpack2 = (unpack) local212.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local257, Boolean.TRUE);
			}
			@Pc(293) String local293 = System.getProperty("os.name").toLowerCase();
			@Pc(297) String local297 = System.getProperty("os.arch").toLowerCase();
			@Pc(320) byte local320;
			if (local293.startsWith("win")) {
				if (local297.startsWith("amd64") || local297.startsWith("x86_64")) {
					local320 = 4;
				} else {
					local320 = 0;
				}
			} else if (local293.startsWith("linux")) {
				local320 = 1;
			} else if (!local293.startsWith("mac")) {
				this.method4798("os");
				return;
			} else if (local297.startsWith("ppc")) {
				local320 = 2;
			} else {
				local320 = 3;
			}
			for (@Pc(342) int local342 = 0; local342 < Class201.aClass200ArrayArray1[local320].length; local342++) {
				local257 = this.method4802(local122, Class201.aClass200ArrayArray1[local320][local342], this.getParameter("suppress_sha") != null);
				if (local257 == null) {
					return;
				}
			}
			if (Class201.aClass200Array1 != null) {
				@Pc(382) String local382 = System.getProperty("os.name").toLowerCase();
				if (local382.startsWith("win")) {
					local297 = System.getProperty("os.arch").toLowerCase();
					@Pc(400) byte local400;
					if (local297.startsWith("amd64") || local297.startsWith("x86_64")) {
						local400 = 2;
					} else {
						local400 = 0;
					}
					@Pc(418) byte[] local418 = this.method4802(local122, Class201.aClass200Array1[local400], this.getParameter("suppress_sha") != null);
					if (local418 == null) {
						return;
					}
				}
			}
			@Pc(424) Class local424 = Class.forName("Class196");
			local133.aHashtable1.put(local424.getName(), local424);
			@Pc(434) Class local434 = Class.forName("Class202");
			local133.aHashtable1.put(local434.getName(), local434);
			@Pc(444) Class local444 = Class.forName("Class199");
			local133.aHashtable1.put(local444.getName(), local444);
			@Pc(454) Class local454 = Class.forName("Class203");
			local133.aHashtable1.put(local454.getName(), local454);
			@Pc(464) Class local464 = Class.forName("Interface6");
			local133.aHashtable1.put(local464.getName(), local464);
			@Pc(475) Class local475 = local133.loadClass("client");
			synchronized (this) {
				if (this.aBoolean420) {
					return;
				}
				this.anApplet2 = (Applet) local475.getDeclaredConstructor().newInstance();
				local475.getMethod("providesignlink", local434).invoke(null, local122);
				this.anApplet2.init();
				if (this.aBoolean423) {
					this.anApplet2.start();
				}
				if (this.aBoolean421) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(535) Exception local535) {
			RuntimeException_Sub2.anInt6320 = 469295036;
			if (local535 instanceof InvocationTargetException) {
				@Pc(551) Throwable local551 = ((InvocationTargetException) local535).getTargetException();
				if (local551 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method4783(this, local551, local535.toString());
			} else {
				RuntimeException_Sub2.method4783(this, local535, null);
			}
			this.method4798("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean423 = this.aBoolean421 = false;
		this.aBoolean420 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZB[BLloader!f;)Z")
	private boolean method4799(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class200 arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg1);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(24) int local24 = 0; local24 < 20; local24++) {
				if (arg2.anIntArray572[local24] != local17[local24]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(43) Exception local43) {
			this.method4798("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean420 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BI)Z")
	private boolean method4800(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(10) FileOutputStream local10 = new FileOutputStream(arg0);
			local10.write(arg1, 0, arg1.length);
			local10.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method4798("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!f;I)[B")
	private byte[] method4801(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class200 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(21) byte[] local21 = new byte[arg1.anInt6326];
		try {
			@Pc(63) InputStream local63;
			if (arg0) {
				@Pc(26) URL local26 = this.getCodeBase();
				@Pc(34) Socket local34 = new Socket(InetAddress.getByName(local26.getHost()), 443);
				local34.setSoTimeout(10000);
				@Pc(40) OutputStream local40 = local34.getOutputStream();
				local40.write(17);
				local40.write(("JAGGRAB " + local26.getFile() + arg1.aString454 + "\n\n").getBytes());
				local63 = local34.getInputStream();
			} else {
				local63 = (new URL(this.getCodeBase(), arg1.aString454)).openStream();
			}
			@Pc(76) int local76 = 0;
			@Pc(84) int local84 = -1;
			while (local21.length > local76) {
				@Pc(98) int local98 = local21.length - local76;
				if (local98 > 1000) {
					local98 = 1000;
				}
				@Pc(109) int local109 = local63.read(local21, local76, local98);
				if (local109 < 0) {
					throw new EOFException();
				}
				local76 += local109;
				@Pc(127) int local127 = local76 * 100 / local21.length;
				if (local127 != local84) {
					try {
						@Pc(133) Graphics local133 = this.getGraphics();
						if (local133 == null) {
							this.repaint();
						} else {
							local84 = local127;
							local133.setColor(Color.black);
							local133.fillRect(0, 0, this.anInt6330, this.anInt6329);
							local133.setColor(local17);
							local133.drawRect(this.anInt6330 / 2 - 152, this.anInt6329 / 2 + -18, 303, 33);
							@Pc(189) String local189 = arg1.aStringArray52[this.anInt6332] + " - " + local127 + "%";
							local133.setFont(local8);
							local133.setColor(Color.white);
							local133.drawString(local189, (this.anInt6330 - local12.stringWidth(local189)) / 2, this.anInt6329 / 2 + 4);
						}
					} catch (@Pc(214) Exception local214) {
					}
				}
			}
			local63.close();
			if (arg1.anInt6327 != arg1.anInt6326) {
				@Pc(227) byte[] local227 = new byte[arg1.anInt6327];
				@Pc(232) Inflater local232 = new Inflater(true);
				local232.setInput(local21);
				local232.inflate(local227);
				local21 = local227;
			}
		} catch (@Pc(243) Exception local243) {
			return null;
		}
		return this.method4799(false, local21, arg1) ? local21 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!na;ILloader!f;Z)[B")
	private byte[] method4802(@OriginalArg(0) Class202 arg0, @OriginalArg(2) Class200 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(7) File local7;
		try {
			local7 = Class202.method4824(aString456, this.anInt6331, arg1.aString455);
		} catch (@Pc(15) Exception local15) {
			this.method4798("nocache");
			return null;
		}
		@Pc(26) byte[] local26 = this.method4803(local7);
		if (!this.method4799(arg2, local26, arg1)) {
			local26 = this.method4801(false, arg1);
			if (local26 == null) {
				local26 = this.method4801(true, arg1);
			}
			if (local26 == null) {
				this.method4798("download");
				return null;
			}
			if (!this.method4800(local7, local26)) {
				return null;
			}
			local26 = this.method4803(local7);
			if (!this.method4799(false, local26, arg1)) {
				this.method4798("mismatch");
				return null;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean423 = true;
		this.aBoolean421 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;Z)[B")
	private byte[] method4803(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(12) byte[] local12 = new byte[local9];
			@Pc(23) DataInputStream local23 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local23.readFully(local12, 0, local9);
			local23.close();
			return local12;
		} catch (@Pc(33) IOException local33) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean421 = true;
		this.aBoolean423 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}
}
