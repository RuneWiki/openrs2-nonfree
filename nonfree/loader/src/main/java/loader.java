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
	private static String aString82;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString83;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private static int anInt7844 = 0;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt7841;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt7843;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean525 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean526 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean527 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt7842 = 0;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean528 = false;

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean528 = true;
		this.aBoolean526 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method6384(@OriginalArg(1) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;IZLloader!dq;)[B")
	private byte[] method6385(@OriginalArg(0) Class277 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class276 arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg2.method6347(arg0.aString80);
		} catch (@Pc(7) Exception local7) {
			this.method6387("nocache");
			return null;
		}
		@Pc(18) byte[] local18 = this.method6384(local5);
		if (!this.method6388(local18, arg0, arg1)) {
			local18 = this.method6386(false, arg0);
			if (local18 == null) {
				local18 = this.method6386(true, arg0);
			}
			if (local18 == null) {
				this.method6387("download");
				return null;
			}
			if (!this.method6389(local5, local18)) {
				return null;
			}
			local18 = this.method6384(local5);
			if (!this.method6388(local18, arg0, false)) {
				this.method6387("mismatch");
				return null;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BZLloader!f;)[B")
	private byte[] method6386(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class277 arg1) {
		@Pc(14) Font local14 = new Font("Helvetica", 1, 13);
		@Pc(18) FontMetrics local18 = this.getFontMetrics(local14);
		@Pc(25) Color local25 = new Color(Class274.anIntArray529[anInt7844]);
		@Pc(32) Color local32 = new Color(Class274.anIntArray530[anInt7844]);
		@Pc(36) byte[] local36 = new byte[arg1.anInt7840];
		try {
			@Pc(78) InputStream local78;
			if (arg0) {
				@Pc(41) URL local41 = this.getCodeBase();
				@Pc(49) Socket local49 = new Socket(InetAddress.getByName(local41.getHost()), 443);
				local49.setSoTimeout(10000);
				@Pc(55) OutputStream local55 = local49.getOutputStream();
				local55.write(17);
				local55.write(("JAGGRAB " + local41.getFile() + arg1.aString81 + "\n\n").getBytes());
				local78 = local49.getInputStream();
			} else {
				local78 = (new URL(this.getCodeBase(), arg1.aString81)).openStream();
			}
			@Pc(91) int local91 = -1;
			@Pc(93) int local93 = 0;
			while (local36.length > local93) {
				@Pc(107) int local107 = local36.length - local93;
				if (local107 > 1000) {
					local107 = 1000;
				}
				@Pc(120) int local120 = local78.read(local36, local93, local107);
				if (local120 < 0) {
					throw new EOFException();
				}
				local93 += local120;
				@Pc(137) int local137 = local93 * 100 / local36.length;
				if (local91 != local137) {
					try {
						@Pc(144) Graphics local144 = this.getGraphics();
						if (local144 == null) {
							this.repaint();
						} else {
							local144.setColor(Color.black);
							local144.fillRect(0, 0, this.anInt7843, this.anInt7841);
							local144.setColor(local25);
							local144.drawRect(this.anInt7843 / 2 - 152, this.anInt7841 / 2 + -18, 303, 33);
							@Pc(194) String local194 = arg1.aStringArray50[this.anInt7842] + " - " + local137 + "%";
							local144.setFont(local14);
							local144.setColor(local32);
							local91 = local137;
							local144.drawString(local194, (this.anInt7843 - local18.stringWidth(local194)) / 2, this.anInt7841 / 2 + 4);
						}
					} catch (@Pc(225) Exception local225) {
					}
				}
			}
			local78.close();
			if (arg1.anInt7839 != arg1.anInt7840) {
				@Pc(239) byte[] local239 = new byte[arg1.anInt7839];
				@Pc(244) Inflater local244 = new Inflater(true);
				local244.setInput(local36);
				local244.inflate(local239);
				local36 = local239;
			}
		} catch (@Pc(255) Exception local255) {
			return null;
		}
		return this.method6388(local36, arg1, false) ? local36 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean526 = true;
		this.aBoolean528 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method6387(@OriginalArg(0) String arg0) {
		if (this.aBoolean527) {
			return;
		}
		this.aBoolean527 = true;
		try {
			if (aString82 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString82 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean525 = true;
		this.aBoolean528 = this.aBoolean526 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString83 = this.getParameter("unsignedurl");
			if (aString83 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean527 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString83), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString82 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || local37 >= Class274.aStringArray49.length) {
					local37 = 0;
				}
			}
			@Pc(58) String local58 = this.getParameter("colourid");
			if (local58 != null) {
				anInt7844 = Integer.parseInt(local58);
				if (anInt7844 < 0 || Class274.anIntArray529.length <= anInt7844) {
					anInt7844 = 0;
				}
			}
			this.anInt7843 = this.getSize().width;
			this.anInt7841 = this.getSize().height;
			@Pc(92) int local92 = 32;
			try {
				@Pc(97) int local97 = Integer.parseInt(this.getParameter("modewhat"));
				local92 += local97;
			} catch (@Pc(103) Exception local103) {
			}
			try {
				@Pc(107) String local107 = this.getParameter("lang");
				if (local107 != null) {
					this.anInt7842 = Integer.parseInt(local107);
				}
			} catch (@Pc(115) Exception local115) {
			}
			@Pc(125) Class276 local125;
			try {
				local125 = new Class276(this, local92, Class274.aStringArray49[local37], 30);
			} catch (@Pc(127) Exception local127) {
				this.method6387("nocache");
				return;
			}
			@Pc(134) unpack local134 = null;
			@Pc(144) byte[] local144;
			try {
				Class.forName("java.util.jar.Pack200");
				local144 = this.method6385(Class274.aClass277_2, false, local125);
				if (local144 == null) {
					return;
				}
				local134 = new unpack_Sub1(local144);
			} catch (@Pc(155) Throwable local155) {
			}
			if (local134 == null) {
				local144 = this.method6385(Class274.aClass277_1, false, local125);
				if (local144 == null) {
					return;
				}
				@Pc(173) unpack local173 = new unpack(local144);
				@Pc(178) ClassLoader_Sub1 local178 = new ClassLoader_Sub1(local173);
				@Pc(181) Class local181 = Class.forName("unpack");
				local178.method6338(local181.getName(), local181);
				@Pc(191) Class local191 = local178.loadClass("unpackclass");
				@Pc(198) byte[] local198 = this.method6385(Class274.aClass277_3, false, local125);
				if (local198 == null) {
					return;
				}
				local134 = (unpack) local191.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local198, Boolean.TRUE);
			}
			@Pc(233) ClassLoader_Sub1 local233 = new ClassLoader_Sub1(local134);
			@Pc(235) byte local235 = -1;
			@Pc(239) String local239 = System.getProperty("os.name").toLowerCase();
			@Pc(243) String local243 = System.getProperty("os.arch").toLowerCase();
			if (local239.startsWith("win")) {
				if (local243.startsWith("amd64") || local243.startsWith("x86_64")) {
					local235 = 1;
				} else {
					local235 = 0;
				}
			} else if (local239.startsWith("linux")) {
				if (local243.startsWith("amd64") || local243.startsWith("x86_64")) {
					local235 = 3;
				} else {
					local235 = 2;
				}
			} else if (local239.startsWith("mac")) {
				if (local243.startsWith("ppc")) {
					local235 = 4;
				} else if (local243.startsWith("x86_64")) {
					local235 = 6;
				} else {
					local235 = 7;
				}
			}
			if (local235 != -1) {
				this.method6385(Class274.aClass277Array1[local235], this.getParameter("suppress_sha") != null, local125);
			}
			if (Class274.aClass277Array2 != null) {
				local235 = -1;
				local239 = System.getProperty("os.name").toLowerCase();
				local243 = System.getProperty("os.arch").toLowerCase();
				if (local239.startsWith("win")) {
					if (local243.startsWith("amd64") || local243.startsWith("x86_64")) {
						local235 = 2;
					} else {
						local235 = 0;
					}
				}
				if (local235 != -1) {
					this.method6385(Class274.aClass277Array2[local235], this.getParameter("suppress_sha") != null, local125);
				}
			}
			if (Class274.aClass277Array3 != null) {
				local235 = -1;
				local239 = System.getProperty("os.name").toLowerCase();
				local243 = System.getProperty("os.arch").toLowerCase();
				if (local239.startsWith("win") && !local243.startsWith("amd64") && !local243.startsWith("x86_64")) {
					local235 = 0;
				}
				if (local235 != -1) {
					this.method6385(Class274.aClass277Array3[local235], this.getParameter("suppress_sha") != null, local125);
				}
			}
			@Pc(426) Class local426 = Class.forName("Class281");
			local233.method6338(local426.getName(), local426);
			@Pc(435) Class local435 = Class.forName("Class276");
			local233.method6338(local435.getName(), local435);
			@Pc(444) Class local444 = Class.forName("Class279");
			local233.method6338(local444.getName(), local444);
			@Pc(453) Class local453 = Class.forName("Class280");
			local233.method6338(local453.getName(), local453);
			@Pc(462) Class local462 = Class.forName("Interface15");
			local233.method6338(local462.getName(), local462);
			@Pc(472) Class local472 = local233.loadClass("client");
			synchronized (this) {
				if (this.aBoolean525) {
					return;
				}
				this.anApplet3 = (Applet) local472.getDeclaredConstructor().newInstance();
				local472.getMethod("providesignlink", local435).invoke(null, local125);
				this.anApplet3.init();
				if (this.aBoolean528) {
					this.anApplet3.start();
				}
				if (this.aBoolean526) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(533) Exception local533) {
			RuntimeException_Sub2.anInt7837 = -405885566;
			if (local533 instanceof InvocationTargetException) {
				@Pc(542) Throwable local542 = ((InvocationTargetException) local533).getTargetException();
				if (local542 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6377(local542, local533.toString(), this);
			} else {
				RuntimeException_Sub2.method6377(local533, null, this);
			}
			this.method6387("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLloader!f;ZZ)Z")
	private boolean method6388(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(12) MessageDigest local12 = MessageDigest.getInstance("SHA");
			local12.reset();
			local12.update(arg0);
			@Pc(20) byte[] local20 = local12.digest();
			for (@Pc(22) int local22 = 0; local22 < 20; local22++) {
				if (local20[local22] != arg1.anIntArray531[local22]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(40) Exception local40) {
			this.method6387("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method6389(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method6387("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean525 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}
}
