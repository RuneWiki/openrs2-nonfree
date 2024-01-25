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
	private static String aString78;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString79;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private static int anInt6767 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt6764;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt6765;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean500 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean501 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean502 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt6766 = 0;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean503 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!h;B)[B")
	private byte[] method5811(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class257 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(27) Color local27 = new Color(Class253.anIntArray810[anInt6767]);
		@Pc(34) Color local34 = new Color(Class253.anIntArray811[anInt6767]);
		@Pc(38) byte[] local38 = new byte[arg1.anInt6763];
		try {
			@Pc(80) InputStream local80;
			if (arg0) {
				@Pc(43) URL local43 = this.getCodeBase();
				@Pc(51) Socket local51 = new Socket(InetAddress.getByName(local43.getHost()), 443);
				local51.setSoTimeout(10000);
				@Pc(57) OutputStream local57 = local51.getOutputStream();
				local57.write(17);
				local57.write(("JAGGRAB " + local43.getFile() + arg1.aString76 + "\n\n").getBytes());
				local80 = local51.getInputStream();
			} else {
				local80 = (new URL(this.getCodeBase(), arg1.aString76)).openStream();
			}
			@Pc(93) int local93 = -1;
			@Pc(95) int local95 = 0;
			while (local38.length > local95) {
				@Pc(104) int local104 = local38.length - local95;
				if (local104 > 1000) {
					local104 = 1000;
				}
				@Pc(116) int local116 = local80.read(local38, local95, local104);
				if (local116 < 0) {
					throw new EOFException();
				}
				local95 += local116;
				@Pc(134) int local134 = local95 * 100 / local38.length;
				if (local134 != local93) {
					try {
						@Pc(140) Graphics local140 = this.getGraphics();
						if (local140 == null) {
							this.repaint();
						} else {
							local140.setColor(Color.black);
							local140.fillRect(0, 0, this.anInt6764, this.anInt6765);
							local140.setColor(local27);
							local140.drawRect(this.anInt6764 / 2 - 152, this.anInt6765 / 2 + -18, 303, 33);
							@Pc(194) String local194 = arg1.aStringArray47[this.anInt6766] + " - " + local134 + "%";
							local140.setFont(local8);
							local140.setColor(local34);
							local93 = local134;
							local140.drawString(local194, (this.anInt6764 - local12.stringWidth(local194)) / 2, this.anInt6765 / 2 + 4);
						}
					} catch (@Pc(221) Exception local221) {
					}
				}
			}
			local80.close();
			if (arg1.anInt6763 != arg1.anInt6762) {
				@Pc(235) byte[] local235 = new byte[arg1.anInt6762];
				@Pc(240) Inflater local240 = new Inflater(true);
				local240.setInput(local38);
				local240.inflate(local235);
				local38 = local235;
			}
		} catch (@Pc(251) Exception local251) {
			return null;
		}
		return this.method5816(local38, arg1, false) ? local38 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean500 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;I)Z")
	private boolean method5812(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method5813("savefile");
			return false;
		}
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
		this.aBoolean503 = true;
		this.aBoolean501 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString79 = this.getParameter("unsignedurl");
			if (aString79 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean502 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString79), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString78 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || Class253.aStringArray46.length <= local37) {
					local37 = 0;
				}
			}
			@Pc(60) String local60 = this.getParameter("colourid");
			if (local60 != null) {
				anInt6767 = Integer.parseInt(local60);
				if (anInt6767 < 0 || Class253.anIntArray810.length <= anInt6767) {
					anInt6767 = 0;
				}
			}
			this.anInt6764 = this.getSize().width;
			this.anInt6765 = this.getSize().height;
			@Pc(92) int local92 = 32;
			try {
				@Pc(97) int local97 = Integer.parseInt(this.getParameter("modewhat"));
				local92 += local97;
			} catch (@Pc(103) Exception local103) {
			}
			try {
				@Pc(107) String local107 = this.getParameter("lang");
				if (local107 != null) {
					this.anInt6766 = Integer.parseInt(local107);
				}
			} catch (@Pc(116) Exception local116) {
			}
			@Pc(126) Class255 local126;
			try {
				local126 = new Class255(this, local92, Class253.aStringArray46[local37], 29);
			} catch (@Pc(128) Exception local128) {
				this.method5813("nocache");
				return;
			}
			@Pc(135) unpack local135 = null;
			@Pc(145) byte[] local145;
			try {
				Class.forName("java.util.jar.Pack200");
				local145 = this.method5814(local126, false, Class253.aClass257_2);
				if (local145 == null) {
					return;
				}
				local135 = new unpack_Sub1(local145);
			} catch (@Pc(156) Throwable local156) {
			}
			if (local135 == null) {
				local145 = this.method5814(local126, false, Class253.aClass257_1);
				if (local145 == null) {
					return;
				}
				@Pc(176) unpack local176 = new unpack(local145);
				@Pc(181) ClassLoader_Sub1 local181 = new ClassLoader_Sub1(local176);
				@Pc(184) Class local184 = Class.forName("unpack");
				local181.method5806(local184.getName(), local184);
				@Pc(194) Class local194 = local181.loadClass("unpackclass");
				@Pc(201) byte[] local201 = this.method5814(local126, false, Class253.aClass257_3);
				if (local201 == null) {
					return;
				}
				local135 = (unpack) local194.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local201, Boolean.TRUE);
			}
			@Pc(237) ClassLoader_Sub1 local237 = new ClassLoader_Sub1(local135);
			@Pc(239) byte local239 = -1;
			@Pc(243) String local243 = System.getProperty("os.name").toLowerCase();
			@Pc(247) String local247 = System.getProperty("os.arch").toLowerCase();
			if (local243.startsWith("win")) {
				if (local247.startsWith("amd64") || local247.startsWith("x86_64")) {
					local239 = 4;
				} else {
					local239 = 0;
				}
			} else if (local243.startsWith("linux")) {
				local239 = 1;
			} else if (local243.startsWith("mac")) {
				if (local247.startsWith("ppc")) {
					local239 = 2;
				} else if (local247.startsWith("x86_64")) {
					local239 = 5;
				} else {
					local239 = 3;
				}
			}
			if (local239 != -1) {
				for (@Pc(303) int local303 = 0; local303 < Class253.aClass257ArrayArray1[local239].length; local303++) {
					this.method5814(local126, this.getParameter("suppress_sha") != null, Class253.aClass257ArrayArray1[local239][local303]);
				}
			}
			if (Class253.aClass257Array1 != null) {
				local239 = -1;
				local243 = System.getProperty("os.name").toLowerCase();
				local247 = System.getProperty("os.arch").toLowerCase();
				if (local243.startsWith("win")) {
					if (local247.startsWith("amd64") || local247.startsWith("x86_64")) {
						local239 = 2;
					} else {
						local239 = 0;
					}
				}
				if (local239 != -1) {
					this.method5814(local126, this.getParameter("suppress_sha") != null, Class253.aClass257Array1[local239]);
				}
			}
			@Pc(387) Class local387 = Class.forName("Class259");
			local237.method5806(local387.getName(), local387);
			@Pc(396) Class local396 = Class.forName("Class255");
			local237.method5806(local396.getName(), local396);
			@Pc(405) Class local405 = Class.forName("Class252");
			local237.method5806(local405.getName(), local405);
			@Pc(414) Class local414 = Class.forName("Class254");
			local237.method5806(local414.getName(), local414);
			@Pc(423) Class local423 = Class.forName("Interface13");
			local237.method5806(local423.getName(), local423);
			@Pc(433) Class local433 = local237.loadClass("client");
			synchronized (this) {
				if (this.aBoolean500) {
					return;
				}
				this.anApplet3 = (Applet) local433.getDeclaredConstructor().newInstance();
				local433.getMethod("providesignlink", local396).invoke(null, local126);
				this.anApplet3.init();
				if (this.aBoolean501) {
					this.anApplet3.start();
				}
				if (this.aBoolean503) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(491) Exception local491) {
			RuntimeException_Sub2.anInt6760 = 1189664148;
			if (local491 instanceof InvocationTargetException) {
				@Pc(507) Throwable local507 = ((InvocationTargetException) local491).getTargetException();
				if (local507 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5803(this, local507, local491.toString());
			} else {
				RuntimeException_Sub2.method5803(this, local491, null);
			}
			this.method5813("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean503 = false;
		this.aBoolean501 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method5813(@OriginalArg(0) String arg0) {
		if (this.aBoolean502) {
			return;
		}
		this.aBoolean502 = true;
		try {
			if (aString78 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString78 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(48) Exception local48) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!dq;ZLloader!h;)[B")
	private byte[] method5814(@OriginalArg(1) Class255 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class257 arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg0.method5791(arg2.aString77);
		} catch (@Pc(7) Exception local7) {
			this.method5813("nocache");
			return null;
		}
		@Pc(18) byte[] local18 = this.method5815(local5);
		if (!this.method5816(local18, arg2, arg1)) {
			local18 = this.method5811(false, arg2);
			if (local18 == null) {
				local18 = this.method5811(true, arg2);
			}
			if (local18 == null) {
				this.method5813("download");
				return null;
			}
			if (!this.method5812(local18, local5)) {
				return null;
			}
			local18 = this.method5815(local5);
			if (!this.method5816(local18, arg2, false)) {
				this.method5813("mismatch");
				return null;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean501 = this.aBoolean503 = false;
		this.aBoolean500 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method5815(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(22) byte[] local22 = new byte[local8];
			local19.readFully(local22, 0, local8);
			local19.close();
			return local22;
		} catch (@Pc(32) IOException local32) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLloader!h;IZ)Z")
	private boolean method5816(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class257 arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg0);
			@Pc(28) byte[] local28 = local8.digest();
			for (@Pc(30) int local30 = 0; local30 < 20; local30++) {
				if (local28[local30] != arg1.anIntArray812[local30]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(51) Exception local51) {
			this.method5813("sha");
			return false;
		}
	}
}
