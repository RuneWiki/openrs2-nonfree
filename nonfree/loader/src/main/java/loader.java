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

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString76;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString77;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private static int anInt7656 = 0;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt7657;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt7658;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean502 = false;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean503 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt7659 = 0;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean504 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean505 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/io/File;)[B")
	private byte[] method6135(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(25) DataInputStream local25 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(28) byte[] local28 = new byte[local8];
			local25.readFully(local28, 0, local8);
			local25.close();
			return local28;
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean505 = true;
		this.aBoolean503 = this.aBoolean504 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLloader!b;Z)Z")
	private boolean method6136(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class273 arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg0);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(19) int local19 = 0; local19 < 20; local19++) {
				if (arg1.anIntArray751[local19] != local17[local19]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(44) Exception local44) {
			this.method6140("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!lt;ILloader!b;)[B")
	private byte[] method6137(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class279 arg1, @OriginalArg(3) Class273 arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg1.method6149(arg2.aString73);
		} catch (@Pc(7) Exception local7) {
			this.method6140("nocache");
			return null;
		}
		@Pc(18) byte[] local18 = this.method6135(local5);
		if (!this.method6136(local18, arg2, arg0)) {
			local18 = this.method6139(arg2, false);
			if (local18 == null) {
				local18 = this.method6139(arg2, true);
			}
			if (local18 == null) {
				this.method6140("download");
				return null;
			}
			if (!this.method6138(local18, local5)) {
				return null;
			}
			local18 = this.method6135(local5);
			if (!this.method6136(local18, arg2, false)) {
				this.method6140("mismatch");
				return null;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString77 = this.getParameter("unsignedurl");
			if (aString77 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean502 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString77), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString76 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || Class274.aStringArray62.length <= local38) {
					local38 = 0;
				}
			}
			@Pc(64) String local64 = this.getParameter("colourid");
			if (local64 != null) {
				anInt7656 = Integer.parseInt(local64);
				if (anInt7656 < 0 || Class274.anIntArray753.length <= anInt7656) {
					anInt7656 = 0;
				}
			}
			this.anInt7658 = this.getSize().width;
			this.anInt7657 = this.getSize().height;
			@Pc(91) int local91 = 32;
			try {
				@Pc(96) int local96 = Integer.parseInt(this.getParameter("modewhat"));
				local91 += local96;
			} catch (@Pc(102) Exception local102) {
			}
			try {
				@Pc(106) String local106 = this.getParameter("lang");
				if (local106 != null) {
					this.anInt7659 = Integer.parseInt(local106);
				}
			} catch (@Pc(115) Exception local115) {
			}
			@Pc(125) Class279 local125;
			try {
				local125 = new Class279(this, local91, Class274.aStringArray62[local38], 30);
			} catch (@Pc(127) Exception local127) {
				this.method6140("nocache");
				return;
			}
			@Pc(134) unpack local134 = null;
			@Pc(144) byte[] local144;
			try {
				Class.forName("java.util.jar.Pack200");
				local144 = this.method6137(false, local125, Class274.aClass273_2);
				if (local144 == null) {
					return;
				}
				local134 = new unpack_Sub1(local144);
			} catch (@Pc(156) Throwable local156) {
			}
			if (local134 == null) {
				local144 = this.method6137(false, local125, Class274.aClass273_1);
				if (local144 == null) {
					return;
				}
				@Pc(175) unpack local175 = new unpack(local144);
				@Pc(180) ClassLoader_Sub1 local180 = new ClassLoader_Sub1(local175);
				@Pc(183) Class local183 = Class.forName("unpack");
				local180.method6127(local183.getName(), local183);
				@Pc(193) Class local193 = local180.loadClass("unpackclass");
				@Pc(200) byte[] local200 = this.method6137(false, local125, Class274.aClass273_3);
				if (local200 == null) {
					return;
				}
				local134 = (unpack) local193.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local200, Boolean.TRUE);
			}
			@Pc(235) ClassLoader_Sub1 local235 = new ClassLoader_Sub1(local134);
			@Pc(237) byte local237 = -1;
			@Pc(241) String local241 = System.getProperty("os.name").toLowerCase();
			@Pc(245) String local245 = System.getProperty("os.arch").toLowerCase();
			if (local241.startsWith("win")) {
				if (local245.startsWith("amd64") || local245.startsWith("x86_64")) {
					local237 = 1;
				} else {
					local237 = 0;
				}
			} else if (local241.startsWith("linux")) {
				if (local245.startsWith("amd64") || local245.startsWith("x86_64")) {
					local237 = 3;
				} else {
					local237 = 2;
				}
			} else if (local241.startsWith("mac")) {
				if (local245.startsWith("ppc")) {
					local237 = 4;
				} else if (local245.startsWith("x86_64")) {
					local237 = 6;
				} else {
					local237 = 7;
				}
			}
			if (local237 != -1) {
				this.method6137(this.getParameter("suppress_sha") != null, local125, Class274.aClass273Array1[local237]);
			}
			if (Class274.aClass273Array2 != null) {
				local237 = -1;
				local241 = System.getProperty("os.name").toLowerCase();
				local245 = System.getProperty("os.arch").toLowerCase();
				if (local241.startsWith("win")) {
					if (local245.startsWith("amd64") || local245.startsWith("x86_64")) {
						local237 = 2;
					} else {
						local237 = 0;
					}
				}
				if (local237 != -1) {
					this.method6137(this.getParameter("suppress_sha") != null, local125, Class274.aClass273Array2[local237]);
				}
			}
			if (Class274.aClass273Array3 != null) {
				local237 = -1;
				local241 = System.getProperty("os.name").toLowerCase();
				local245 = System.getProperty("os.arch").toLowerCase();
				if (local241.startsWith("win") && !local245.startsWith("amd64") && !local245.startsWith("x86_64")) {
					local237 = 0;
				}
				if (local237 != -1) {
					this.method6137(this.getParameter("suppress_sha") != null, local125, Class274.aClass273Array3[local237]);
				}
			}
			@Pc(426) Class local426 = Class.forName("Class277");
			local235.method6127(local426.getName(), local426);
			@Pc(435) Class local435 = Class.forName("Class279");
			local235.method6127(local435.getName(), local435);
			@Pc(444) Class local444 = Class.forName("Class280");
			local235.method6127(local444.getName(), local444);
			@Pc(453) Class local453 = Class.forName("Class278");
			local235.method6127(local453.getName(), local453);
			@Pc(462) Class local462 = Class.forName("Interface14");
			local235.method6127(local462.getName(), local462);
			@Pc(472) Class local472 = local235.loadClass("client");
			synchronized (this) {
				if (this.aBoolean505) {
					return;
				}
				this.anApplet2 = (Applet) local472.getDeclaredConstructor().newInstance();
				local472.getMethod("providesignlink", local435).invoke(null, local125);
				this.anApplet2.init();
				if (this.aBoolean503) {
					this.anApplet2.start();
				}
				if (this.aBoolean504) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(532) Exception local532) {
			RuntimeException_Sub2.anInt7654 = 1820590878;
			if (local532 instanceof InvocationTargetException) {
				@Pc(548) Throwable local548 = ((InvocationTargetException) local532).getTargetException();
				if (local548 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6109(this, local548, local532.toString());
			} else {
				RuntimeException_Sub2.method6109(this, local532, null);
			}
			this.method6140("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	private boolean method6138(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(13) FileOutputStream local13 = new FileOutputStream(arg1);
			local13.write(arg0, 0, arg0.length);
			local13.close();
			return true;
		} catch (@Pc(24) IOException local24) {
			this.method6140("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean504 = false;
		this.aBoolean503 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean504 = true;
		this.aBoolean503 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!b;Z)[B")
	private byte[] method6139(@OriginalArg(1) Class273 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class274.anIntArray753[anInt7656]);
		@Pc(26) Color local26 = new Color(Class274.anIntArray752[anInt7656]);
		@Pc(30) byte[] local30 = new byte[arg0.anInt7653];
		try {
			@Pc(84) InputStream local84;
			if (arg1) {
				@Pc(47) URL local47 = this.getCodeBase();
				@Pc(55) Socket local55 = new Socket(InetAddress.getByName(local47.getHost()), 443);
				local55.setSoTimeout(10000);
				@Pc(61) OutputStream local61 = local55.getOutputStream();
				local61.write(17);
				local61.write(("JAGGRAB " + local47.getFile() + arg0.aString74 + "\n\n").getBytes());
				local84 = local55.getInputStream();
			} else {
				local84 = (new URL(this.getCodeBase(), arg0.aString74)).openStream();
			}
			@Pc(97) int local97 = -1;
			@Pc(99) int local99 = 0;
			while (local30.length > local99) {
				@Pc(113) int local113 = local30.length - local99;
				if (local113 > 1000) {
					local113 = 1000;
				}
				@Pc(127) int local127 = local84.read(local30, local99, local113);
				if (local127 < 0) {
					throw new EOFException();
				}
				local99 += local127;
				@Pc(145) int local145 = local99 * 100 / local30.length;
				if (local145 != local97) {
					try {
						@Pc(151) Graphics local151 = this.getGraphics();
						if (local151 == null) {
							this.repaint();
						} else {
							local151.setColor(Color.black);
							local151.fillRect(0, 0, this.anInt7658, this.anInt7657);
							local151.setColor(local19);
							local151.drawRect(this.anInt7658 / 2 - 152, this.anInt7657 / 2 - 18, 303, 33);
							@Pc(204) String local204 = arg0.aStringArray61[this.anInt7659] + " - " + local145 + "%";
							local151.setFont(local8);
							local151.setColor(local26);
							local97 = local145;
							local151.drawString(local204, (this.anInt7658 - local12.stringWidth(local204)) / 2, this.anInt7657 / 2 + 4);
						}
					} catch (@Pc(232) Exception local232) {
					}
				}
			}
			local84.close();
			if (arg0.anInt7652 != arg0.anInt7653) {
				@Pc(249) byte[] local249 = new byte[arg0.anInt7652];
				@Pc(254) Inflater local254 = new Inflater(true);
				local254.setInput(local30);
				local254.inflate(local249);
				local30 = local249;
			}
		} catch (@Pc(265) Exception local265) {
			return null;
		}
		return this.method6136(local30, arg0, false) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean505 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private void method6140(@OriginalArg(1) String arg0) {
		if (this.aBoolean502) {
			return;
		}
		this.aBoolean502 = true;
		try {
			if (aString76 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString76 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(54) Exception local54) {
		}
	}
}
