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
	private static String aString214;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString215;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt6257;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt6259;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean371 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean372 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean370 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean373 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt6258 = 32;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt6260 = 0;

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean373 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!a;I[B)Z")
	private boolean method5199(@OriginalArg(0) Class204 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg1);
			@Pc(22) byte[] local22 = local8.digest();
			for (@Pc(24) int local24 = 0; local24 < 20; local24++) {
				if (local22[local24] != arg0.anIntArray624[local24]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(42) Exception local42) {
			this.method5203("sha");
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

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean373 = true;
		this.aBoolean372 = this.aBoolean371 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean371 = true;
		this.aBoolean372 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!a;Lloader!gn;)[B")
	private byte[] method5200(@OriginalArg(1) Class204 arg0, @OriginalArg(2) Class209 arg1) {
		@Pc(7) File local7;
		try {
			local7 = Class209.method5185(arg0.aString204, "runescape", this.anInt6258);
		} catch (@Pc(9) Exception local9) {
			this.method5203("nocache");
			return null;
		}
		@Pc(28) byte[] local28 = this.method5204(local7);
		if (!this.method5199(arg0, local28)) {
			local28 = this.method5202(arg0, false);
			if (local28 == null) {
				local28 = this.method5202(arg0, true);
			}
			if (local28 == null) {
				this.method5203("download");
				return null;
			}
			if (!this.method5201(local28, local7)) {
				return null;
			}
			local28 = this.method5204(local7);
			if (!this.method5199(arg0, local28)) {
				this.method5203("mismatch");
				return null;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
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
					this.aBoolean370 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString215), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			@Pc(35) String local35 = this.getParameter("pre142url");
			@Pc(40) String local40;
			if (local35 != null) {
				try {
					local40 = System.getProperty("java.version");
					if (local40.startsWith("1.3.") || local40.startsWith("1.4.0") || local40.startsWith("1.4.1")) {
						this.getAppletContext().showDocument(new URL(local35), "_self");
					}
				} catch (@Pc(62) Exception local62) {
				}
			}
			aString214 = this.getParameter("crashurl");
			this.anInt6257 = this.getSize().width;
			this.anInt6259 = this.getSize().height;
			try {
				@Pc(81) int local81 = Integer.parseInt(this.getParameter("modewhat"));
				this.anInt6258 += local81;
			} catch (@Pc(89) Exception local89) {
			}
			try {
				local40 = this.getParameter("lang");
				if (local40 != null) {
					this.anInt6260 = Integer.parseInt(local40);
				}
			} catch (@Pc(102) Exception local102) {
			}
			@Pc(111) Class209 local111;
			try {
				local111 = new Class209(this, this.anInt6258, "runescape", 29);
			} catch (@Pc(113) Exception local113) {
				this.method5203("nocache");
				return;
			}
			@Pc(122) ClassLoader_Sub1 local122 = new ClassLoader_Sub1();
			@Pc(131) byte[] local131;
			try {
				Class.forName("java.util.jar.Pack200");
				local131 = this.method5200(Class208.aClass204_2, local111);
				if (local131 == null) {
					return;
				}
				local122.anUnpack2 = new unpack_Sub1(local131);
				@Pc(146) byte[] local146 = this.method5200(Class208.aClass204_4, local111);
				if (local146 == null) {
					return;
				}
				local122.anUnpack1 = new unpack_Sub1(local146);
			} catch (@Pc(158) Throwable local158) {
			}
			@Pc(238) byte[] local238;
			if (local122.anUnpack2 == null) {
				local131 = this.method5200(Class208.aClass204_1, local111);
				if (local131 == null) {
					return;
				}
				@Pc(174) ClassLoader_Sub1 local174 = new ClassLoader_Sub1();
				local174.anUnpack2 = new unpack(local131);
				@Pc(183) Class local183 = Class.forName("unpack");
				local174.aHashtable1.put(local183.getName(), local183);
				@Pc(194) Class local194 = local174.loadClass("unpackclass");
				@Pc(200) byte[] local200 = this.method5200(Class208.aClass204_3, local111);
				if (local200 == null) {
					return;
				}
				local122.anUnpack2 = (unpack) local194.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local200, Boolean.TRUE);
				local238 = this.method5200(Class208.aClass204_5, local111);
				if (local238 == null) {
					return;
				}
				local122.anUnpack1 = (unpack) local194.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local238, Boolean.TRUE);
			}
			@Pc(272) String local272 = System.getProperty("os.name").toLowerCase();
			@Pc(276) String local276 = System.getProperty("os.arch").toLowerCase();
			@Pc(290) byte local290;
			if (local272.startsWith("win")) {
				if (local276.startsWith("amd64") || local276.startsWith("x86_64")) {
					local290 = 1;
				} else {
					local290 = 0;
				}
			} else if (local272.startsWith("linux")) {
				if (local276.startsWith("amd64") || local276.startsWith("x86_64")) {
					local290 = 3;
				} else {
					local290 = 2;
				}
			} else if (!local272.startsWith("mac")) {
				if (!local272.startsWith("sunos")) {
					this.method5203("os");
					return;
				}
				if (local276.startsWith("amd64") || local276.startsWith("x86_64")) {
					local290 = 6;
				} else if (local276.startsWith("sparc")) {
					local290 = 8;
				} else if (local276.startsWith("sparcv9")) {
					local290 = 9;
				} else {
					local290 = 7;
				}
			} else if (local276.startsWith("ppc")) {
				local290 = 4;
			} else {
				local290 = 5;
			}
			for (@Pc(364) int local364 = 0; local364 < Class208.aClass204ArrayArray1[local290].length; local364++) {
				local238 = this.method5200(Class208.aClass204ArrayArray1[local290][local364], local111);
				if (local238 == null) {
					return;
				}
			}
			@Pc(391) Class local391 = Class.forName("Class210");
			local122.aHashtable1.put(local391.getName(), local391);
			@Pc(401) Class local401 = Class.forName("Class209");
			local122.aHashtable1.put(local401.getName(), local401);
			@Pc(411) Class local411 = Class.forName("Class207");
			local122.aHashtable1.put(local411.getName(), local411);
			@Pc(421) Class local421 = Class.forName("Class211");
			local122.aHashtable1.put(local421.getName(), local421);
			@Pc(431) Class local431 = Class.forName("Interface10");
			local122.aHashtable1.put(local431.getName(), local431);
			@Pc(442) Class local442 = local122.loadClass("client");
			synchronized (this) {
				if (this.aBoolean373) {
					return;
				}
				this.anApplet3 = (Applet) local442.getDeclaredConstructor().newInstance();
				local442.getMethod("providesignlink", local401).invoke(null, local111);
				this.anApplet3.init();
				if (this.aBoolean372) {
					this.anApplet3.start();
				}
				if (this.aBoolean371) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(502) Exception local502) {
			RuntimeException_Sub2.anInt6253 = 1009434309;
			if (local502 instanceof InvocationTargetException) {
				@Pc(511) Throwable local511 = ((InvocationTargetException) local502).getTargetException();
				if (local511 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5173(local502.toString(), this, local511);
			} else {
				RuntimeException_Sub2.method5173(null, this, local502);
			}
			this.method5203("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z[BLjava/io/File;)Z")
	private boolean method5201(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(14) FileOutputStream local14 = new FileOutputStream(arg1);
			local14.write(arg0, 0, arg0.length);
			local14.close();
			return true;
		} catch (@Pc(25) IOException local25) {
			this.method5203("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!a;Z)[B")
	private byte[] method5202(@OriginalArg(1) Class204 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(21) byte[] local21 = new byte[arg0.anInt6246];
		try {
			@Pc(63) InputStream local63;
			if (arg1) {
				@Pc(26) URL local26 = this.getCodeBase();
				@Pc(34) Socket local34 = new Socket(InetAddress.getByName(local26.getHost()), 443);
				local34.setSoTimeout(10000);
				@Pc(40) OutputStream local40 = local34.getOutputStream();
				local40.write(17);
				local40.write(("JAGGRAB " + local26.getFile() + arg0.aString203 + "\n\n").getBytes());
				local63 = local34.getInputStream();
			} else {
				local63 = (new URL(this.getCodeBase(), arg0.aString203)).openStream();
			}
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = 0;
			while (local78 < local21.length) {
				@Pc(92) int local92 = local21.length - local78;
				if (local92 > 1000) {
					local92 = 1000;
				}
				@Pc(106) int local106 = local63.read(local21, local78, local92);
				if (local106 < 0) {
					throw new EOFException();
				}
				local78 += local106;
				@Pc(127) int local127 = local78 * 100 / local21.length;
				if (local127 != local76) {
					try {
						@Pc(134) Graphics local134 = this.getGraphics();
						if (local134 == null) {
							this.repaint();
						} else {
							local76 = local127;
							local134.setColor(Color.black);
							local134.fillRect(0, 0, this.anInt6257, this.anInt6259);
							local134.setColor(local17);
							local134.drawRect(this.anInt6257 / 2 - 152, this.anInt6259 / 2 + -18, 303, 33);
							@Pc(185) String local185 = arg0.aStringArray39[this.anInt6260] + " - " + local127 + "%";
							local134.setFont(local8);
							local134.setColor(Color.white);
							local134.drawString(local185, (this.anInt6257 - local12.stringWidth(local185)) / 2, this.anInt6259 / 2 + 4);
						}
					} catch (@Pc(215) Exception local215) {
					}
				}
			}
			local63.close();
			if (arg0.anInt6247 != arg0.anInt6246) {
				@Pc(234) byte[] local234 = new byte[arg0.anInt6247];
				@Pc(239) Inflater local239 = new Inflater(true);
				local239.setInput(local21);
				local21 = local234;
				local239.inflate(local234);
			}
		} catch (@Pc(250) Exception local250) {
			return null;
		}
		return this.method5199(arg0, local21) ? local21 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method5203(@OriginalArg(0) String arg0) {
		if (this.aBoolean370) {
			return;
		}
		this.aBoolean370 = true;
		try {
			if (aString214 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString214 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean371 = false;
		this.aBoolean372 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B)[B")
	private byte[] method5204(@OriginalArg(0) File arg0) {
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
}
