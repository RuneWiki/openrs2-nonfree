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
	private static String aString205;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString206;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString207;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt5881;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt5883;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt5882 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean410 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt5880 = 32;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean411 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean412 = false;

	@OriginalMember(owner = "loader!loader", name = "l", descriptor = "Z")
	private boolean aBoolean413 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method4740(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean411 = false;
		this.aBoolean410 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean412 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
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
			aString205 = this.getParameter("unsignedurl");
			if (aString205 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(16) SecurityException local16) {
					this.aBoolean413 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString205), "_parent");
					} catch (@Pc(29) Exception local29) {
					}
					return;
				}
			}
			@Pc(34) String local34 = this.getParameter("pre142url");
			@Pc(41) String local41;
			if (local34 != null) {
				try {
					local41 = System.getProperty("java.version");
					if (local41.startsWith("1.3.") || local41.startsWith("1.4.0") || local41.startsWith("1.4.1")) {
						this.getAppletContext().showDocument(new URL(local34), "_self");
					}
				} catch (@Pc(63) Exception local63) {
				}
			}
			aString206 = this.getParameter("crashurl");
			aString207 = this.getParameter("cachesubdir");
			if (aString207 == null) {
				aString207 = "runescape";
			}
			this.anInt5881 = this.getSize().width;
			this.anInt5883 = this.getSize().height;
			try {
				@Pc(90) int local90 = Integer.parseInt(this.getParameter("modewhat"));
				this.anInt5880 += local90;
			} catch (@Pc(98) Exception local98) {
			}
			try {
				local41 = this.getParameter("lang");
				if (local41 != null) {
					this.anInt5882 = Integer.parseInt(local41);
				}
			} catch (@Pc(112) Exception local112) {
			}
			@Pc(121) Class196 local121;
			try {
				local121 = new Class196(this, this.anInt5880, aString207, 29);
			} catch (@Pc(123) Exception local123) {
				this.method4743("nocache");
				return;
			}
			@Pc(132) ClassLoader_Sub1 local132 = new ClassLoader_Sub1();
			@Pc(142) byte[] local142;
			try {
				Class.forName("java.util.jar.Pack200");
				local142 = this.method4741(local121, Class189.aClass193_2, false);
				if (local142 == null) {
					return;
				}
				local132.anUnpack1 = new unpack_Sub1(local142);
				@Pc(160) byte[] local160 = this.method4741(local121, Class189.aClass193_4, false);
				if (local160 == null) {
					return;
				}
				local132.anUnpack2 = new unpack_Sub1(local160);
			} catch (@Pc(172) Throwable local172) {
			}
			@Pc(253) byte[] local253;
			if (local132.anUnpack1 == null) {
				local142 = this.method4741(local121, Class189.aClass193_1, false);
				if (local142 == null) {
					return;
				}
				@Pc(189) ClassLoader_Sub1 local189 = new ClassLoader_Sub1();
				local189.anUnpack1 = new unpack(local142);
				@Pc(198) Class local198 = Class.forName("unpack");
				local189.aHashtable1.put(local198.getName(), local198);
				@Pc(209) Class local209 = local189.loadClass("unpackclass");
				@Pc(216) byte[] local216 = this.method4741(local121, Class189.aClass193_3, false);
				if (local216 == null) {
					return;
				}
				local132.anUnpack1 = (unpack) local209.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local216, Boolean.TRUE);
				local253 = this.method4741(local121, Class189.aClass193_5, false);
				if (local253 == null) {
					return;
				}
				local132.anUnpack2 = (unpack) local209.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local253, Boolean.TRUE);
			}
			@Pc(287) String local287 = System.getProperty("os.name").toLowerCase();
			@Pc(291) String local291 = System.getProperty("os.arch").toLowerCase();
			@Pc(314) byte local314;
			if (local287.startsWith("win")) {
				if (local291.startsWith("amd64") || local291.startsWith("x86_64")) {
					local314 = 4;
				} else {
					local314 = 0;
				}
			} else if (local287.startsWith("linux")) {
				local314 = 1;
			} else if (!local287.startsWith("mac")) {
				this.method4743("os");
				return;
			} else if (local291.startsWith("ppc")) {
				local314 = 2;
			} else {
				local314 = 3;
			}
			for (@Pc(336) int local336 = 0; local336 < Class189.aClass193ArrayArray1[local314].length; local336++) {
				local253 = this.method4741(local121, Class189.aClass193ArrayArray1[local314][local336], this.getParameter("suppress_sha") != null);
				if (local253 == null) {
					return;
				}
			}
			if (Class189.aClass193Array1 != null) {
				@Pc(379) String local379 = System.getProperty("os.name").toLowerCase();
				if (local379.startsWith("win")) {
					local291 = System.getProperty("os.arch").toLowerCase();
					@Pc(397) byte local397;
					if (local291.startsWith("amd64") || local291.startsWith("x86_64")) {
						local397 = 2;
					} else {
						local397 = 0;
					}
					@Pc(415) byte[] local415 = this.method4741(local121, Class189.aClass193Array1[local397], this.getParameter("suppress_sha") != null);
					if (local415 == null) {
						return;
					}
				}
			}
			@Pc(423) Class local423 = Class.forName("Class194");
			local132.aHashtable1.put(local423.getName(), local423);
			@Pc(433) Class local433 = Class.forName("Class196");
			local132.aHashtable1.put(local433.getName(), local433);
			@Pc(443) Class local443 = Class.forName("Class195");
			local132.aHashtable1.put(local443.getName(), local443);
			@Pc(453) Class local453 = Class.forName("Class192");
			local132.aHashtable1.put(local453.getName(), local453);
			@Pc(463) Class local463 = Class.forName("Interface6");
			local132.aHashtable1.put(local463.getName(), local463);
			@Pc(474) Class local474 = local132.loadClass("client");
			synchronized (this) {
				if (this.aBoolean412) {
					return;
				}
				this.anApplet2 = (Applet) local474.getDeclaredConstructor().newInstance();
				local474.getMethod("providesignlink", local433).invoke(null, local121);
				this.anApplet2.init();
				if (this.aBoolean411) {
					this.anApplet2.start();
				}
				if (this.aBoolean410) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(532) Exception local532) {
			RuntimeException_Sub2.anInt5878 = 667055236;
			if (local532 instanceof InvocationTargetException) {
				@Pc(541) Throwable local541 = ((InvocationTargetException) local532).getTargetException();
				if (local541 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method4730(local541, local532.toString(), this);
			} else {
				RuntimeException_Sub2.method4730(local532, null, this);
			}
			this.method4743("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!we;Lloader!f;ZI)[B")
	private byte[] method4741(@OriginalArg(0) Class196 arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(12) File local12;
		try {
			local12 = Class196.method4755(this.anInt5880, aString207, arg1.aString203);
		} catch (@Pc(14) Exception local14) {
			this.method4743("nocache");
			return null;
		}
		@Pc(25) byte[] local25 = this.method4740(local12);
		if (!this.method4744(arg1, arg2, local25)) {
			local25 = this.method4742(arg1, false);
			if (local25 == null) {
				local25 = this.method4742(arg1, true);
			}
			if (local25 == null) {
				this.method4743("download");
				return null;
			}
			if (!this.method4745(local12, local25)) {
				return null;
			}
			local25 = this.method4740(local12);
			if (!this.method4744(arg1, false, local25)) {
				this.method4743("mismatch");
				return null;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;BZ)[B")
	private byte[] method4742(@OriginalArg(0) Class193 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(17) Color local17 = new Color(9179409);
		@Pc(21) byte[] local21 = new byte[arg0.anInt5875];
		try {
			@Pc(32) InputStream local32;
			if (arg1) {
				@Pc(37) URL local37 = this.getCodeBase();
				@Pc(45) Socket local45 = new Socket(InetAddress.getByName(local37.getHost()), 443);
				local45.setSoTimeout(10000);
				@Pc(51) OutputStream local51 = local45.getOutputStream();
				local51.write(17);
				local51.write(("JAGGRAB " + local37.getFile() + arg0.aString202 + "\n\n").getBytes());
				local32 = local45.getInputStream();
			} else {
				local32 = (new URL(this.getCodeBase(), arg0.aString202)).openStream();
			}
			@Pc(76) int local76 = 0;
			@Pc(78) int local78 = -1;
			while (local76 < local21.length) {
				@Pc(92) int local92 = local21.length - local76;
				if (local92 > 1000) {
					local92 = 1000;
				}
				@Pc(105) int local105 = local32.read(local21, local76, local92);
				if (local105 < 0) {
					throw new EOFException();
				}
				local76 += local105;
				@Pc(123) int local123 = local76 * 100 / local21.length;
				if (local78 != local123) {
					try {
						@Pc(130) Graphics local130 = this.getGraphics();
						if (local130 == null) {
							this.repaint();
						} else {
							local130.setColor(Color.black);
							local130.fillRect(0, 0, this.anInt5881, this.anInt5883);
							local130.setColor(local17);
							local130.drawRect(this.anInt5881 / 2 - 152, this.anInt5883 / 2 - 18, 303, 33);
							local78 = local123;
							@Pc(185) String local185 = arg0.aStringArray38[this.anInt5882] + " - " + local123 + "%";
							local130.setFont(local8);
							local130.setColor(Color.white);
							local130.drawString(local185, (this.anInt5881 - local12.stringWidth(local185)) / 2, this.anInt5883 / 2 + 4);
						}
					} catch (@Pc(211) Exception local211) {
					}
				}
			}
			local32.close();
			if (arg0.anInt5876 != arg0.anInt5875) {
				@Pc(228) byte[] local228 = new byte[arg0.anInt5876];
				@Pc(233) Inflater local233 = new Inflater(true);
				local233.setInput(local21);
				local21 = local228;
				local233.inflate(local228);
			}
		} catch (@Pc(251) Exception local251) {
			return null;
		}
		return this.method4744(arg0, false, local21) ? local21 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean411 = this.aBoolean410 = false;
		this.aBoolean412 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method4743(@OriginalArg(0) String arg0) {
		if (this.aBoolean413) {
			return;
		}
		this.aBoolean413 = true;
		try {
			if (aString206 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString206 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(60) Exception local60) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;ZZ[B)Z")
	private boolean method4744(@OriginalArg(0) Class193 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null) {
				return false;
			}
			@Pc(14) MessageDigest local14 = MessageDigest.getInstance("SHA");
			local14.reset();
			local14.update(arg2);
			@Pc(22) byte[] local22 = local14.digest();
			for (@Pc(24) int local24 = 0; local24 < 20; local24++) {
				if (arg0.anIntArray489[local24] != local22[local24]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(49) Exception local49) {
			this.method4743("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method4745(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(10) FileOutputStream local10 = new FileOutputStream(arg0);
			local10.write(arg1, 0, arg1.length);
			local10.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method4743("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean410 = false;
		this.aBoolean411 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}
}
