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
	private static String aString312;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/lang/String;")
	private static String aString313;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private static int anInt6413 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt6414;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt6415;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean434 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean433 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean435 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt6416 = 0;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean436 = false;

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean434 = true;
		this.aBoolean433 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!e;Z[BB)Z")
	private boolean method5853(@OriginalArg(0) Class223 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2) {
		try {
			if (arg2 == null) {
				return false;
			}
			@Pc(13) MessageDigest local13 = MessageDigest.getInstance("SHA");
			local13.reset();
			local13.update(arg2);
			@Pc(21) byte[] local21 = local13.digest();
			for (@Pc(23) int local23 = 0; local23 < 20; local23++) {
				if (local21[local23] != arg0.anIntArray725[local23]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(42) Exception local42) {
			this.method5857("sha");
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!e;Z)[B")
	private byte[] method5854(@OriginalArg(1) Class223 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(14) Font local14 = new Font("Helvetica", 1, 13);
		@Pc(18) FontMetrics local18 = this.getFontMetrics(local14);
		@Pc(25) Color local25 = new Color(Class222.anIntArray724[anInt6413]);
		@Pc(32) Color local32 = new Color(Class222.anIntArray723[anInt6413]);
		@Pc(36) byte[] local36 = new byte[arg0.anInt6409];
		try {
			@Pc(78) InputStream local78;
			if (arg1) {
				@Pc(41) URL local41 = this.getCodeBase();
				@Pc(49) Socket local49 = new Socket(InetAddress.getByName(local41.getHost()), 443);
				local49.setSoTimeout(10000);
				@Pc(55) OutputStream local55 = local49.getOutputStream();
				local55.write(17);
				local55.write(("JAGGRAB " + local41.getFile() + arg0.aString310 + "\n\n").getBytes());
				local78 = local49.getInputStream();
			} else {
				local78 = (new URL(this.getCodeBase(), arg0.aString310)).openStream();
			}
			@Pc(91) int local91 = -1;
			@Pc(93) int local93 = 0;
			while (local36.length > local93) {
				@Pc(103) int local103 = local36.length - local93;
				if (local103 > 1000) {
					local103 = 1000;
				}
				@Pc(114) int local114 = local78.read(local36, local93, local103);
				if (local114 < 0) {
					throw new EOFException();
				}
				local93 += local114;
				@Pc(134) int local134 = local93 * 100 / local36.length;
				if (local134 != local91) {
					try {
						@Pc(145) Graphics local145 = this.getGraphics();
						if (local145 == null) {
							this.repaint();
						} else {
							local145.setColor(Color.black);
							local145.fillRect(0, 0, this.anInt6414, this.anInt6415);
							local145.setColor(local25);
							local145.drawRect(this.anInt6414 / 2 - 152, this.anInt6415 / 2 + -18, 303, 33);
							@Pc(194) String local194 = arg0.aStringArray46[this.anInt6416] + " - " + local134 + "%";
							local145.setFont(local14);
							local145.setColor(local32);
							local145.drawString(local194, (this.anInt6414 - local18.stringWidth(local194)) / 2, this.anInt6415 / 2 + 4);
							local91 = local134;
						}
					} catch (@Pc(226) Exception local226) {
					}
				}
			}
			local78.close();
			if (arg0.anInt6409 != arg0.anInt6410) {
				@Pc(240) byte[] local240 = new byte[arg0.anInt6410];
				@Pc(245) Inflater local245 = new Inflater(true);
				local245.setInput(local36);
				local245.inflate(local240);
				local36 = local240;
			}
		} catch (@Pc(256) Exception local256) {
			return null;
		}
		return this.method5853(arg0, false, local36) ? local36 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!vj;ZLloader!e;)[B")
	private byte[] method5855(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class228 arg1, @OriginalArg(3) Class223 arg2) {
		@Pc(10) File local10;
		try {
			local10 = arg1.method5873(arg2.aString309);
		} catch (@Pc(12) Exception local12) {
			this.method5857("nocache");
			return null;
		}
		@Pc(23) byte[] local23 = this.method5858(local10);
		if (!this.method5853(arg2, arg0, local23)) {
			local23 = this.method5854(arg2, false);
			if (local23 == null) {
				local23 = this.method5854(arg2, true);
			}
			if (local23 == null) {
				this.method5857("download");
				return null;
			}
			if (!this.method5856(local23, local10)) {
				return null;
			}
			local23 = this.method5858(local10);
			if (!this.method5853(arg2, false, local23)) {
				this.method5857("mismatch");
				return null;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString312 = this.getParameter("unsignedurl");
			if (aString312 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(16) SecurityException local16) {
					this.aBoolean436 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString312), "_parent");
					} catch (@Pc(29) Exception local29) {
					}
					return;
				}
			}
			aString313 = this.getParameter("crashurl");
			@Pc(36) int local36 = 0;
			@Pc(40) String local40 = this.getParameter("cachesubdirid");
			if (local40 != null) {
				local36 = Integer.parseInt(local40);
				if (local36 < 0 || Class222.aStringArray45.length <= local36) {
					local36 = 0;
				}
			}
			@Pc(62) String local62 = this.getParameter("colourid");
			if (local62 != null) {
				anInt6413 = Integer.parseInt(local62);
				if (anInt6413 < 0 || anInt6413 >= Class222.anIntArray724.length) {
					anInt6413 = 0;
				}
			}
			this.anInt6414 = this.getSize().width;
			this.anInt6415 = this.getSize().height;
			@Pc(90) int local90 = 32;
			try {
				@Pc(95) int local95 = Integer.parseInt(this.getParameter("modewhat"));
				local90 += local95;
			} catch (@Pc(101) Exception local101) {
			}
			try {
				@Pc(105) String local105 = this.getParameter("lang");
				if (local105 != null) {
					this.anInt6416 = Integer.parseInt(local105);
				}
			} catch (@Pc(114) Exception local114) {
			}
			@Pc(124) Class228 local124;
			try {
				local124 = new Class228(this, local90, Class222.aStringArray45[local36], 29);
			} catch (@Pc(126) Exception local126) {
				this.method5857("nocache");
				return;
			}
			@Pc(133) unpack local133 = null;
			@Pc(143) byte[] local143;
			try {
				Class.forName("java.util.jar.Pack200");
				local143 = this.method5855(false, local124, Class222.aClass223_2);
				if (local143 == null) {
					return;
				}
				local133 = new unpack_Sub1(local143);
			} catch (@Pc(154) Throwable local154) {
			}
			if (local133 == null) {
				local143 = this.method5855(false, local124, Class222.aClass223_1);
				if (local143 == null) {
					return;
				}
				@Pc(172) unpack local172 = new unpack(local143);
				@Pc(177) ClassLoader_Sub1 local177 = new ClassLoader_Sub1(local172);
				@Pc(180) Class local180 = Class.forName("unpack");
				local177.method5852(local180, local180.getName());
				@Pc(190) Class local190 = local177.loadClass("unpackclass");
				@Pc(197) byte[] local197 = this.method5855(false, local124, Class222.aClass223_3);
				if (local197 == null) {
					return;
				}
				local133 = (unpack) local190.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local197, Boolean.TRUE);
			}
			@Pc(232) ClassLoader_Sub1 local232 = new ClassLoader_Sub1(local133);
			@Pc(234) byte local234 = -1;
			@Pc(238) String local238 = System.getProperty("os.name").toLowerCase();
			@Pc(242) String local242 = System.getProperty("os.arch").toLowerCase();
			if (local238.startsWith("win")) {
				if (local242.startsWith("amd64") || local242.startsWith("x86_64")) {
					local234 = 4;
				} else {
					local234 = 0;
				}
			} else if (local238.startsWith("linux")) {
				local234 = 1;
			} else if (local238.startsWith("mac")) {
				if (local242.startsWith("ppc")) {
					local234 = 2;
				} else {
					local234 = 3;
				}
			}
			if (local234 != -1) {
				for (@Pc(292) int local292 = 0; local292 < Class222.aClass223ArrayArray1[local234].length; local292++) {
					this.method5855(this.getParameter("suppress_sha") != null, local124, Class222.aClass223ArrayArray1[local234][local292]);
				}
			}
			if (Class222.aClass223Array1 != null) {
				local234 = -1;
				local238 = System.getProperty("os.name").toLowerCase();
				local242 = System.getProperty("os.arch").toLowerCase();
				if (local238.startsWith("win")) {
					if (local242.startsWith("amd64") || local242.startsWith("x86_64")) {
						local234 = 2;
					} else {
						local234 = 0;
					}
				}
				if (local234 != -1) {
					this.method5855(this.getParameter("suppress_sha") != null, local124, Class222.aClass223Array1[local234]);
				}
			}
			@Pc(379) Class local379 = Class.forName("Class227");
			local232.method5852(local379, local379.getName());
			@Pc(388) Class local388 = Class.forName("Class228");
			local232.method5852(local388, local388.getName());
			@Pc(397) Class local397 = Class.forName("Class226");
			local232.method5852(local397, local397.getName());
			@Pc(406) Class local406 = Class.forName("Class225");
			local232.method5852(local406, local406.getName());
			@Pc(415) Class local415 = Class.forName("Interface11");
			local232.method5852(local415, local415.getName());
			@Pc(425) Class local425 = local232.loadClass("client");
			synchronized (this) {
				if (this.aBoolean435) {
					return;
				}
				this.anApplet2 = (Applet) local425.getDeclaredConstructor().newInstance();
				local425.getMethod("providesignlink", local388).invoke(null, local124);
				this.anApplet2.init();
				if (this.aBoolean433) {
					this.anApplet2.start();
				}
				if (this.aBoolean434) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(484) Exception local484) {
			RuntimeException_Sub2.anInt6411 = -648254627;
			if (local484 instanceof InvocationTargetException) {
				@Pc(500) Throwable local500 = ((InvocationTargetException) local484).getTargetException();
				if (local500 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5843(local500, local484.toString(), this);
			} else {
				RuntimeException_Sub2.method5843(local484, null, this);
			}
			this.method5857("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean434 = false;
		this.aBoolean433 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;B)Z")
	private boolean method5856(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method5857("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method5857(@OriginalArg(0) String arg0) {
		if (this.aBoolean436) {
			return;
		}
		this.aBoolean436 = true;
		try {
			if (aString313 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString313 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B)[B")
	private byte[] method5858(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean435 = true;
		this.aBoolean433 = this.aBoolean434 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean435 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}
}
