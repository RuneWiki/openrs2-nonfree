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
	private static String aString224;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString225;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Ljava/lang/String;")
	private static String aString226;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt5643;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt5644;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean533 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean532 = false;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt5642 = 32;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt5645 = 0;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean535 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean534 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZBLloader!g;[B)Z")
	private boolean method4709(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class198 arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null) {
				return false;
			}
			@Pc(14) MessageDigest local14 = MessageDigest.getInstance("SHA");
			local14.reset();
			local14.update(arg2);
			@Pc(22) byte[] local22 = local14.digest();
			for (@Pc(24) int local24 = 0; local24 < 20; local24++) {
				if (arg1.anIntArray614[local24] != local22[local24]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(47) Exception local47) {
			this.method4713("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString226 = this.getParameter("unsignedurl");
			if (aString226 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean532 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString226), "_parent");
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
			aString224 = this.getParameter("crashurl");
			aString225 = this.getParameter("cachesubdir");
			if (aString225 == null) {
				aString225 = "runescape";
			}
			this.anInt5644 = this.getSize().width;
			this.anInt5643 = this.getSize().height;
			try {
				@Pc(91) int local91 = Integer.parseInt(this.getParameter("modewhat"));
				this.anInt5642 += local91;
			} catch (@Pc(99) Exception local99) {
			}
			try {
				local41 = this.getParameter("lang");
				if (local41 != null) {
					this.anInt5645 = Integer.parseInt(local41);
				}
			} catch (@Pc(113) Exception local113) {
			}
			@Pc(122) Class201 local122;
			try {
				local122 = new Class201(this, this.anInt5642, aString225, 29);
			} catch (@Pc(124) Exception local124) {
				this.method4713("nocache");
				return;
			}
			@Pc(133) ClassLoader_Sub1 local133 = new ClassLoader_Sub1();
			@Pc(143) byte[] local143;
			try {
				Class.forName("java.util.jar.Pack200");
				local143 = this.method4710(false, local122, Class195.aClass198_2);
				if (local143 == null) {
					return;
				}
				local133.anUnpack2 = new unpack_Sub1(local143);
				@Pc(159) byte[] local159 = this.method4710(false, local122, Class195.aClass198_4);
				if (local159 == null) {
					return;
				}
				local133.anUnpack1 = new unpack_Sub1(local159);
			} catch (@Pc(171) Throwable local171) {
			}
			@Pc(256) byte[] local256;
			if (local133.anUnpack2 == null) {
				local143 = this.method4710(false, local122, Class195.aClass198_1);
				if (local143 == null) {
					return;
				}
				@Pc(190) ClassLoader_Sub1 local190 = new ClassLoader_Sub1();
				local190.anUnpack2 = new unpack(local143);
				@Pc(199) Class local199 = Class.forName("unpack");
				local190.aHashtable1.put(local199.getName(), local199);
				@Pc(210) Class local210 = local190.loadClass("unpackclass");
				@Pc(217) byte[] local217 = this.method4710(false, local122, Class195.aClass198_3);
				if (local217 == null) {
					return;
				}
				local133.anUnpack2 = (unpack) local210.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local217, Boolean.TRUE);
				local256 = this.method4710(false, local122, Class195.aClass198_5);
				if (local256 == null) {
					return;
				}
				local133.anUnpack1 = (unpack) local210.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local256, Boolean.TRUE);
			}
			@Pc(291) String local291 = System.getProperty("os.name").toLowerCase();
			@Pc(295) String local295 = System.getProperty("os.arch").toLowerCase();
			@Pc(309) byte local309;
			if (local291.startsWith("win")) {
				if (local295.startsWith("amd64") || local295.startsWith("x86_64")) {
					local309 = 4;
				} else {
					local309 = 0;
				}
			} else if (local291.startsWith("linux")) {
				local309 = 1;
			} else if (!local291.startsWith("mac")) {
				this.method4713("os");
				return;
			} else if (local295.startsWith("ppc")) {
				local309 = 2;
			} else {
				local309 = 3;
			}
			for (@Pc(341) int local341 = 0; local341 < Class195.aClass198ArrayArray1[local309].length; local341++) {
				local256 = this.method4710(this.getParameter("suppress_sha") != null, local122, Class195.aClass198ArrayArray1[local309][local341]);
				if (local256 == null) {
					return;
				}
			}
			if (Class195.aClass198Array1 != null) {
				@Pc(379) String local379 = System.getProperty("os.name").toLowerCase();
				if (local379.startsWith("win")) {
					local295 = System.getProperty("os.arch").toLowerCase();
					@Pc(397) byte local397;
					if (local295.startsWith("amd64") || local295.startsWith("x86_64")) {
						local397 = 2;
					} else {
						local397 = 0;
					}
					@Pc(416) byte[] local416 = this.method4710(this.getParameter("suppress_sha") != null, local122, Class195.aClass198Array1[local397]);
					if (local416 == null) {
						return;
					}
				}
			}
			@Pc(423) Class local423 = Class.forName("Class196");
			local133.aHashtable1.put(local423.getName(), local423);
			@Pc(433) Class local433 = Class.forName("Class201");
			local133.aHashtable1.put(local433.getName(), local433);
			@Pc(443) Class local443 = Class.forName("Class200");
			local133.aHashtable1.put(local443.getName(), local443);
			@Pc(453) Class local453 = Class.forName("Class199");
			local133.aHashtable1.put(local453.getName(), local453);
			@Pc(463) Class local463 = Class.forName("Interface6");
			local133.aHashtable1.put(local463.getName(), local463);
			@Pc(474) Class local474 = local133.loadClass("client");
			synchronized (this) {
				if (this.aBoolean535) {
					return;
				}
				this.anApplet2 = (Applet) local474.getDeclaredConstructor().newInstance();
				local474.getMethod("providesignlink", local433).invoke(null, local122);
				this.anApplet2.init();
				if (this.aBoolean534) {
					this.anApplet2.start();
				}
				if (this.aBoolean533) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(534) Exception local534) {
			RuntimeException_Sub2.anInt5637 = 104144171;
			if (local534 instanceof InvocationTargetException) {
				@Pc(543) Throwable local543 = ((InvocationTargetException) local534).getTargetException();
				if (local543 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method4687(local543, local534.toString(), this);
			} else {
				RuntimeException_Sub2.method4687(local534, null, this);
			}
			this.method4713("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean535 = true;
		this.aBoolean534 = this.aBoolean533 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!uo;Lloader!g;I)[B")
	private byte[] method4710(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class201 arg1, @OriginalArg(2) Class198 arg2) {
		@Pc(15) File local15;
		try {
			local15 = Class201.method4727(arg2.aString223, this.anInt5642, aString225);
		} catch (@Pc(17) Exception local17) {
			this.method4713("nocache");
			return null;
		}
		@Pc(28) byte[] local28 = this.method4714(local15);
		if (!this.method4709(arg0, arg2, local28)) {
			local28 = this.method4712(arg2, false);
			if (local28 == null) {
				local28 = this.method4712(arg2, true);
			}
			if (local28 == null) {
				this.method4713("download");
				return null;
			}
			if (!this.method4711(local15, local28)) {
				return null;
			}
			local28 = this.method4714(local15);
			if (!this.method4709(false, arg2, local28)) {
				this.method4713("mismatch");
				return null;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BB)Z")
	private boolean method4711(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(12) FileOutputStream local12 = new FileOutputStream(arg0);
			local12.write(arg1, 0, arg1.length);
			local12.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method4713("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!g;IZ)[B")
	private byte[] method4712(@OriginalArg(0) Class198 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(21) byte[] local21 = new byte[arg0.anInt5640];
		try {
			@Pc(63) InputStream local63;
			if (arg1) {
				@Pc(26) URL local26 = this.getCodeBase();
				@Pc(34) Socket local34 = new Socket(InetAddress.getByName(local26.getHost()), 443);
				local34.setSoTimeout(10000);
				@Pc(40) OutputStream local40 = local34.getOutputStream();
				local40.write(17);
				local40.write(("JAGGRAB " + local26.getFile() + arg0.aString222 + "\n\n").getBytes());
				local63 = local34.getInputStream();
			} else {
				local63 = (new URL(this.getCodeBase(), arg0.aString222)).openStream();
			}
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = 0;
			while (local78 < local21.length) {
				@Pc(88) int local88 = local21.length - local78;
				if (local88 > 1000) {
					local88 = 1000;
				}
				@Pc(99) int local99 = local63.read(local21, local78, local88);
				if (local99 < 0) {
					throw new EOFException();
				}
				local78 += local99;
				@Pc(120) int local120 = local78 * 100 / local21.length;
				if (local76 != local120) {
					try {
						@Pc(131) Graphics local131 = this.getGraphics();
						if (local131 == null) {
							this.repaint();
						} else {
							local76 = local120;
							local131.setColor(Color.black);
							local131.fillRect(0, 0, this.anInt5644, this.anInt5643);
							local131.setColor(local17);
							local131.drawRect(this.anInt5644 / 2 - 152, this.anInt5643 / 2 + -18, 303, 33);
							@Pc(187) String local187 = arg0.aStringArray39[this.anInt5645] + " - " + local120 + "%";
							local131.setFont(local8);
							local131.setColor(Color.white);
							local131.drawString(local187, (this.anInt5644 - local12.stringWidth(local187)) / 2, this.anInt5643 / 2 + 4);
						}
					} catch (@Pc(212) Exception local212) {
					}
				}
			}
			local63.close();
			if (arg0.anInt5640 != arg0.anInt5639) {
				@Pc(235) byte[] local235 = new byte[arg0.anInt5639];
				@Pc(240) Inflater local240 = new Inflater(true);
				local240.setInput(local21);
				local21 = local235;
				local240.inflate(local235);
			}
		} catch (@Pc(251) Exception local251) {
			return null;
		}
		return this.method4709(false, arg0, local21) ? local21 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean533 = true;
		this.aBoolean534 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean533 = false;
		this.aBoolean534 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method4713(@OriginalArg(0) String arg0) {
		if (this.aBoolean532) {
			return;
		}
		this.aBoolean532 = true;
		try {
			if (aString224 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString224 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean535 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method4714(@OriginalArg(1) File arg0) {
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
}
