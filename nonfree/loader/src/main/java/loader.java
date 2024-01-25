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
	private static String aString83;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString84;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private static int anInt7630 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt7629;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt7631;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt7628 = 0;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean504 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean505 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean507 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean506 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BBLjava/io/File;)Z")
	private boolean method5941(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(11) FileOutputStream local11 = new FileOutputStream(arg1);
			local11.write(arg0, 0, arg0.length);
			local11.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			this.method5944("savefile");
			return false;
		}
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
		this.aBoolean505 = true;
		this.aBoolean507 = this.aBoolean506 = false;
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

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean505 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method5942(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(28) DataInputStream local28 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(31) byte[] local31 = new byte[local9];
			local28.readFully(local31, 0, local9);
			local28.close();
			return local31;
		} catch (@Pc(41) IOException local41) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!b;Z)[B")
	private byte[] method5943(@OriginalArg(1) Class271 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(13) Font local13 = new Font("Helvetica", 1, 13);
		@Pc(17) FontMetrics local17 = this.getFontMetrics(local13);
		@Pc(24) Color local24 = new Color(Class270.anIntArray675[anInt7630]);
		@Pc(31) Color local31 = new Color(Class270.anIntArray676[anInt7630]);
		@Pc(35) byte[] local35 = new byte[arg0.anInt7618];
		try {
			@Pc(46) InputStream local46;
			if (arg1) {
				@Pc(51) URL local51 = this.getCodeBase();
				@Pc(59) Socket local59 = new Socket(InetAddress.getByName(local51.getHost()), 443);
				local59.setSoTimeout(10000);
				@Pc(65) OutputStream local65 = local59.getOutputStream();
				local65.write(17);
				local65.write(("JAGGRAB " + local51.getFile() + arg0.aString72 + "\n\n").getBytes());
				local46 = local59.getInputStream();
			} else {
				local46 = (new URL(this.getCodeBase(), arg0.aString72)).openStream();
			}
			@Pc(90) int local90 = -1;
			@Pc(92) int local92 = 0;
			while (local92 < local35.length) {
				@Pc(106) int local106 = local35.length - local92;
				if (local106 > 1000) {
					local106 = 1000;
				}
				@Pc(117) int local117 = local46.read(local35, local92, local106);
				if (local117 < 0) {
					throw new EOFException();
				}
				local92 += local117;
				@Pc(136) int local136 = local92 * 100 / local35.length;
				if (local90 != local136) {
					try {
						@Pc(143) Graphics local143 = this.getGraphics();
						if (local143 == null) {
							this.repaint();
						} else {
							local143.setColor(Color.black);
							local143.fillRect(0, 0, this.anInt7629, this.anInt7631);
							local143.setColor(local24);
							local143.drawRect(this.anInt7629 / 2 - 152, this.anInt7631 / 2 + -18, 303, 33);
							@Pc(197) String local197 = arg0.aStringArray46[this.anInt7628] + " - " + local136 + "%";
							local143.setFont(local13);
							local143.setColor(local31);
							local143.drawString(local197, (this.anInt7629 - local17.stringWidth(local197)) / 2, this.anInt7631 / 2 + 4);
							local90 = local136;
						}
					} catch (@Pc(224) Exception local224) {
					}
				}
			}
			local46.close();
			if (arg0.anInt7619 != arg0.anInt7618) {
				@Pc(242) byte[] local242 = new byte[arg0.anInt7619];
				@Pc(247) Inflater local247 = new Inflater(true);
				local247.setInput(local35);
				local35 = local242;
				local247.inflate(local242);
			}
		} catch (@Pc(258) Exception local258) {
			return null;
		}
		return this.method5946(local35, false, arg0) ? local35 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method5944(@OriginalArg(0) String arg0) {
		if (this.aBoolean504) {
			return;
		}
		this.aBoolean504 = true;
		try {
			if (aString83 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString83 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean507 = true;
		this.aBoolean506 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!hu;ILloader!b;Z)[B")
	private byte[] method5945(@OriginalArg(0) Class275 arg0, @OriginalArg(2) Class271 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(7) File local7;
		try {
			local7 = arg0.method5926(arg1.aString73);
		} catch (@Pc(9) Exception local9) {
			this.method5944("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method5942(local7);
		if (!this.method5946(local24, arg2, arg1)) {
			local24 = this.method5943(arg1, false);
			if (local24 == null) {
				local24 = this.method5943(arg1, true);
			}
			if (local24 == null) {
				this.method5944("download");
				return null;
			}
			if (!this.method5941(local24, local7)) {
				return null;
			}
			local24 = this.method5942(local7);
			if (!this.method5946(local24, false, arg1)) {
				this.method5944("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BZLloader!b;B)Z")
	private boolean method5946(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class271 arg2) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg0);
			@Pc(16) byte[] local16 = local8.digest();
			for (@Pc(18) int local18 = 0; local18 < 20; local18++) {
				if (arg2.anIntArray677[local18] != local16[local18]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(46) Exception local46) {
			this.method5944("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean507 = false;
		this.aBoolean506 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString84 = this.getParameter("unsignedurl");
			if (aString84 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean504 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString84), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString83 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || Class270.aStringArray45.length <= local37) {
					local37 = 0;
				}
			}
			@Pc(64) String local64 = this.getParameter("colourid");
			if (local64 != null) {
				anInt7630 = Integer.parseInt(local64);
				if (anInt7630 < 0 || anInt7630 >= Class270.anIntArray675.length) {
					anInt7630 = 0;
				}
			}
			this.anInt7629 = this.getSize().width;
			this.anInt7631 = this.getSize().height;
			@Pc(94) int local94 = 32;
			try {
				@Pc(99) int local99 = Integer.parseInt(this.getParameter("modewhat"));
				local94 += local99;
			} catch (@Pc(105) Exception local105) {
			}
			try {
				@Pc(109) String local109 = this.getParameter("lang");
				if (local109 != null) {
					this.anInt7628 = Integer.parseInt(local109);
				}
			} catch (@Pc(118) Exception local118) {
			}
			@Pc(128) Class275 local128;
			try {
				local128 = new Class275(this, local94, Class270.aStringArray45[local37], 30);
			} catch (@Pc(130) Exception local130) {
				this.method5944("nocache");
				return;
			}
			@Pc(137) unpack local137 = null;
			@Pc(147) byte[] local147;
			try {
				Class.forName("java.util.jar.Pack200");
				local147 = this.method5945(local128, Class270.aClass271_2, false);
				if (local147 == null) {
					return;
				}
				local137 = new unpack_Sub1(local147);
			} catch (@Pc(158) Throwable local158) {
			}
			if (local137 == null) {
				local147 = this.method5945(local128, Class270.aClass271_1, false);
				if (local147 == null) {
					return;
				}
				@Pc(178) unpack local178 = new unpack(local147);
				@Pc(183) ClassLoader_Sub1 local183 = new ClassLoader_Sub1(local178);
				@Pc(186) Class local186 = Class.forName("unpack");
				local183.method5888(local186.getName(), local186);
				@Pc(196) Class local196 = local183.loadClass("unpackclass");
				@Pc(203) byte[] local203 = this.method5945(local128, Class270.aClass271_3, false);
				if (local203 == null) {
					return;
				}
				local137 = (unpack) local196.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local203, Boolean.TRUE);
			}
			@Pc(238) ClassLoader_Sub1 local238 = new ClassLoader_Sub1(local137);
			@Pc(240) byte local240 = -1;
			@Pc(244) String local244 = System.getProperty("os.name").toLowerCase();
			@Pc(248) String local248 = System.getProperty("os.arch").toLowerCase();
			if (local244.startsWith("win")) {
				if (local248.startsWith("amd64") || local248.startsWith("x86_64")) {
					local240 = 1;
				} else {
					local240 = 0;
				}
			} else if (local244.startsWith("linux")) {
				if (local248.startsWith("amd64") || local248.startsWith("x86_64")) {
					local240 = 3;
				} else {
					local240 = 2;
				}
			} else if (local244.startsWith("mac")) {
				if (local248.startsWith("ppc")) {
					local240 = 4;
				} else if (local248.startsWith("x86_64")) {
					local240 = 6;
				} else {
					local240 = 7;
				}
			}
			if (local240 != -1) {
				this.method5945(local128, Class270.aClass271Array1[local240], this.getParameter("suppress_sha") != null);
			}
			if (Class270.aClass271Array2 != null) {
				local240 = -1;
				local244 = System.getProperty("os.name").toLowerCase();
				local248 = System.getProperty("os.arch").toLowerCase();
				if (local244.startsWith("win")) {
					if (local248.startsWith("amd64") || local248.startsWith("x86_64")) {
						local240 = 2;
					} else {
						local240 = 0;
					}
				}
				if (local240 != -1) {
					this.method5945(local128, Class270.aClass271Array2[local240], this.getParameter("suppress_sha") != null);
				}
			}
			if (Class270.aClass271Array3 != null) {
				local240 = -1;
				local244 = System.getProperty("os.name").toLowerCase();
				local248 = System.getProperty("os.arch").toLowerCase();
				if (local244.startsWith("win") && !local248.startsWith("amd64") && !local248.startsWith("x86_64")) {
					local240 = 0;
				}
				if (local240 != -1) {
					this.method5945(local128, Class270.aClass271Array3[local240], this.getParameter("suppress_sha") != null);
				}
			}
			@Pc(432) Class local432 = Class.forName("Class277");
			local238.method5888(local432.getName(), local432);
			@Pc(441) Class local441 = Class.forName("Class275");
			local238.method5888(local441.getName(), local441);
			@Pc(450) Class local450 = Class.forName("Class274");
			local238.method5888(local450.getName(), local450);
			@Pc(459) Class local459 = Class.forName("Class276");
			local238.method5888(local459.getName(), local459);
			@Pc(468) Class local468 = Class.forName("Interface14");
			local238.method5888(local468.getName(), local468);
			@Pc(478) Class local478 = local238.loadClass("client");
			synchronized (this) {
				if (this.aBoolean505) {
					return;
				}
				this.anApplet3 = (Applet) local478.getDeclaredConstructor().newInstance();
				local478.getMethod("providesignlink", local441).invoke(null, local128);
				this.anApplet3.init();
				if (this.aBoolean507) {
					this.anApplet3.start();
				}
				if (this.aBoolean506) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(538) Exception local538) {
			RuntimeException_Sub2.anInt7620 = -1794850426;
			if (local538 instanceof InvocationTargetException) {
				@Pc(547) Throwable local547 = ((InvocationTargetException) local538).getTargetException();
				if (local547 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5894(this, local538.toString(), local547);
			} else {
				RuntimeException_Sub2.method5894(this, null, local538);
			}
			this.method5944("crash");
		}
	}
}
