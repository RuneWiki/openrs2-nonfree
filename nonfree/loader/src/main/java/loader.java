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
	private static String aString70;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString71;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private static int anInt6859 = 0;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt6857;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt6860;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt6858 = 0;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean596 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean595 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean597 = false;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean594 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method6088(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(16) int local16 = (int) arg0.length();
			@Pc(27) DataInputStream local27 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(30) byte[] local30 = new byte[local16];
			local27.readFully(local30, 0, local16);
			local27.close();
			return local30;
		} catch (@Pc(40) IOException local40) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BZILloader!b;)Z")
	private boolean method6089(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class219 arg2) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(14) MessageDigest local14 = MessageDigest.getInstance("SHA");
			local14.reset();
			local14.update(arg0);
			@Pc(22) byte[] local22 = local14.digest();
			for (@Pc(24) int local24 = 0; local24 < 20; local24++) {
				if (local22[local24] != arg2.anIntArray648[local24]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(46) Exception local46) {
			this.method6092("sha");
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!ne;Lloader!b;BZ)[B")
	private byte[] method6090(@OriginalArg(0) Class224 arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg0.method6105(arg1.aString67);
		} catch (@Pc(7) Exception local7) {
			this.method6092("nocache");
			return null;
		}
		@Pc(20) byte[] local20 = this.method6088(local5);
		if (!this.method6089(local20, arg2, arg1)) {
			local20 = this.method6091(arg1, false);
			if (local20 == null) {
				local20 = this.method6091(arg1, true);
			}
			if (local20 == null) {
				this.method6092("download");
				return null;
			}
			if (!this.method6093(local20, local5)) {
				return null;
			}
			local20 = this.method6088(local5);
			if (!this.method6089(local20, false, arg1)) {
				this.method6092("mismatch");
				return null;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString70 = this.getParameter("unsignedurl");
			if (aString70 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(20) SecurityException local20) {
					this.aBoolean597 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString70), "_parent");
					} catch (@Pc(33) Exception local33) {
					}
					return;
				}
			}
			aString71 = this.getParameter("crashurl");
			@Pc(40) int local40 = 0;
			@Pc(44) String local44 = this.getParameter("cachesubdirid");
			if (local44 != null) {
				local40 = Integer.parseInt(local44);
				if (local40 < 0 || Class221.aStringArray70.length <= local40) {
					local40 = 0;
				}
			}
			@Pc(66) String local66 = this.getParameter("colourid");
			if (local66 != null) {
				anInt6859 = Integer.parseInt(local66);
				if (anInt6859 < 0 || Class221.anIntArray650.length <= anInt6859) {
					anInt6859 = 0;
				}
			}
			this.anInt6860 = this.getSize().width;
			this.anInt6857 = this.getSize().height;
			@Pc(96) int local96 = 32;
			try {
				@Pc(101) int local101 = Integer.parseInt(this.getParameter("modewhat"));
				local96 += local101;
			} catch (@Pc(107) Exception local107) {
			}
			try {
				@Pc(111) String local111 = this.getParameter("lang");
				if (local111 != null) {
					this.anInt6858 = Integer.parseInt(local111);
				}
			} catch (@Pc(120) Exception local120) {
			}
			@Pc(130) Class224 local130;
			try {
				local130 = new Class224(this, local96, Class221.aStringArray70[local40], 29);
			} catch (@Pc(132) Exception local132) {
				this.method6092("nocache");
				return;
			}
			@Pc(139) unpack local139 = null;
			@Pc(149) byte[] local149;
			try {
				Class.forName("java.util.jar.Pack200");
				local149 = this.method6090(local130, Class221.aClass219_2, false);
				if (local149 == null) {
					return;
				}
				local139 = new unpack_Sub1(local149);
			} catch (@Pc(160) Throwable local160) {
			}
			if (local139 == null) {
				local149 = this.method6090(local130, Class221.aClass219_1, false);
				if (local149 == null) {
					return;
				}
				@Pc(178) unpack local178 = new unpack(local149);
				@Pc(183) ClassLoader_Sub1 local183 = new ClassLoader_Sub1(local178);
				@Pc(186) Class local186 = Class.forName("unpack");
				local183.method6072(local186.getName(), local186);
				@Pc(196) Class local196 = local183.loadClass("unpackclass");
				@Pc(203) byte[] local203 = this.method6090(local130, Class221.aClass219_3, false);
				if (local203 == null) {
					return;
				}
				local139 = (unpack) local196.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local203, Boolean.TRUE);
			}
			@Pc(238) ClassLoader_Sub1 local238 = new ClassLoader_Sub1(local139);
			@Pc(240) byte local240 = -1;
			@Pc(244) String local244 = System.getProperty("os.name").toLowerCase();
			@Pc(248) String local248 = System.getProperty("os.arch").toLowerCase();
			if (local244.startsWith("win")) {
				if (local248.startsWith("amd64") || local248.startsWith("x86_64")) {
					local240 = 4;
				} else {
					local240 = 0;
				}
			} else if (local244.startsWith("linux")) {
				local240 = 1;
			} else if (local244.startsWith("mac")) {
				if (local248.startsWith("ppc")) {
					local240 = 2;
				} else {
					local240 = 3;
				}
			}
			if (local240 != -1) {
				for (@Pc(296) int local296 = 0; local296 < Class221.aClass219ArrayArray1[local240].length; local296++) {
					this.method6090(local130, Class221.aClass219ArrayArray1[local240][local296], this.getParameter("suppress_sha") != null);
				}
			}
			if (Class221.aClass219Array1 != null) {
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
					this.method6090(local130, Class221.aClass219Array1[local240], this.getParameter("suppress_sha") != null);
				}
			}
			@Pc(379) Class local379 = Class.forName("Class223");
			local238.method6072(local379.getName(), local379);
			@Pc(388) Class local388 = Class.forName("Class224");
			local238.method6072(local388.getName(), local388);
			@Pc(397) Class local397 = Class.forName("Class220");
			local238.method6072(local397.getName(), local397);
			@Pc(406) Class local406 = Class.forName("Class225");
			local238.method6072(local406.getName(), local406);
			@Pc(415) Class local415 = Class.forName("Interface11");
			local238.method6072(local415.getName(), local415);
			@Pc(425) Class local425 = local238.loadClass("client");
			synchronized (this) {
				if (this.aBoolean595) {
					return;
				}
				this.anApplet2 = (Applet) local425.getDeclaredConstructor().newInstance();
				local425.getMethod("providesignlink", local388).invoke(null, local130);
				this.anApplet2.init();
				if (this.aBoolean596) {
					this.anApplet2.start();
				}
				if (this.aBoolean594) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(485) Exception local485) {
			RuntimeException_Sub2.anInt6855 = 854780153;
			if (local485 instanceof InvocationTargetException) {
				@Pc(501) Throwable local501 = ((InvocationTargetException) local485).getTargetException();
				if (local501 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6068(local485.toString(), local501, this);
			} else {
				RuntimeException_Sub2.method6068(null, local485, this);
			}
			this.method6092("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!b;IZ)[B")
	private byte[] method6091(@OriginalArg(0) Class219 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class221.anIntArray650[anInt6859]);
		@Pc(26) Color local26 = new Color(Class221.anIntArray649[anInt6859]);
		@Pc(30) byte[] local30 = new byte[arg0.anInt6850];
		try {
			@Pc(78) InputStream local78;
			if (arg1) {
				@Pc(41) URL local41 = this.getCodeBase();
				@Pc(49) Socket local49 = new Socket(InetAddress.getByName(local41.getHost()), 443);
				local49.setSoTimeout(10000);
				@Pc(55) OutputStream local55 = local49.getOutputStream();
				local55.write(17);
				local55.write(("JAGGRAB " + local41.getFile() + arg0.aString68 + "\n\n").getBytes());
				local78 = local49.getInputStream();
			} else {
				local78 = (new URL(this.getCodeBase(), arg0.aString68)).openStream();
			}
			@Pc(91) int local91 = -1;
			@Pc(93) int local93 = 0;
			while (local30.length > local93) {
				@Pc(107) int local107 = local30.length - local93;
				if (local107 > 1000) {
					local107 = 1000;
				}
				@Pc(120) int local120 = local78.read(local30, local93, local107);
				if (local120 < 0) {
					throw new EOFException();
				}
				local93 += local120;
				@Pc(138) int local138 = local93 * 100 / local30.length;
				if (local138 != local91) {
					try {
						@Pc(144) Graphics local144 = this.getGraphics();
						if (local144 == null) {
							this.repaint();
						} else {
							local144.setColor(Color.black);
							local144.fillRect(0, 0, this.anInt6860, this.anInt6857);
							local144.setColor(local19);
							local144.drawRect(this.anInt6860 / 2 - 152, this.anInt6857 / 2 + -18, 303, 33);
							@Pc(193) String local193 = arg0.aStringArray69[this.anInt6858] + " - " + local138 + "%";
							local144.setFont(local8);
							local144.setColor(local26);
							local91 = local138;
							local144.drawString(local193, (this.anInt6860 - local12.stringWidth(local193)) / 2, this.anInt6857 / 2 + 4);
						}
					} catch (@Pc(225) Exception local225) {
					}
				}
			}
			local78.close();
			if (arg0.anInt6850 != arg0.anInt6849) {
				@Pc(238) byte[] local238 = new byte[arg0.anInt6849];
				@Pc(243) Inflater local243 = new Inflater(true);
				local243.setInput(local30);
				local243.inflate(local238);
				local30 = local238;
			}
		} catch (@Pc(254) Exception local254) {
			return null;
		}
		return this.method6089(local30, false, arg0) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean595 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method6092(@OriginalArg(0) String arg0) {
		if (this.aBoolean597) {
			return;
		}
		this.aBoolean597 = true;
		try {
			if (aString71 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString71 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(54) Exception local54) {
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
		this.aBoolean596 = this.aBoolean594 = false;
		this.aBoolean595 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLjava/io/File;)Z")
	private boolean method6093(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method6092("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean594 = true;
		this.aBoolean596 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean594 = false;
		this.aBoolean596 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}
}
