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

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString83;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString84;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private static int anInt7282 = 0;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt7284;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt7285;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean499 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean498 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean500 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt7283 = 0;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean501 = false;

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method6043(@OriginalArg(1) String arg0) {
		if (this.aBoolean501) {
			return;
		}
		this.aBoolean501 = true;
		try {
			if (aString84 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString84 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString83 = this.getParameter("unsignedurl");
			if (aString83 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean501 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString83), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString84 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || local37 >= Class269.aStringArray48.length) {
					local37 = 0;
				}
			}
			@Pc(62) String local62 = this.getParameter("colourid");
			if (local62 != null) {
				anInt7282 = Integer.parseInt(local62);
				if (anInt7282 < 0 || anInt7282 >= Class269.anIntArray646.length) {
					anInt7282 = 0;
				}
			}
			this.anInt7285 = this.getSize().width;
			this.anInt7284 = this.getSize().height;
			@Pc(93) int local93 = 32;
			try {
				@Pc(98) int local98 = Integer.parseInt(this.getParameter("modewhat"));
				local93 += local98;
			} catch (@Pc(104) Exception local104) {
			}
			try {
				@Pc(108) String local108 = this.getParameter("lang");
				if (local108 != null) {
					this.anInt7283 = Integer.parseInt(local108);
				}
			} catch (@Pc(117) Exception local117) {
			}
			@Pc(127) Class272 local127;
			try {
				local127 = new Class272(this, local93, Class269.aStringArray48[local37], 30);
			} catch (@Pc(129) Exception local129) {
				this.method6043("nocache");
				return;
			}
			@Pc(136) unpack local136 = null;
			@Pc(146) byte[] local146;
			try {
				Class.forName("java.util.jar.Pack200");
				local146 = this.method6048(false, local127, Class269.aClass271_2);
				if (local146 == null) {
					return;
				}
				local136 = new unpack_Sub1(local146);
			} catch (@Pc(157) Throwable local157) {
			}
			if (local136 == null) {
				local146 = this.method6048(false, local127, Class269.aClass271_1);
				if (local146 == null) {
					return;
				}
				@Pc(177) unpack local177 = new unpack(local146);
				@Pc(182) ClassLoader_Sub1 local182 = new ClassLoader_Sub1(local177);
				@Pc(185) Class local185 = Class.forName("unpack");
				local182.method6006(local185, local185.getName());
				@Pc(195) Class local195 = local182.loadClass("unpackclass");
				@Pc(202) byte[] local202 = this.method6048(false, local127, Class269.aClass271_3);
				if (local202 == null) {
					return;
				}
				local136 = (unpack) local195.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local202, Boolean.TRUE);
			}
			@Pc(236) ClassLoader_Sub1 local236 = new ClassLoader_Sub1(local136);
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
				this.method6048(this.getParameter("suppress_sha") != null, local127, Class269.aClass271Array1[local238]);
			}
			if (Class269.aClass271Array2 != null) {
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
					this.method6048(this.getParameter("suppress_sha") != null, local127, Class269.aClass271Array2[local238]);
				}
			}
			@Pc(385) Class local385 = Class.forName("Class274");
			local236.method6006(local385, local385.getName());
			@Pc(394) Class local394 = Class.forName("Class272");
			local236.method6006(local394, local394.getName());
			@Pc(403) Class local403 = Class.forName("Class275");
			local236.method6006(local403, local403.getName());
			@Pc(412) Class local412 = Class.forName("Class273");
			local236.method6006(local412, local412.getName());
			@Pc(421) Class local421 = Class.forName("Interface13");
			local236.method6006(local421, local421.getName());
			@Pc(431) Class local431 = local236.loadClass("client");
			synchronized (this) {
				if (this.aBoolean499) {
					return;
				}
				this.anApplet3 = (Applet) local431.getDeclaredConstructor().newInstance();
				local431.getMethod("providesignlink", local394).invoke(null, local127);
				this.anApplet3.init();
				if (this.aBoolean500) {
					this.anApplet3.start();
				}
				if (this.aBoolean498) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(490) Exception local490) {
			RuntimeException_Sub2.anInt7276 = -1270316519;
			if (local490 instanceof InvocationTargetException) {
				@Pc(499) Throwable local499 = ((InvocationTargetException) local490).getTargetException();
				if (local499 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6004(local490.toString(), this, local499);
			} else {
				RuntimeException_Sub2.method6004(null, this, local490);
			}
			this.method6043("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean500 = this.aBoolean498 = false;
		this.aBoolean499 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean500 = false;
		this.aBoolean498 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BBZLloader!g;)Z")
	private boolean method6044(@OriginalArg(0) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class271 arg2) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg0);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(19) int local19 = 0; local19 < 20; local19++) {
				if (local17[local19] != arg2.anIntArray647[local19]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(44) Exception local44) {
			this.method6043("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean498 = false;
		this.aBoolean500 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!g;ZB)[B")
	private byte[] method6045(@OriginalArg(0) Class271 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class269.anIntArray646[anInt7282]);
		@Pc(26) Color local26 = new Color(Class269.anIntArray645[anInt7282]);
		@Pc(30) byte[] local30 = new byte[arg0.anInt7279];
		try {
			@Pc(41) InputStream local41;
			if (arg1) {
				@Pc(46) URL local46 = this.getCodeBase();
				@Pc(54) Socket local54 = new Socket(InetAddress.getByName(local46.getHost()), 443);
				local54.setSoTimeout(10000);
				@Pc(60) OutputStream local60 = local54.getOutputStream();
				local60.write(17);
				local60.write(("JAGGRAB " + local46.getFile() + arg0.aString74 + "\n\n").getBytes());
				local41 = local54.getInputStream();
			} else {
				local41 = (new URL(this.getCodeBase(), arg0.aString74)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = 0;
			while (local30.length > local87) {
				@Pc(103) int local103 = local30.length - local87;
				if (local103 > 1000) {
					local103 = 1000;
				}
				@Pc(116) int local116 = local41.read(local30, local87, local103);
				if (local116 < 0) {
					throw new EOFException();
				}
				local87 += local116;
				@Pc(133) int local133 = local87 * 100 / local30.length;
				if (local133 != local85) {
					try {
						@Pc(140) Graphics local140 = this.getGraphics();
						if (local140 == null) {
							this.repaint();
						} else {
							local140.setColor(Color.black);
							local140.fillRect(0, 0, this.anInt7285, this.anInt7284);
							local140.setColor(local19);
							local140.drawRect(this.anInt7285 / 2 - 152, this.anInt7284 / 2 + -18, 303, 33);
							@Pc(193) String local193 = arg0.aStringArray49[this.anInt7283] + " - " + local133 + "%";
							local140.setFont(local8);
							local140.setColor(local26);
							local85 = local133;
							local140.drawString(local193, (this.anInt7285 - local12.stringWidth(local193)) / 2, this.anInt7284 / 2 + 4);
						}
					} catch (@Pc(221) Exception local221) {
					}
				}
			}
			local41.close();
			if (arg0.anInt7279 != arg0.anInt7278) {
				@Pc(238) byte[] local238 = new byte[arg0.anInt7278];
				@Pc(243) Inflater local243 = new Inflater(true);
				local243.setInput(local30);
				local30 = local238;
				local243.inflate(local238);
			}
		} catch (@Pc(254) Exception local254) {
			return null;
		}
		return this.method6044(local30, false, arg0) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLjava/io/File;)Z")
	private boolean method6046(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method6043("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean499 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method6047(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BZLloader!hf;Lloader!g;)[B")
	private byte[] method6048(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class272 arg1, @OriginalArg(3) Class271 arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg1.method6021(arg2.aString73);
		} catch (@Pc(7) Exception local7) {
			this.method6043("nocache");
			return null;
		}
		@Pc(26) byte[] local26 = this.method6047(local5);
		if (!this.method6044(local26, arg0, arg2)) {
			local26 = this.method6045(arg2, false);
			if (local26 == null) {
				local26 = this.method6045(arg2, true);
			}
			if (local26 == null) {
				this.method6043("download");
				return null;
			}
			if (!this.method6046(local26, local5)) {
				return null;
			}
			local26 = this.method6047(local5);
			if (!this.method6044(local26, false, arg2)) {
				this.method6043("mismatch");
				return null;
			}
		}
		return local26;
	}
}
