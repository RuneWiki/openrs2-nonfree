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

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString76;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString77;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private static int anInt8076 = 0;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt8074;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt8077;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean498 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt8075 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean499 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean500 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean501 = false;

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean499 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!qn;BZLloader!g;)[B")
	private byte[] method6633(@OriginalArg(0) Class274 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class271 arg2) {
		@Pc(11) File local11;
		try {
			local11 = arg0.method6662(arg2.aString75);
		} catch (@Pc(13) Exception local13) {
			this.method6636("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method6634(local11);
		if (!this.method6635(arg1, local24, arg2)) {
			local24 = this.method6638(false, arg2);
			if (local24 == null) {
				local24 = this.method6638(true, arg2);
			}
			if (local24 == null) {
				this.method6636("download");
				return null;
			}
			if (!this.method6637(local24, local11)) {
				return null;
			}
			local24 = this.method6634(local11);
			if (!this.method6635(false, local24, arg2)) {
				this.method6636("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString76 = this.getParameter("unsignedurl");
			if (aString76 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(16) SecurityException local16) {
					this.aBoolean498 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString76), "_parent");
					} catch (@Pc(29) Exception local29) {
					}
					return;
				}
			}
			aString77 = this.getParameter("crashurl");
			@Pc(36) int local36 = 0;
			@Pc(40) String local40 = this.getParameter("cachesubdirid");
			if (local40 != null) {
				local36 = Integer.parseInt(local40);
				if (local36 < 0 || local36 >= Class270.aStringArray54.length) {
					local36 = 0;
				}
			}
			@Pc(59) String local59 = this.getParameter("colourid");
			if (local59 != null) {
				anInt8076 = Integer.parseInt(local59);
				if (anInt8076 < 0 || Class270.anIntArray552.length <= anInt8076) {
					anInt8076 = 0;
				}
			}
			this.anInt8074 = this.getSize().width;
			this.anInt8077 = this.getSize().height;
			@Pc(92) int local92 = 32;
			try {
				@Pc(97) int local97 = Integer.parseInt(this.getParameter("modewhat"));
				local92 += local97;
			} catch (@Pc(103) Exception local103) {
			}
			try {
				@Pc(107) String local107 = this.getParameter("lang");
				if (local107 != null) {
					this.anInt8075 = Integer.parseInt(local107);
				}
			} catch (@Pc(116) Exception local116) {
			}
			@Pc(126) Class274 local126;
			try {
				local126 = new Class274(this, local92, Class270.aStringArray54[local36], 30);
			} catch (@Pc(128) Exception local128) {
				this.method6636("nocache");
				return;
			}
			@Pc(135) unpack local135 = null;
			@Pc(145) byte[] local145;
			try {
				Class.forName("java.util.jar.Pack200");
				local145 = this.method6633(local126, false, Class270.aClass271_2);
				if (local145 == null) {
					return;
				}
				local135 = new unpack_Sub1(local145);
			} catch (@Pc(156) Throwable local156) {
			}
			if (local135 == null) {
				local145 = this.method6633(local126, false, Class270.aClass271_1);
				if (local145 == null) {
					return;
				}
				@Pc(175) unpack local175 = new unpack(local145);
				@Pc(180) ClassLoader_Sub1 local180 = new ClassLoader_Sub1(local175);
				@Pc(183) Class local183 = Class.forName("unpack");
				local180.method6619(local183, local183.getName());
				@Pc(193) Class local193 = local180.loadClass("unpackclass");
				@Pc(200) byte[] local200 = this.method6633(local126, false, Class270.aClass271_3);
				if (local200 == null) {
					return;
				}
				local135 = (unpack) local193.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local200, Boolean.TRUE);
			}
			@Pc(236) ClassLoader_Sub1 local236 = new ClassLoader_Sub1(local135);
			@Pc(238) byte local238 = -1;
			@Pc(242) String local242 = System.getProperty("os.name").toLowerCase();
			@Pc(246) String local246 = System.getProperty("os.arch").toLowerCase();
			if (local242.startsWith("win")) {
				if (local246.startsWith("amd64") || local246.startsWith("x86_64")) {
					local238 = 1;
				} else {
					local238 = 0;
				}
			} else if (local242.startsWith("linux")) {
				if (local246.startsWith("amd64") || local246.startsWith("x86_64")) {
					local238 = 3;
				} else {
					local238 = 2;
				}
			} else if (local242.startsWith("mac")) {
				if (local246.startsWith("ppc")) {
					local238 = 4;
				} else if (local246.startsWith("x86_64")) {
					local238 = 6;
				} else {
					local238 = 7;
				}
			}
			if (local238 != -1) {
				this.method6633(local126, this.getParameter("suppress_sha") != null, Class270.aClass271Array1[local238]);
			}
			if (Class270.aClass271Array2 != null) {
				local238 = -1;
				local242 = System.getProperty("os.name").toLowerCase();
				local246 = System.getProperty("os.arch").toLowerCase();
				if (local242.startsWith("win")) {
					if (local246.startsWith("amd64") || local246.startsWith("x86_64")) {
						local238 = 2;
					} else {
						local238 = 0;
					}
				}
				if (local238 != -1) {
					this.method6633(local126, this.getParameter("suppress_sha") != null, Class270.aClass271Array2[local238]);
				}
			}
			@Pc(381) Class local381 = Class.forName("Class269");
			local236.method6619(local381, local381.getName());
			@Pc(390) Class local390 = Class.forName("Class274");
			local236.method6619(local390, local390.getName());
			@Pc(399) Class local399 = Class.forName("Class273");
			local236.method6619(local399, local399.getName());
			@Pc(408) Class local408 = Class.forName("Class275");
			local236.method6619(local408, local408.getName());
			@Pc(417) Class local417 = Class.forName("Interface13");
			local236.method6619(local417, local417.getName());
			@Pc(427) Class local427 = local236.loadClass("client");
			synchronized (this) {
				if (this.aBoolean499) {
					return;
				}
				this.anApplet2 = (Applet) local427.getDeclaredConstructor().newInstance();
				local427.getMethod("providesignlink", local390).invoke(null, local126);
				this.anApplet2.init();
				if (this.aBoolean500) {
					this.anApplet2.start();
				}
				if (this.aBoolean501) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(487) Exception local487) {
			RuntimeException_Sub2.anInt8066 = 1331793520;
			if (local487 instanceof InvocationTargetException) {
				@Pc(503) Throwable local503 = ((InvocationTargetException) local487).getTargetException();
				if (local503 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6608(this, local487.toString(), local503);
			} else {
				RuntimeException_Sub2.method6608(this, null, local487);
			}
			this.method6636("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method6634(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(15) int local15 = (int) arg0.length();
			@Pc(26) DataInputStream local26 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(29) byte[] local29 = new byte[local15];
			local26.readFully(local29, 0, local15);
			local26.close();
			return local29;
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z[BILloader!g;)Z")
	private boolean method6635(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class271 arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(15) MessageDigest local15 = MessageDigest.getInstance("SHA");
			local15.reset();
			local15.update(arg1);
			@Pc(23) byte[] local23 = local15.digest();
			for (@Pc(25) int local25 = 0; local25 < 20; local25++) {
				if (local23[local25] != arg2.anIntArray554[local25]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(44) Exception local44) {
			this.method6636("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean501 = true;
		this.aBoolean500 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method6636(@OriginalArg(1) String arg0) {
		if (this.aBoolean498) {
			return;
		}
		this.aBoolean498 = true;
		try {
			if (aString77 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString77 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(49) Exception local49) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BBLjava/io/File;)Z")
	private boolean method6637(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method6636("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean500 = this.aBoolean501 = false;
		this.aBoolean499 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean500 = true;
		this.aBoolean501 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!g;I)[B")
	private byte[] method6638(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class271 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class270.anIntArray552[anInt8076]);
		@Pc(26) Color local26 = new Color(Class270.anIntArray553[anInt8076]);
		@Pc(30) byte[] local30 = new byte[arg1.anInt8069];
		try {
			@Pc(47) InputStream local47;
			if (arg0) {
				@Pc(52) URL local52 = this.getCodeBase();
				@Pc(60) Socket local60 = new Socket(InetAddress.getByName(local52.getHost()), 443);
				local60.setSoTimeout(10000);
				@Pc(66) OutputStream local66 = local60.getOutputStream();
				local66.write(17);
				local66.write(("JAGGRAB " + local52.getFile() + arg1.aString74 + "\n\n").getBytes());
				local47 = local60.getInputStream();
			} else {
				local47 = (new URL(this.getCodeBase(), arg1.aString74)).openStream();
			}
			@Pc(91) int local91 = -1;
			@Pc(93) int local93 = 0;
			while (local30.length > local93) {
				@Pc(106) int local106 = local30.length - local93;
				if (local106 > 1000) {
					local106 = 1000;
				}
				@Pc(118) int local118 = local47.read(local30, local93, local106);
				if (local118 < 0) {
					throw new EOFException();
				}
				local93 += local118;
				@Pc(137) int local137 = local93 * 100 / local30.length;
				if (local91 != local137) {
					try {
						@Pc(148) Graphics local148 = this.getGraphics();
						if (local148 == null) {
							this.repaint();
						} else {
							local148.setColor(Color.black);
							local148.fillRect(0, 0, this.anInt8074, this.anInt8077);
							local148.setColor(local19);
							local148.drawRect(this.anInt8074 / 2 - 152, this.anInt8077 / 2 - 18, 303, 33);
							@Pc(198) String local198 = arg1.aStringArray55[this.anInt8075] + " - " + local137 + "%";
							local148.setFont(local8);
							local148.setColor(local26);
							local91 = local137;
							local148.drawString(local198, (this.anInt8074 - local12.stringWidth(local198)) / 2, this.anInt8077 / 2 + 4);
						}
					} catch (@Pc(229) Exception local229) {
					}
				}
			}
			local47.close();
			if (arg1.anInt8069 != arg1.anInt8068) {
				@Pc(247) byte[] local247 = new byte[arg1.anInt8068];
				@Pc(252) Inflater local252 = new Inflater(true);
				local252.setInput(local30);
				local30 = local247;
				local252.inflate(local247);
			}
		} catch (@Pc(263) Exception local263) {
			return null;
		}
		return this.method6635(false, local30, arg1) ? local30 : null;
	}
}
