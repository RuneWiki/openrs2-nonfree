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
	private static String aString237;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString238;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString239;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt6162;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "I")
	private int anInt6165;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean437 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean439 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt6164 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean436 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean438 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt6163 = 32;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!ua;ILloader!a;)[B")
	private byte[] method5067(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class202 arg1, @OriginalArg(3) Class196 arg2) {
		@Pc(7) File local7;
		try {
			local7 = Class202.method5098(aString239, arg2.aString234, this.anInt6163);
		} catch (@Pc(9) Exception local9) {
			this.method5070("nocache");
			return null;
		}
		@Pc(26) byte[] local26 = this.method5068(local7);
		if (!this.method5071(local26, arg0, arg2)) {
			local26 = this.method5069(false, arg2);
			if (local26 == null) {
				local26 = this.method5069(true, arg2);
			}
			if (local26 == null) {
				this.method5070("download");
				return null;
			}
			if (!this.method5072(local26, local7)) {
				return null;
			}
			local26 = this.method5068(local7);
			if (!this.method5071(local26, false, arg2)) {
				this.method5070("mismatch");
				return null;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean437 = false;
		this.aBoolean438 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B)[B")
	private byte[] method5068(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean437 = this.aBoolean438 = false;
		this.aBoolean439 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILloader!a;)[B")
	private byte[] method5069(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class196 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(21) byte[] local21 = new byte[arg1.anInt6158];
		try {
			@Pc(40) InputStream local40;
			if (arg0) {
				@Pc(45) URL local45 = this.getCodeBase();
				@Pc(53) Socket local53 = new Socket(InetAddress.getByName(local45.getHost()), 443);
				local53.setSoTimeout(10000);
				@Pc(59) OutputStream local59 = local53.getOutputStream();
				local59.write(17);
				local59.write(("JAGGRAB " + local45.getFile() + arg1.aString235 + "\n\n").getBytes());
				local40 = local53.getInputStream();
			} else {
				local40 = (new URL(this.getCodeBase(), arg1.aString235)).openStream();
			}
			@Pc(84) int local84 = -1;
			@Pc(86) int local86 = 0;
			while (local86 < local21.length) {
				@Pc(100) int local100 = local21.length - local86;
				if (local100 > 1000) {
					local100 = 1000;
				}
				@Pc(113) int local113 = local40.read(local21, local86, local100);
				if (local113 < 0) {
					throw new EOFException();
				}
				local86 += local113;
				@Pc(131) int local131 = local86 * 100 / local21.length;
				if (local84 != local131) {
					try {
						@Pc(138) Graphics local138 = this.getGraphics();
						if (local138 == null) {
							this.repaint();
						} else {
							local84 = local131;
							local138.setColor(Color.black);
							local138.fillRect(0, 0, this.anInt6162, this.anInt6165);
							local138.setColor(local17);
							local138.drawRect(this.anInt6162 / 2 - 152, this.anInt6165 / 2 - 18, 303, 33);
							@Pc(190) String local190 = arg1.aStringArray44[this.anInt6164] + " - " + local131 + "%";
							local138.setFont(local8);
							local138.setColor(Color.white);
							local138.drawString(local190, (this.anInt6162 - local12.stringWidth(local190)) / 2, this.anInt6165 / 2 + 4);
						}
					} catch (@Pc(219) Exception local219) {
					}
				}
			}
			local40.close();
			if (arg1.anInt6158 != arg1.anInt6157) {
				@Pc(233) byte[] local233 = new byte[arg1.anInt6157];
				@Pc(238) Inflater local238 = new Inflater(true);
				local238.setInput(local21);
				local238.inflate(local233);
				local21 = local233;
			}
		} catch (@Pc(249) Exception local249) {
			return null;
		}
		return this.method5071(local21, false, arg1) ? local21 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method5070(@OriginalArg(1) String arg0) {
		if (this.aBoolean436) {
			return;
		}
		this.aBoolean436 = true;
		try {
			if (aString238 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString238 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BZILloader!a;)Z")
	private boolean method5071(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class196 arg2) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg0);
			@Pc(18) byte[] local18 = local10.digest();
			for (@Pc(20) int local20 = 0; local20 < 20; local20++) {
				if (local18[local20] != arg2.anIntArray635[local20]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(45) Exception local45) {
			this.method5070("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean437 = true;
		this.aBoolean438 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILjava/io/File;)Z")
	private boolean method5072(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method5070("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean439 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

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
			aString237 = this.getParameter("unsignedurl");
			if (aString237 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean436 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString237), "_parent");
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
			aString238 = this.getParameter("crashurl");
			aString239 = this.getParameter("cachesubdir");
			if (aString239 == null) {
				aString239 = "runescape";
			}
			this.anInt6162 = this.getSize().width;
			this.anInt6165 = this.getSize().height;
			try {
				@Pc(90) int local90 = Integer.parseInt(this.getParameter("modewhat"));
				this.anInt6163 += local90;
			} catch (@Pc(98) Exception local98) {
			}
			try {
				local41 = this.getParameter("lang");
				if (local41 != null) {
					this.anInt6164 = Integer.parseInt(local41);
				}
			} catch (@Pc(111) Exception local111) {
			}
			@Pc(120) Class202 local120;
			try {
				local120 = new Class202(this, this.anInt6163, aString239, 29);
			} catch (@Pc(122) Exception local122) {
				this.method5070("nocache");
				return;
			}
			@Pc(131) ClassLoader_Sub1 local131 = new ClassLoader_Sub1();
			@Pc(141) byte[] local141;
			try {
				Class.forName("java.util.jar.Pack200");
				local141 = this.method5067(false, local120, Class199.aClass196_2);
				if (local141 == null) {
					return;
				}
				local131.anUnpack1 = new unpack_Sub1(local141);
				@Pc(158) byte[] local158 = this.method5067(false, local120, Class199.aClass196_4);
				if (local158 == null) {
					return;
				}
				local131.anUnpack2 = new unpack_Sub1(local158);
			} catch (@Pc(170) Throwable local170) {
			}
			@Pc(256) byte[] local256;
			if (local131.anUnpack1 == null) {
				local141 = this.method5067(false, local120, Class199.aClass196_1);
				if (local141 == null) {
					return;
				}
				@Pc(190) ClassLoader_Sub1 local190 = new ClassLoader_Sub1();
				local190.anUnpack1 = new unpack(local141);
				@Pc(199) Class local199 = Class.forName("unpack");
				local190.aHashtable1.put(local199.getName(), local199);
				@Pc(210) Class local210 = local190.loadClass("unpackclass");
				@Pc(217) byte[] local217 = this.method5067(false, local120, Class199.aClass196_3);
				if (local217 == null) {
					return;
				}
				local131.anUnpack1 = (unpack) local210.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local217, Boolean.TRUE);
				local256 = this.method5067(false, local120, Class199.aClass196_5);
				if (local256 == null) {
					return;
				}
				local131.anUnpack2 = (unpack) local210.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local256, Boolean.TRUE);
			}
			@Pc(291) String local291 = System.getProperty("os.name").toLowerCase();
			@Pc(295) String local295 = System.getProperty("os.arch").toLowerCase();
			@Pc(305) byte local305;
			if (local291.startsWith("win")) {
				if (local295.startsWith("amd64") || local295.startsWith("x86_64")) {
					local305 = 4;
				} else {
					local305 = 0;
				}
			} else if (local291.startsWith("linux")) {
				local305 = 1;
			} else if (!local291.startsWith("mac")) {
				this.method5070("os");
				return;
			} else if (local295.startsWith("ppc")) {
				local305 = 2;
			} else {
				local305 = 3;
			}
			for (@Pc(340) int local340 = 0; local340 < Class199.aClass196ArrayArray1[local305].length; local340++) {
				local256 = this.method5067(this.getParameter("suppress_sha") != null, local120, Class199.aClass196ArrayArray1[local305][local340]);
				if (local256 == null) {
					return;
				}
			}
			if (Class199.aClass196Array1 != null) {
				@Pc(376) String local376 = System.getProperty("os.name").toLowerCase();
				if (local376.startsWith("win")) {
					local295 = System.getProperty("os.arch").toLowerCase();
					@Pc(394) byte local394;
					if (local295.startsWith("amd64") || local295.startsWith("x86_64")) {
						local394 = 2;
					} else {
						local394 = 0;
					}
					@Pc(412) byte[] local412 = this.method5067(this.getParameter("suppress_sha") != null, local120, Class199.aClass196Array1[local394]);
					if (local412 == null) {
						return;
					}
				}
			}
			@Pc(420) Class local420 = Class.forName("Class200");
			local131.aHashtable1.put(local420.getName(), local420);
			@Pc(430) Class local430 = Class.forName("Class202");
			local131.aHashtable1.put(local430.getName(), local430);
			@Pc(440) Class local440 = Class.forName("Class203");
			local131.aHashtable1.put(local440.getName(), local440);
			@Pc(450) Class local450 = Class.forName("Class201");
			local131.aHashtable1.put(local450.getName(), local450);
			@Pc(460) Class local460 = Class.forName("Interface6");
			local131.aHashtable1.put(local460.getName(), local460);
			@Pc(471) Class local471 = local131.loadClass("client");
			synchronized (this) {
				if (this.aBoolean439) {
					return;
				}
				this.anApplet2 = (Applet) local471.getDeclaredConstructor().newInstance();
				local471.getMethod("providesignlink", local430).invoke(null, local120);
				this.anApplet2.init();
				if (this.aBoolean437) {
					this.anApplet2.start();
				}
				if (this.aBoolean438) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(532) Exception local532) {
			RuntimeException_Sub2.anInt6160 = 1079205622;
			if (local532 instanceof InvocationTargetException) {
				@Pc(548) Throwable local548 = ((InvocationTargetException) local532).getTargetException();
				if (local548 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5052(local532.toString(), local548, this);
			} else {
				RuntimeException_Sub2.method5052(null, local532, this);
			}
			this.method5070("crash");
		}
	}
}
