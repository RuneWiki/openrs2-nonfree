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
	private static String aString340;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString341;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt5657;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt5658;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean476 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt5656 = 0;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt5659 = 32;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean478 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean475 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean477 = false;

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString340 = this.getParameter("unsignedurl");
			if (aString340 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean475 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString340), "_parent");
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
				} catch (@Pc(65) Exception local65) {
				}
			}
			aString341 = this.getParameter("crashurl");
			this.anInt5658 = this.getSize().width;
			this.anInt5657 = this.getSize().height;
			try {
				@Pc(84) int local84 = Integer.parseInt(this.getParameter("modewhat"));
				this.anInt5659 += local84;
			} catch (@Pc(92) Exception local92) {
			}
			try {
				local42 = this.getParameter("lang");
				if (local42 != null) {
					this.anInt5656 = Integer.parseInt(local42);
				}
			} catch (@Pc(105) Exception local105) {
			}
			@Pc(114) Class210 local114;
			try {
				local114 = new Class210(this, this.anInt5659, "runescape", 29);
			} catch (@Pc(116) Exception local116) {
				this.method4791("nocache");
				return;
			}
			@Pc(125) ClassLoader_Sub1 local125 = new ClassLoader_Sub1();
			@Pc(134) byte[] local134;
			try {
				Class.forName("java.util.jar.Pack200");
				local134 = this.method4790(Class205.aClass204_2, local114);
				if (local134 == null) {
					return;
				}
				local125.anUnpack2 = new unpack_Sub1(local134);
				@Pc(150) byte[] local150 = this.method4790(Class205.aClass204_4, local114);
				if (local150 == null) {
					return;
				}
				local125.anUnpack1 = new unpack_Sub1(local150);
			} catch (@Pc(162) Throwable local162) {
			}
			@Pc(243) byte[] local243;
			if (local125.anUnpack2 == null) {
				local134 = this.method4790(Class205.aClass204_1, local114);
				if (local134 == null) {
					return;
				}
				@Pc(179) ClassLoader_Sub1 local179 = new ClassLoader_Sub1();
				local179.anUnpack2 = new unpack(local134);
				@Pc(188) Class local188 = Class.forName("unpack");
				local179.aHashtable1.put(local188.getName(), local188);
				@Pc(199) Class local199 = local179.loadClass("unpackclass");
				@Pc(205) byte[] local205 = this.method4790(Class205.aClass204_3, local114);
				if (local205 == null) {
					return;
				}
				local125.anUnpack2 = (unpack) local199.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local205, Boolean.TRUE);
				local243 = this.method4790(Class205.aClass204_5, local114);
				if (local243 == null) {
					return;
				}
				local125.anUnpack1 = (unpack) local199.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local243, Boolean.TRUE);
			}
			@Pc(277) String local277 = System.getProperty("os.name").toLowerCase();
			@Pc(281) String local281 = System.getProperty("os.arch").toLowerCase();
			@Pc(295) byte local295;
			if (local277.startsWith("win")) {
				if (local281.startsWith("amd64") || local281.startsWith("x86_64")) {
					local295 = 1;
				} else {
					local295 = 0;
				}
			} else if (local277.startsWith("linux")) {
				if (local281.startsWith("amd64") || local281.startsWith("x86_64")) {
					local295 = 3;
				} else {
					local295 = 2;
				}
			} else if (!local277.startsWith("mac")) {
				if (!local277.startsWith("sunos")) {
					this.method4791("os");
					return;
				}
				if (local281.startsWith("amd64") || local281.startsWith("x86_64")) {
					local295 = 6;
				} else if (local281.startsWith("sparc")) {
					local295 = 8;
				} else if (local281.startsWith("sparcv9")) {
					local295 = 9;
				} else {
					local295 = 7;
				}
			} else if (local281.startsWith("ppc")) {
				local295 = 4;
			} else {
				local295 = 5;
			}
			for (@Pc(369) int local369 = 0; local369 < Class205.aClass204ArrayArray1[local295].length; local369++) {
				local243 = this.method4790(Class205.aClass204ArrayArray1[local295][local369], local114);
				if (local243 == null) {
					return;
				}
			}
			@Pc(396) Class local396 = Class.forName("Class208");
			local125.aHashtable1.put(local396.getName(), local396);
			@Pc(406) Class local406 = Class.forName("Class210");
			local125.aHashtable1.put(local406.getName(), local406);
			@Pc(416) Class local416 = Class.forName("Class209");
			local125.aHashtable1.put(local416.getName(), local416);
			@Pc(426) Class local426 = Class.forName("Class211");
			local125.aHashtable1.put(local426.getName(), local426);
			@Pc(436) Class local436 = Class.forName("Interface10");
			local125.aHashtable1.put(local436.getName(), local436);
			@Pc(447) Class local447 = local125.loadClass("client");
			synchronized (this) {
				if (this.aBoolean478) {
					return;
				}
				this.anApplet2 = (Applet) local447.getDeclaredConstructor().newInstance();
				local447.getMethod("providesignlink", local406).invoke(null, local114);
				this.anApplet2.init();
				if (this.aBoolean476) {
					this.anApplet2.start();
				}
				if (this.aBoolean477) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(507) Exception local507) {
			RuntimeException_Sub2.anInt5654 = 856408151;
			if (local507 instanceof InvocationTargetException) {
				@Pc(523) Throwable local523 = ((InvocationTargetException) local507).getTargetException();
				if (local523 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method4786(local523, local507.toString(), this);
			} else {
				RuntimeException_Sub2.method4786(local507, null, this);
			}
			this.method4791("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B)[B")
	private byte[] method4787(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!a;Z)[B")
	private byte[] method4788(@OriginalArg(1) Class204 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(21) byte[] local21 = new byte[arg0.anInt5652];
		try {
			@Pc(32) InputStream local32;
			if (arg1) {
				@Pc(37) URL local37 = this.getCodeBase();
				@Pc(45) Socket local45 = new Socket(InetAddress.getByName(local37.getHost()), 443);
				local45.setSoTimeout(10000);
				@Pc(51) OutputStream local51 = local45.getOutputStream();
				local51.write(17);
				local51.write(("JAGGRAB " + local37.getFile() + arg0.aString338 + "\n\n").getBytes());
				local32 = local45.getInputStream();
			} else {
				local32 = (new URL(this.getCodeBase(), arg0.aString338)).openStream();
			}
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = 0;
			while (local78 < local21.length) {
				@Pc(92) int local92 = local21.length - local78;
				if (local92 > 1000) {
					local92 = 1000;
				}
				@Pc(105) int local105 = local32.read(local21, local78, local92);
				if (local105 < 0) {
					throw new EOFException();
				}
				local78 += local105;
				@Pc(125) int local125 = local78 * 100 / local21.length;
				if (local76 != local125) {
					try {
						@Pc(136) Graphics local136 = this.getGraphics();
						if (local136 == null) {
							this.repaint();
						} else {
							local136.setColor(Color.black);
							local136.fillRect(0, 0, this.anInt5658, this.anInt5657);
							local136.setColor(local17);
							local136.drawRect(this.anInt5658 / 2 - 152, this.anInt5657 / 2 + -18, 303, 33);
							@Pc(185) String local185 = arg0.aStringArray62[this.anInt5656] + " - " + local125 + "%";
							local136.setFont(local8);
							local136.setColor(Color.white);
							local136.drawString(local185, (this.anInt5658 - local12.stringWidth(local185)) / 2, this.anInt5657 / 2 + 4);
							local76 = local125;
						}
					} catch (@Pc(217) Exception local217) {
					}
				}
			}
			local32.close();
			if (arg0.anInt5651 != arg0.anInt5652) {
				@Pc(235) byte[] local235 = new byte[arg0.anInt5651];
				@Pc(240) Inflater local240 = new Inflater(true);
				local240.setInput(local21);
				local240.inflate(local235);
				local21 = local235;
			}
		} catch (@Pc(251) Exception local251) {
			return null;
		}
		return this.method4789(local21, arg0) ? local21 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLloader!a;I)Z")
	private boolean method4789(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class204 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg0);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(24) int local24 = 0; local24 < 20; local24++) {
				if (local17[local24] != arg1.anIntArray557[local24]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(46) Exception local46) {
			this.method4791("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean477 = true;
		this.aBoolean476 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!a;Lloader!wa;)[B")
	private byte[] method4790(@OriginalArg(1) Class204 arg0, @OriginalArg(2) Class210 arg1) {
		@Pc(11) File local11;
		try {
			local11 = Class210.method4820(this.anInt5659, "runescape", arg0.aString337);
		} catch (@Pc(13) Exception local13) {
			this.method4791("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method4787(local11);
		if (!this.method4789(local24, arg0)) {
			local24 = this.method4788(arg0, false);
			if (local24 == null) {
				local24 = this.method4788(arg0, true);
			}
			if (local24 == null) {
				this.method4791("download");
				return null;
			}
			if (!this.method4792(local24, local11)) {
				return null;
			}
			local24 = this.method4787(local11);
			if (!this.method4789(local24, arg0)) {
				this.method4791("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method4791(@OriginalArg(1) String arg0) {
		if (this.aBoolean475) {
			return;
		}
		this.aBoolean475 = true;
		try {
			if (aString341 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString341 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(58) Exception local58) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean477 = false;
		this.aBoolean476 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;B)Z")
	private boolean method4792(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method4791("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean478 = true;
		this.aBoolean476 = this.aBoolean477 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
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
		this.aBoolean478 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}
}
