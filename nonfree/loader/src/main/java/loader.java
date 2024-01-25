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
	private static String aString71;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString72;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private static int anInt6508 = 0;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt6506;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt6507;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean505 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt6505 = 0;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean506 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean508 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean507 = false;

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean506 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method5764(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(20) DataInputStream local20 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(23) byte[] local23 = new byte[local9];
			local20.readFully(local23, 0, local9);
			local20.close();
			return local23;
		} catch (@Pc(33) IOException local33) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString72 = this.getParameter("unsignedurl");
			if (aString72 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean507 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString72), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			aString71 = this.getParameter("crashurl");
			@Pc(39) int local39 = 0;
			@Pc(43) String local43 = this.getParameter("cachesubdirid");
			if (local43 != null) {
				local39 = Integer.parseInt(local43);
				if (local39 < 0 || local39 >= Class256.aStringArray46.length) {
					local39 = 0;
				}
			}
			@Pc(64) String local64 = this.getParameter("colourid");
			if (local64 != null) {
				anInt6508 = Integer.parseInt(local64);
				if (anInt6508 < 0 || Class256.anIntArray711.length <= anInt6508) {
					anInt6508 = 0;
				}
			}
			this.anInt6507 = this.getSize().width;
			this.anInt6506 = this.getSize().height;
			@Pc(90) int local90 = 32;
			try {
				@Pc(95) int local95 = Integer.parseInt(this.getParameter("modewhat"));
				local90 += local95;
			} catch (@Pc(101) Exception local101) {
			}
			try {
				@Pc(105) String local105 = this.getParameter("lang");
				if (local105 != null) {
					this.anInt6505 = Integer.parseInt(local105);
				}
			} catch (@Pc(114) Exception local114) {
			}
			@Pc(124) Class259 local124;
			try {
				local124 = new Class259(this, local90, Class256.aStringArray46[local39], 29);
			} catch (@Pc(126) Exception local126) {
				this.method5765("nocache");
				return;
			}
			@Pc(133) unpack local133 = null;
			@Pc(143) byte[] local143;
			try {
				Class.forName("java.util.jar.Pack200");
				local143 = this.method5766(local124, false, Class256.aClass254_2);
				if (local143 == null) {
					return;
				}
				local133 = new unpack_Sub1(local143);
			} catch (@Pc(155) Throwable local155) {
			}
			if (local133 == null) {
				local143 = this.method5766(local124, false, Class256.aClass254_1);
				if (local143 == null) {
					return;
				}
				@Pc(173) unpack local173 = new unpack(local143);
				@Pc(178) ClassLoader_Sub1 local178 = new ClassLoader_Sub1(local173);
				@Pc(181) Class local181 = Class.forName("unpack");
				local178.method5745(local181.getName(), local181);
				@Pc(191) Class local191 = local178.loadClass("unpackclass");
				@Pc(198) byte[] local198 = this.method5766(local124, false, Class256.aClass254_3);
				if (local198 == null) {
					return;
				}
				local133 = (unpack) local191.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local198, Boolean.TRUE);
			}
			@Pc(234) ClassLoader_Sub1 local234 = new ClassLoader_Sub1(local133);
			@Pc(236) byte local236 = -1;
			@Pc(240) String local240 = System.getProperty("os.name").toLowerCase();
			@Pc(244) String local244 = System.getProperty("os.arch").toLowerCase();
			if (local240.startsWith("win")) {
				if (local244.startsWith("amd64") || local244.startsWith("x86_64")) {
					local236 = 4;
				} else {
					local236 = 0;
				}
			} else if (local240.startsWith("linux")) {
				local236 = 1;
			} else if (local240.startsWith("mac")) {
				if (local244.startsWith("ppc")) {
					local236 = 2;
				} else if (local244.startsWith("x86_64")) {
					local236 = 5;
				} else {
					local236 = 3;
				}
			}
			if (local236 != -1) {
				for (@Pc(301) int local301 = 0; local301 < Class256.aClass254ArrayArray1[local236].length; local301++) {
					this.method5766(local124, this.getParameter("suppress_sha") != null, Class256.aClass254ArrayArray1[local236][local301]);
				}
			}
			if (Class256.aClass254Array1 != null) {
				local236 = -1;
				local240 = System.getProperty("os.name").toLowerCase();
				local244 = System.getProperty("os.arch").toLowerCase();
				if (local240.startsWith("win")) {
					if (local244.startsWith("amd64") || local244.startsWith("x86_64")) {
						local236 = 2;
					} else {
						local236 = 0;
					}
				}
				if (local236 != -1) {
					this.method5766(local124, this.getParameter("suppress_sha") != null, Class256.aClass254Array1[local236]);
				}
			}
			@Pc(386) Class local386 = Class.forName("Class257");
			local234.method5745(local386.getName(), local386);
			@Pc(395) Class local395 = Class.forName("Class259");
			local234.method5745(local395.getName(), local395);
			@Pc(404) Class local404 = Class.forName("Class258");
			local234.method5745(local404.getName(), local404);
			@Pc(413) Class local413 = Class.forName("Class260");
			local234.method5745(local413.getName(), local413);
			@Pc(422) Class local422 = Class.forName("Interface13");
			local234.method5745(local422.getName(), local422);
			@Pc(432) Class local432 = local234.loadClass("client");
			synchronized (this) {
				if (this.aBoolean506) {
					return;
				}
				this.anApplet2 = (Applet) local432.getDeclaredConstructor().newInstance();
				local432.getMethod("providesignlink", local395).invoke(null, local124);
				this.anApplet2.init();
				if (this.aBoolean505) {
					this.anApplet2.start();
				}
				if (this.aBoolean508) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(492) Exception local492) {
			RuntimeException_Sub2.anInt6499 = 1179886959;
			if (local492 instanceof InvocationTargetException) {
				@Pc(501) Throwable local501 = ((InvocationTargetException) local492).getTargetException();
				if (local501 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5750(this, local501, local492.toString());
			} else {
				RuntimeException_Sub2.method5750(this, local492, null);
			}
			this.method5765("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method5765(@OriginalArg(0) String arg0) {
		if (this.aBoolean507) {
			return;
		}
		this.aBoolean507 = true;
		try {
			if (aString71 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString71 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!mj;BZLloader!c;)[B")
	private byte[] method5766(@OriginalArg(0) Class259 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class254 arg2) {
		@Pc(11) File local11;
		try {
			local11 = arg0.method5782(arg2.aString69);
		} catch (@Pc(13) Exception local13) {
			this.method5765("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method5764(local11);
		if (!this.method5768(arg1, arg2, local24)) {
			local24 = this.method5769(false, arg2);
			if (local24 == null) {
				local24 = this.method5769(true, arg2);
			}
			if (local24 == null) {
				this.method5765("download");
				return null;
			}
			if (!this.method5767(local24, local11)) {
				return null;
			}
			local24 = this.method5764(local11);
			if (!this.method5768(false, arg2, local24)) {
				this.method5765("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILjava/io/File;)Z")
	private boolean method5767(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method5765("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IZLloader!c;[B)Z")
	private boolean method5768(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class254 arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg2);
			@Pc(18) byte[] local18 = local10.digest();
			for (@Pc(20) int local20 = 0; local20 < 20; local20++) {
				if (local18[local20] != arg1.anIntArray710[local20]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(57) Exception local57) {
			this.method5765("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean508 = true;
		this.aBoolean505 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean505 = true;
		this.aBoolean508 = false;
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
		this.aBoolean505 = this.aBoolean508 = false;
		this.aBoolean506 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!c;Z)[B")
	private byte[] method5769(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class254 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class256.anIntArray711[anInt6508]);
		@Pc(26) Color local26 = new Color(Class256.anIntArray712[anInt6508]);
		@Pc(30) byte[] local30 = new byte[arg1.anInt6498];
		try {
			@Pc(41) InputStream local41;
			if (arg0) {
				@Pc(46) URL local46 = this.getCodeBase();
				@Pc(54) Socket local54 = new Socket(InetAddress.getByName(local46.getHost()), 443);
				local54.setSoTimeout(10000);
				@Pc(60) OutputStream local60 = local54.getOutputStream();
				local60.write(17);
				local60.write(("JAGGRAB " + local46.getFile() + arg1.aString68 + "\n\n").getBytes());
				local41 = local54.getInputStream();
			} else {
				local41 = (new URL(this.getCodeBase(), arg1.aString68)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = 0;
			while (local30.length > local87) {
				@Pc(97) int local97 = local30.length - local87;
				if (local97 > 1000) {
					local97 = 1000;
				}
				@Pc(111) int local111 = local41.read(local30, local87, local97);
				if (local111 < 0) {
					throw new EOFException();
				}
				local87 += local111;
				@Pc(131) int local131 = local87 * 100 / local30.length;
				if (local131 != local85) {
					try {
						@Pc(138) Graphics local138 = this.getGraphics();
						if (local138 == null) {
							this.repaint();
						} else {
							local138.setColor(Color.black);
							local138.fillRect(0, 0, this.anInt6507, this.anInt6506);
							local138.setColor(local19);
							local138.drawRect(this.anInt6507 / 2 - 152, this.anInt6506 / 2 + -18, 303, 33);
							@Pc(192) String local192 = arg1.aStringArray45[this.anInt6505] + " - " + local131 + "%";
							local138.setFont(local8);
							local138.setColor(local26);
							local138.drawString(local192, (this.anInt6507 - local12.stringWidth(local192)) / 2, this.anInt6506 / 2 + 4);
							local85 = local131;
						}
					} catch (@Pc(220) Exception local220) {
					}
				}
			}
			local41.close();
			if (arg1.anInt6498 != arg1.anInt6497) {
				@Pc(237) byte[] local237 = new byte[arg1.anInt6497];
				@Pc(242) Inflater local242 = new Inflater(true);
				local242.setInput(local30);
				local30 = local237;
				local242.inflate(local237);
			}
		} catch (@Pc(253) Exception local253) {
			return null;
		}
		return this.method5768(false, arg1, local30) ? local30 : null;
	}
}
