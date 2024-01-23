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
	private static String aString215;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString216;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt5743;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt5745;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt5742 = 32;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean504 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean506 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt5744 = 0;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean507 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean505 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method4682(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method4683("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean504 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean505 = true;
		this.aBoolean507 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString215 = this.getParameter("unsignedurl");
			if (aString215 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean506 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString215), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			@Pc(35) String local35 = this.getParameter("pre142url");
			@Pc(41) String local41;
			if (local35 != null) {
				try {
					local41 = System.getProperty("java.version");
					if (local41.startsWith("1.3.") || local41.startsWith("1.4.0") || local41.startsWith("1.4.1")) {
						this.getAppletContext().showDocument(new URL(local35), "_self");
					}
				} catch (@Pc(63) Exception local63) {
				}
			}
			aString216 = this.getParameter("crashurl");
			this.anInt5743 = this.getSize().width;
			this.anInt5745 = this.getSize().height;
			try {
				@Pc(82) int local82 = Integer.parseInt(this.getParameter("modewhat"));
				this.anInt5742 += local82;
			} catch (@Pc(90) Exception local90) {
			}
			try {
				local41 = this.getParameter("lang");
				if (local41 != null) {
					this.anInt5744 = Integer.parseInt(local41);
				}
			} catch (@Pc(103) Exception local103) {
			}
			@Pc(112) Class206 local112;
			try {
				local112 = new Class206(this, this.anInt5742, "runescape", 29);
			} catch (@Pc(114) Exception local114) {
				this.method4683("nocache");
				return;
			}
			@Pc(123) ClassLoader_Sub1 local123 = new ClassLoader_Sub1();
			@Pc(132) byte[] local132;
			try {
				Class.forName("java.util.jar.Pack200");
				local132 = this.method4684(Class207.aClass204_2, local112);
				if (local132 == null) {
					return;
				}
				local123.anUnpack1 = new unpack_Sub1(local132);
				@Pc(149) byte[] local149 = this.method4684(Class207.aClass204_4, local112);
				if (local149 == null) {
					return;
				}
				local123.anUnpack2 = new unpack_Sub1(local149);
			} catch (@Pc(160) Throwable local160) {
			}
			@Pc(241) byte[] local241;
			if (local123.anUnpack1 == null) {
				local132 = this.method4684(Class207.aClass204_1, local112);
				if (local132 == null) {
					return;
				}
				@Pc(179) ClassLoader_Sub1 local179 = new ClassLoader_Sub1();
				local179.anUnpack1 = new unpack(local132);
				@Pc(188) Class local188 = Class.forName("unpack");
				local179.aHashtable2.put(local188.getName(), local188);
				@Pc(199) Class local199 = local179.loadClass("unpackclass");
				@Pc(205) byte[] local205 = this.method4684(Class207.aClass204_3, local112);
				if (local205 == null) {
					return;
				}
				local123.anUnpack1 = (unpack) local199.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local205, Boolean.TRUE);
				local241 = this.method4684(Class207.aClass204_5, local112);
				if (local241 == null) {
					return;
				}
				local123.anUnpack2 = (unpack) local199.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local241, Boolean.TRUE);
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
					this.method4683("os");
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
			for (@Pc(369) int local369 = 0; local369 < Class207.aClass204ArrayArray1[local295].length; local369++) {
				local241 = this.method4684(Class207.aClass204ArrayArray1[local295][local369], local112);
				if (local241 == null) {
					return;
				}
			}
			@Pc(396) Class local396 = Class.forName("Class208");
			local123.aHashtable2.put(local396.getName(), local396);
			@Pc(406) Class local406 = Class.forName("Class206");
			local123.aHashtable2.put(local406.getName(), local406);
			@Pc(416) Class local416 = Class.forName("Class211");
			local123.aHashtable2.put(local416.getName(), local416);
			@Pc(426) Class local426 = Class.forName("Class209");
			local123.aHashtable2.put(local426.getName(), local426);
			@Pc(436) Class local436 = Class.forName("Interface10");
			local123.aHashtable2.put(local436.getName(), local436);
			@Pc(447) Class local447 = local123.loadClass("client");
			synchronized (this) {
				if (this.aBoolean504) {
					return;
				}
				this.anApplet3 = (Applet) local447.getDeclaredConstructor().newInstance();
				local447.getMethod("providesignlink", local406).invoke(null, local112);
				this.anApplet3.init();
				if (this.aBoolean507) {
					this.anApplet3.start();
				}
				if (this.aBoolean505) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(505) Exception local505) {
			RuntimeException_Sub2.anInt5740 = -1690722455;
			if (local505 instanceof InvocationTargetException) {
				@Pc(514) Throwable local514 = ((InvocationTargetException) local505).getTargetException();
				if (local514 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method4668(local505.toString(), this, local514);
			} else {
				RuntimeException_Sub2.method4668(null, this, local505);
			}
			this.method4683("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method4683(@OriginalArg(0) String arg0) {
		if (this.aBoolean506) {
			return;
		}
		this.aBoolean506 = true;
		try {
			if (aString216 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString216 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(48) Exception local48) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!a;Lloader!bk;I)[B")
	private byte[] method4684(@OriginalArg(0) Class204 arg0, @OriginalArg(1) Class206 arg1) {
		@Pc(7) File local7;
		try {
			local7 = Class206.method4639(arg0.aString205, "runescape", this.anInt5742);
		} catch (@Pc(9) Exception local9) {
			this.method4683("nocache");
			return null;
		}
		@Pc(27) byte[] local27 = this.method4686(local7);
		if (!this.method4685(arg0, local27)) {
			local27 = this.method4687(arg0, false);
			if (local27 == null) {
				local27 = this.method4687(arg0, true);
			}
			if (local27 == null) {
				this.method4683("download");
				return null;
			}
			if (!this.method4682(local7, local27)) {
				return null;
			}
			local27 = this.method4686(local7);
			if (!this.method4685(arg0, local27)) {
				this.method4683("mismatch");
				return null;
			}
		}
		return local27;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean505 = false;
		this.aBoolean507 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!a;[BI)Z")
	private boolean method4685(@OriginalArg(0) Class204 arg0, @OriginalArg(1) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(16) MessageDigest local16 = MessageDigest.getInstance("SHA");
			local16.reset();
			local16.update(arg1);
			@Pc(24) byte[] local24 = local16.digest();
			for (@Pc(26) int local26 = 0; local26 < 20; local26++) {
				if (arg0.anIntArray500[local26] != local24[local26]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(50) Exception local50) {
			this.method4683("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method4686(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(15) int local15 = (int) arg0.length();
			@Pc(18) byte[] local18 = new byte[local15];
			@Pc(29) DataInputStream local29 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local29.readFully(local18, 0, local15);
			local29.close();
			return local18;
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean507 = this.aBoolean505 = false;
		this.aBoolean504 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!a;Z)[B")
	private byte[] method4687(@OriginalArg(1) Class204 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(21) byte[] local21 = new byte[arg0.anInt5735];
		try {
			@Pc(69) InputStream local69;
			if (arg1) {
				@Pc(32) URL local32 = this.getCodeBase();
				@Pc(40) Socket local40 = new Socket(InetAddress.getByName(local32.getHost()), 443);
				local40.setSoTimeout(10000);
				@Pc(46) OutputStream local46 = local40.getOutputStream();
				local46.write(17);
				local46.write(("JAGGRAB " + local32.getFile() + arg0.aString204 + "\n\n").getBytes());
				local69 = local40.getInputStream();
			} else {
				local69 = (new URL(this.getCodeBase(), arg0.aString204)).openStream();
			}
			@Pc(82) int local82 = -1;
			@Pc(84) int local84 = 0;
			while (local21.length > local84) {
				@Pc(97) int local97 = local21.length - local84;
				if (local97 > 1000) {
					local97 = 1000;
				}
				@Pc(110) int local110 = local69.read(local21, local84, local97);
				if (local110 < 0) {
					throw new EOFException();
				}
				local84 += local110;
				@Pc(131) int local131 = local84 * 100 / local21.length;
				if (local82 != local131) {
					try {
						@Pc(142) Graphics local142 = this.getGraphics();
						if (local142 == null) {
							this.repaint();
						} else {
							local82 = local131;
							local142.setColor(Color.black);
							local142.fillRect(0, 0, this.anInt5743, this.anInt5745);
							local142.setColor(local17);
							local142.drawRect(this.anInt5743 / 2 - 152, this.anInt5745 / 2 + -18, 303, 33);
							@Pc(198) String local198 = arg0.aStringArray86[this.anInt5744] + " - " + local131 + "%";
							local142.setFont(local8);
							local142.setColor(Color.white);
							local142.drawString(local198, (this.anInt5743 - local12.stringWidth(local198)) / 2, this.anInt5745 / 2 + 4);
						}
					} catch (@Pc(224) Exception local224) {
					}
				}
			}
			local69.close();
			if (arg0.anInt5735 != arg0.anInt5736) {
				@Pc(237) byte[] local237 = new byte[arg0.anInt5736];
				@Pc(242) Inflater local242 = new Inflater(true);
				local242.setInput(local21);
				local242.inflate(local237);
				local21 = local237;
			}
		} catch (@Pc(253) Exception local253) {
			return null;
		}
		return this.method4685(arg0, local21) ? local21 : null;
	}
}
