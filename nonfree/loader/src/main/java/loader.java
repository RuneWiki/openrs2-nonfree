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

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString77;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private static int anInt7049 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt7046;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt7047;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean626 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt7048 = 0;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean627 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean628 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean629 = false;

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean629 = false;
		this.aBoolean626 = true;
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

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean627 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString78 = this.getParameter("unsignedurl");
			if (aString78 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean628 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString78), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString77 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || local37 >= Class228.aStringArray48.length) {
					local37 = 0;
				}
			}
			@Pc(62) String local62 = this.getParameter("colourid");
			if (local62 != null) {
				anInt7049 = Integer.parseInt(local62);
				if (anInt7049 < 0 || Class228.anIntArray581.length <= anInt7049) {
					anInt7049 = 0;
				}
			}
			this.anInt7046 = this.getSize().width;
			this.anInt7047 = this.getSize().height;
			@Pc(92) int local92 = 32;
			try {
				@Pc(97) int local97 = Integer.parseInt(this.getParameter("modewhat"));
				local92 += local97;
			} catch (@Pc(103) Exception local103) {
			}
			try {
				@Pc(107) String local107 = this.getParameter("lang");
				if (local107 != null) {
					this.anInt7048 = Integer.parseInt(local107);
				}
			} catch (@Pc(115) Exception local115) {
			}
			@Pc(125) Class231 local125;
			try {
				local125 = new Class231(this, local92, Class228.aStringArray48[local37], 29);
			} catch (@Pc(127) Exception local127) {
				this.method5916("nocache");
				return;
			}
			@Pc(134) unpack local134 = null;
			@Pc(144) byte[] local144;
			try {
				Class.forName("java.util.jar.Pack200");
				local144 = this.method5919(Class228.aClass230_2, false, local125);
				if (local144 == null) {
					return;
				}
				local134 = new unpack_Sub1(local144);
			} catch (@Pc(156) Throwable local156) {
			}
			if (local134 == null) {
				local144 = this.method5919(Class228.aClass230_1, false, local125);
				if (local144 == null) {
					return;
				}
				@Pc(175) unpack local175 = new unpack(local144);
				@Pc(180) ClassLoader_Sub1 local180 = new ClassLoader_Sub1(local175);
				@Pc(183) Class local183 = Class.forName("unpack");
				local180.method5915(local183.getName(), local183);
				@Pc(193) Class local193 = local180.loadClass("unpackclass");
				@Pc(200) byte[] local200 = this.method5919(Class228.aClass230_3, false, local125);
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
					local237 = 4;
				} else {
					local237 = 0;
				}
			} else if (local241.startsWith("linux")) {
				local237 = 1;
			} else if (local241.startsWith("mac")) {
				if (local245.startsWith("ppc")) {
					local237 = 2;
				} else if (local245.startsWith("x86_64")) {
					local237 = 5;
				} else {
					local237 = 3;
				}
			}
			if (local237 != -1) {
				for (@Pc(300) int local300 = 0; local300 < Class228.aClass230ArrayArray1[local237].length; local300++) {
					this.method5919(Class228.aClass230ArrayArray1[local237][local300], this.getParameter("suppress_sha") != null, local125);
				}
			}
			if (Class228.aClass230Array1 != null) {
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
					this.method5919(Class228.aClass230Array1[local237], this.getParameter("suppress_sha") != null, local125);
				}
			}
			@Pc(386) Class local386 = Class.forName("Class232");
			local235.method5915(local386.getName(), local386);
			@Pc(395) Class local395 = Class.forName("Class231");
			local235.method5915(local395.getName(), local395);
			@Pc(404) Class local404 = Class.forName("Class227");
			local235.method5915(local404.getName(), local404);
			@Pc(413) Class local413 = Class.forName("Class226");
			local235.method5915(local413.getName(), local413);
			@Pc(422) Class local422 = Class.forName("Interface12");
			local235.method5915(local422.getName(), local422);
			@Pc(432) Class local432 = local235.loadClass("client");
			synchronized (this) {
				if (this.aBoolean627) {
					return;
				}
				this.anApplet2 = (Applet) local432.getDeclaredConstructor().newInstance();
				local432.getMethod("providesignlink", local395).invoke(null, local125);
				this.anApplet2.init();
				if (this.aBoolean629) {
					this.anApplet2.start();
				}
				if (this.aBoolean626) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(492) Exception local492) {
			RuntimeException_Sub2.anInt7042 = -523729978;
			if (local492 instanceof InvocationTargetException) {
				@Pc(508) Throwable local508 = ((InvocationTargetException) local492).getTargetException();
				if (local508 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5903(local508, this, local492.toString());
			} else {
				RuntimeException_Sub2.method5903(local492, this, null);
			}
			this.method5916("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method5916(@OriginalArg(1) String arg0) {
		if (this.aBoolean628) {
			return;
		}
		this.aBoolean628 = true;
		try {
			if (aString77 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString77 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean629 = true;
		this.aBoolean626 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IZLloader!h;)[B")
	private byte[] method5917(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class230 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class228.anIntArray581[anInt7049]);
		@Pc(26) Color local26 = new Color(Class228.anIntArray580[anInt7049]);
		@Pc(30) byte[] local30 = new byte[arg1.anInt7045];
		try {
			@Pc(47) InputStream local47;
			if (arg0) {
				@Pc(52) URL local52 = this.getCodeBase();
				@Pc(60) Socket local60 = new Socket(InetAddress.getByName(local52.getHost()), 443);
				local60.setSoTimeout(10000);
				@Pc(66) OutputStream local66 = local60.getOutputStream();
				local66.write(17);
				local66.write(("JAGGRAB " + local52.getFile() + arg1.aString76 + "\n\n").getBytes());
				local47 = local60.getInputStream();
			} else {
				local47 = (new URL(this.getCodeBase(), arg1.aString76)).openStream();
			}
			@Pc(91) int local91 = -1;
			@Pc(93) int local93 = 0;
			while (local30.length > local93) {
				@Pc(107) int local107 = local30.length - local93;
				if (local107 > 1000) {
					local107 = 1000;
				}
				@Pc(118) int local118 = local47.read(local30, local93, local107);
				if (local118 < 0) {
					throw new EOFException();
				}
				local93 += local118;
				@Pc(137) int local137 = local93 * 100 / local30.length;
				if (local137 != local91) {
					try {
						@Pc(147) Graphics local147 = this.getGraphics();
						if (local147 == null) {
							this.repaint();
						} else {
							local147.setColor(Color.black);
							local147.fillRect(0, 0, this.anInt7046, this.anInt7047);
							local147.setColor(local19);
							local147.drawRect(this.anInt7046 / 2 - 152, this.anInt7047 / 2 - 18, 303, 33);
							@Pc(197) String local197 = arg1.aStringArray49[this.anInt7048] + " - " + local137 + "%";
							local147.setFont(local8);
							local147.setColor(local26);
							local147.drawString(local197, (this.anInt7046 - local12.stringWidth(local197)) / 2, this.anInt7047 / 2 + 4);
							local91 = local137;
						}
					} catch (@Pc(229) Exception local229) {
					}
				}
			}
			local47.close();
			if (arg1.anInt7045 != arg1.anInt7044) {
				@Pc(242) byte[] local242 = new byte[arg1.anInt7044];
				@Pc(247) Inflater local247 = new Inflater(true);
				local247.setInput(local30);
				local30 = local242;
				local247.inflate(local242);
			}
		} catch (@Pc(258) Exception local258) {
			return null;
		}
		return this.method5920(local30, arg1, false) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method5918(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method5916("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!h;ZLloader!sc;I)[B")
	private byte[] method5919(@OriginalArg(0) Class230 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class231 arg2) {
		@Pc(7) File local7;
		try {
			local7 = arg2.method5952(arg0.aString75);
		} catch (@Pc(9) Exception local9) {
			this.method5916("nocache");
			return null;
		}
		@Pc(20) byte[] local20 = this.method5921(local7);
		if (!this.method5920(local20, arg0, arg1)) {
			local20 = this.method5917(false, arg0);
			if (local20 == null) {
				local20 = this.method5917(true, arg0);
			}
			if (local20 == null) {
				this.method5916("download");
				return null;
			}
			if (!this.method5918(local7, local20)) {
				return null;
			}
			local20 = this.method5921(local7);
			if (!this.method5920(local20, arg0, false)) {
				this.method5916("mismatch");
				return null;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean629 = this.aBoolean626 = false;
		this.aBoolean627 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLloader!h;BZ)Z")
	private boolean method5920(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class230 arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg0);
			@Pc(18) byte[] local18 = local10.digest();
			for (@Pc(20) int local20 = 0; local20 < 20; local20++) {
				if (local18[local20] != arg1.anIntArray582[local20]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(38) Exception local38) {
			this.method5916("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B)[B")
	private byte[] method5921(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(28) byte[] local28 = new byte[local8];
			local19.readFully(local28, 0, local8);
			local19.close();
			return local28;
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}
}
