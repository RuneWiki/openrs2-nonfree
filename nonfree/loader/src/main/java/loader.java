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
	private static String aString380;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString381;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString382;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt6105;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt6108;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean425 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean424 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean427 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean426 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt6107 = 0;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt6106 = 32;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!b;[BZB)Z")
	private boolean method4893(@OriginalArg(0) Class194 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg1);
			@Pc(22) byte[] local22 = local9.digest();
			for (@Pc(24) int local24 = 0; local24 < 20; local24++) {
				if (local22[local24] != arg0.anIntArray682[local24]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(45) Exception local45) {
			this.method4894("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean424 = true;
		this.aBoolean427 = this.aBoolean426 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method4894(@OriginalArg(1) String arg0) {
		if (this.aBoolean425) {
			return;
		}
		this.aBoolean425 = true;
		try {
			if (aString380 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString380 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILloader!b;)[B")
	private byte[] method4895(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class194 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(21) byte[] local21 = new byte[arg1.anInt6101];
		try {
			@Pc(63) InputStream local63;
			if (arg0) {
				@Pc(26) URL local26 = this.getCodeBase();
				@Pc(34) Socket local34 = new Socket(InetAddress.getByName(local26.getHost()), 443);
				local34.setSoTimeout(10000);
				@Pc(40) OutputStream local40 = local34.getOutputStream();
				local40.write(17);
				local40.write(("JAGGRAB " + local26.getFile() + arg1.aString378 + "\n\n").getBytes());
				local63 = local34.getInputStream();
			} else {
				local63 = (new URL(this.getCodeBase(), arg1.aString378)).openStream();
			}
			@Pc(76) int local76 = -1;
			@Pc(86) int local86 = 0;
			while (local86 < local21.length) {
				@Pc(100) int local100 = local21.length - local86;
				if (local100 > 1000) {
					local100 = 1000;
				}
				@Pc(113) int local113 = local63.read(local21, local86, local100);
				if (local113 < 0) {
					throw new EOFException();
				}
				local86 += local113;
				@Pc(134) int local134 = local86 * 100 / local21.length;
				if (local134 != local76) {
					try {
						@Pc(145) Graphics local145 = this.getGraphics();
						if (local145 == null) {
							this.repaint();
						} else {
							local145.setColor(Color.black);
							local145.fillRect(0, 0, this.anInt6105, this.anInt6108);
							local76 = local134;
							local145.setColor(local17);
							local145.drawRect(this.anInt6105 / 2 - 152, this.anInt6108 / 2 - 18, 303, 33);
							@Pc(196) String local196 = arg1.aStringArray45[this.anInt6107] + " - " + local134 + "%";
							local145.setFont(local8);
							local145.setColor(Color.white);
							local145.drawString(local196, (this.anInt6105 - local12.stringWidth(local196)) / 2, this.anInt6108 / 2 + 4);
						}
					} catch (@Pc(225) Exception local225) {
					}
				}
			}
			local63.close();
			if (arg1.anInt6101 != arg1.anInt6100) {
				@Pc(242) byte[] local242 = new byte[arg1.anInt6100];
				@Pc(247) Inflater local247 = new Inflater(true);
				local247.setInput(local21);
				local21 = local242;
				local247.inflate(local242);
			}
		} catch (@Pc(258) Exception local258) {
			return null;
		}
		return this.method4893(arg1, local21, false) ? local21 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILloader!pm;Lloader!b;)[B")
	private byte[] method4896(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class200 arg1, @OriginalArg(3) Class194 arg2) {
		@Pc(7) File local7;
		try {
			local7 = Class200.method4910(arg2.aString377, this.anInt6106, aString382);
		} catch (@Pc(9) Exception local9) {
			this.method4894("nocache");
			return null;
		}
		@Pc(26) byte[] local26 = this.method4897(local7);
		if (!this.method4893(arg2, local26, arg0)) {
			local26 = this.method4895(false, arg2);
			if (local26 == null) {
				local26 = this.method4895(true, arg2);
			}
			if (local26 == null) {
				this.method4894("download");
				return null;
			}
			if (!this.method4898(local26, local7)) {
				return null;
			}
			local26 = this.method4897(local7);
			if (!this.method4893(arg2, local26, false)) {
				this.method4894("mismatch");
				return null;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean426 = false;
		this.aBoolean427 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean424 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean427 = false;
		this.aBoolean426 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method4897(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(11) byte[] local11 = new byte[local8];
			@Pc(29) DataInputStream local29 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local29.readFully(local11, 0, local8);
			local29.close();
			return local11;
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;B)Z")
	private boolean method4898(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method4894("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString381 = this.getParameter("unsignedurl");
			if (aString381 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean425 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString381), "_parent");
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
			aString380 = this.getParameter("crashurl");
			aString382 = this.getParameter("cachesubdir");
			if (aString382 == null) {
				aString382 = "runescape";
			}
			this.anInt6105 = this.getSize().width;
			this.anInt6108 = this.getSize().height;
			try {
				@Pc(92) int local92 = Integer.parseInt(this.getParameter("modewhat"));
				this.anInt6106 += local92;
			} catch (@Pc(100) Exception local100) {
			}
			try {
				local42 = this.getParameter("lang");
				if (local42 != null) {
					this.anInt6107 = Integer.parseInt(local42);
				}
			} catch (@Pc(112) Exception local112) {
			}
			@Pc(121) Class200 local121;
			try {
				local121 = new Class200(this, this.anInt6106, aString382, 29);
			} catch (@Pc(123) Exception local123) {
				this.method4894("nocache");
				return;
			}
			@Pc(132) ClassLoader_Sub1 local132 = new ClassLoader_Sub1();
			@Pc(142) byte[] local142;
			try {
				Class.forName("java.util.jar.Pack200");
				local142 = this.method4896(false, local121, Class197.aClass194_2);
				if (local142 == null) {
					return;
				}
				local132.anUnpack2 = new unpack_Sub1(local142);
				@Pc(160) byte[] local160 = this.method4896(false, local121, Class197.aClass194_4);
				if (local160 == null) {
					return;
				}
				local132.anUnpack1 = new unpack_Sub1(local160);
			} catch (@Pc(171) Throwable local171) {
			}
			@Pc(253) byte[] local253;
			if (local132.anUnpack2 == null) {
				local142 = this.method4896(false, local121, Class197.aClass194_1);
				if (local142 == null) {
					return;
				}
				@Pc(189) ClassLoader_Sub1 local189 = new ClassLoader_Sub1();
				local189.anUnpack2 = new unpack(local142);
				@Pc(198) Class local198 = Class.forName("unpack");
				local189.aHashtable1.put(local198.getName(), local198);
				@Pc(209) Class local209 = local189.loadClass("unpackclass");
				@Pc(216) byte[] local216 = this.method4896(false, local121, Class197.aClass194_3);
				if (local216 == null) {
					return;
				}
				local132.anUnpack2 = (unpack) local209.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local216, Boolean.TRUE);
				local253 = this.method4896(false, local121, Class197.aClass194_5);
				if (local253 == null) {
					return;
				}
				local132.anUnpack1 = (unpack) local209.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local253, Boolean.TRUE);
			}
			@Pc(288) String local288 = System.getProperty("os.name").toLowerCase();
			@Pc(292) String local292 = System.getProperty("os.arch").toLowerCase();
			@Pc(310) byte local310;
			if (local288.startsWith("win")) {
				if (local292.startsWith("amd64") || local292.startsWith("x86_64")) {
					local310 = 4;
				} else {
					local310 = 0;
				}
			} else if (local288.startsWith("linux")) {
				local310 = 1;
			} else if (!local288.startsWith("mac")) {
				this.method4894("os");
				return;
			} else if (local292.startsWith("ppc")) {
				local310 = 2;
			} else {
				local310 = 3;
			}
			for (@Pc(337) int local337 = 0; local337 < Class197.aClass194ArrayArray1[local310].length; local337++) {
				local253 = this.method4896(this.getParameter("suppress_sha") != null, local121, Class197.aClass194ArrayArray1[local310][local337]);
				if (local253 == null) {
					return;
				}
			}
			if (Class197.aClass194Array1 != null) {
				@Pc(376) String local376 = System.getProperty("os.name").toLowerCase();
				if (local376.startsWith("win")) {
					local292 = System.getProperty("os.arch").toLowerCase();
					@Pc(395) byte local395;
					if (local292.startsWith("amd64") || local292.startsWith("x86_64")) {
						local395 = 2;
					} else {
						local395 = 0;
					}
					@Pc(413) byte[] local413 = this.method4896(this.getParameter("suppress_sha") != null, local121, Class197.aClass194Array1[local395]);
					if (local413 == null) {
						return;
					}
				}
			}
			@Pc(420) Class local420 = Class.forName("Class199");
			local132.aHashtable1.put(local420.getName(), local420);
			@Pc(430) Class local430 = Class.forName("Class200");
			local132.aHashtable1.put(local430.getName(), local430);
			@Pc(440) Class local440 = Class.forName("Class201");
			local132.aHashtable1.put(local440.getName(), local440);
			@Pc(450) Class local450 = Class.forName("Class198");
			local132.aHashtable1.put(local450.getName(), local450);
			@Pc(460) Class local460 = Class.forName("Interface6");
			local132.aHashtable1.put(local460.getName(), local460);
			@Pc(471) Class local471 = local132.loadClass("client");
			synchronized (this) {
				if (this.aBoolean424) {
					return;
				}
				this.anApplet2 = (Applet) local471.getDeclaredConstructor().newInstance();
				local471.getMethod("providesignlink", local430).invoke(null, local121);
				this.anApplet2.init();
				if (this.aBoolean427) {
					this.anApplet2.start();
				}
				if (this.aBoolean426) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(532) Exception local532) {
			RuntimeException_Sub2.anInt6103 = 1713832515;
			if (local532 instanceof InvocationTargetException) {
				@Pc(541) Throwable local541 = ((InvocationTargetException) local532).getTargetException();
				if (local541 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method4878(local541, this, local532.toString());
			} else {
				RuntimeException_Sub2.method4878(local532, this, null);
			}
			this.method4894("crash");
		}
	}
}
