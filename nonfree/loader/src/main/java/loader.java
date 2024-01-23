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
	private static String aString199;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString200;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt5574;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt5575;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt5572 = 32;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean381 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean379 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean382 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt5573 = 0;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean380 = false;

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean379 = this.aBoolean380 = false;
		this.aBoolean382 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!e;[B)Z")
	private boolean method4725(@OriginalArg(1) Class206 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(15) MessageDigest local15 = MessageDigest.getInstance("SHA");
			local15.reset();
			local15.update(arg1);
			@Pc(23) byte[] local23 = local15.digest();
			for (@Pc(25) int local25 = 0; local25 < 20; local25++) {
				if (arg0.anIntArray487[local25] != local23[local25]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(45) Exception local45) {
			this.method4728("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method4726(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(14) int local14 = (int) arg0.length();
			@Pc(25) DataInputStream local25 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(28) byte[] local28 = new byte[local14];
			local25.readFully(local28, 0, local14);
			local25.close();
			return local28;
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean380 = false;
		this.aBoolean379 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!e;Lloader!tk;)[B")
	private byte[] method4727(@OriginalArg(1) Class206 arg0, @OriginalArg(2) Class211 arg1) {
		@Pc(7) File local7;
		try {
			local7 = Class211.method4747(this.anInt5572, arg0.aString198, "runescape");
		} catch (@Pc(9) Exception local9) {
			this.method4728("nocache");
			return null;
		}
		@Pc(20) byte[] local20 = this.method4726(local7);
		if (!this.method4725(arg0, local20)) {
			local20 = this.method4729(false, arg0);
			if (local20 == null) {
				local20 = this.method4729(true, arg0);
			}
			if (local20 == null) {
				this.method4728("download");
				return null;
			}
			if (!this.method4730(local7, local20)) {
				return null;
			}
			local20 = this.method4726(local7);
			if (!this.method4725(arg0, local20)) {
				this.method4728("mismatch");
				return null;
			}
		}
		return local20;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method4728(@OriginalArg(0) String arg0) {
		if (this.aBoolean381) {
			return;
		}
		this.aBoolean381 = true;
		try {
			if (aString199 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString199 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BZLloader!e;)[B")
	private byte[] method4729(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class206 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(24) Color local24 = new Color(9179409);
		@Pc(28) byte[] local28 = new byte[arg1.anInt5569];
		try {
			@Pc(39) InputStream local39;
			if (arg0) {
				@Pc(44) URL local44 = this.getCodeBase();
				@Pc(52) Socket local52 = new Socket(InetAddress.getByName(local44.getHost()), 443);
				local52.setSoTimeout(10000);
				@Pc(58) OutputStream local58 = local52.getOutputStream();
				local58.write(17);
				local58.write(("JAGGRAB " + local44.getFile() + arg1.aString197 + "\n\n").getBytes());
				local39 = local52.getInputStream();
			} else {
				local39 = (new URL(this.getCodeBase(), arg1.aString197)).openStream();
			}
			@Pc(83) int local83 = -1;
			@Pc(85) int local85 = 0;
			while (local28.length > local85) {
				@Pc(95) int local95 = local28.length - local85;
				if (local95 > 1000) {
					local95 = 1000;
				}
				@Pc(108) int local108 = local39.read(local28, local85, local95);
				if (local108 < 0) {
					throw new EOFException();
				}
				local85 += local108;
				@Pc(129) int local129 = local85 * 100 / local28.length;
				if (local129 != local83) {
					try {
						@Pc(140) Graphics local140 = this.getGraphics();
						if (local140 == null) {
							this.repaint();
						} else {
							local83 = local129;
							local140.setColor(Color.black);
							local140.fillRect(0, 0, this.anInt5574, this.anInt5575);
							local140.setColor(local24);
							local140.drawRect(this.anInt5574 / 2 - 152, this.anInt5575 / 2 - 18, 303, 33);
							@Pc(192) String local192 = arg1.aStringArray41[this.anInt5573] + " - " + local129 + "%";
							local140.setFont(local8);
							local140.setColor(Color.white);
							local140.drawString(local192, (this.anInt5574 - local12.stringWidth(local192)) / 2, this.anInt5575 / 2 + 4);
						}
					} catch (@Pc(221) Exception local221) {
					}
				}
			}
			local39.close();
			if (arg1.anInt5569 != arg1.anInt5570) {
				@Pc(239) byte[] local239 = new byte[arg1.anInt5570];
				@Pc(244) Inflater local244 = new Inflater(true);
				local244.setInput(local28);
				local28 = local239;
				local244.inflate(local239);
			}
		} catch (@Pc(255) Exception local255) {
			return null;
		}
		return this.method4725(arg1, local28) ? local28 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString200 = this.getParameter("unsignedurl");
			if (aString200 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(16) SecurityException local16) {
					this.aBoolean381 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString200), "_parent");
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
			aString199 = this.getParameter("crashurl");
			this.anInt5574 = this.getSize().width;
			this.anInt5575 = this.getSize().height;
			try {
				@Pc(82) int local82 = Integer.parseInt(this.getParameter("modewhat"));
				this.anInt5572 += local82;
			} catch (@Pc(90) Exception local90) {
			}
			try {
				local41 = this.getParameter("lang");
				if (local41 != null) {
					this.anInt5573 = Integer.parseInt(local41);
				}
			} catch (@Pc(102) Exception local102) {
			}
			@Pc(111) Class211 local111;
			try {
				local111 = new Class211(this, this.anInt5572, "runescape", 29);
			} catch (@Pc(113) Exception local113) {
				this.method4728("nocache");
				return;
			}
			@Pc(122) ClassLoader_Sub1 local122 = new ClassLoader_Sub1();
			@Pc(131) byte[] local131;
			try {
				Class.forName("java.util.jar.Pack200");
				local131 = this.method4727(Class204.aClass206_2, local111);
				if (local131 == null) {
					return;
				}
				local122.anUnpack2 = new unpack_Sub1(local131);
				@Pc(148) byte[] local148 = this.method4727(Class204.aClass206_4, local111);
				if (local148 == null) {
					return;
				}
				local122.anUnpack1 = new unpack_Sub1(local148);
			} catch (@Pc(160) Throwable local160) {
			}
			@Pc(240) byte[] local240;
			if (local122.anUnpack2 == null) {
				local131 = this.method4727(Class204.aClass206_1, local111);
				if (local131 == null) {
					return;
				}
				@Pc(178) ClassLoader_Sub1 local178 = new ClassLoader_Sub1();
				local178.anUnpack2 = new unpack(local131);
				@Pc(187) Class local187 = Class.forName("unpack");
				local178.aHashtable1.put(local187.getName(), local187);
				@Pc(198) Class local198 = local178.loadClass("unpackclass");
				@Pc(204) byte[] local204 = this.method4727(Class204.aClass206_3, local111);
				if (local204 == null) {
					return;
				}
				local122.anUnpack2 = (unpack) local198.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local204, Boolean.TRUE);
				local240 = this.method4727(Class204.aClass206_5, local111);
				if (local240 == null) {
					return;
				}
				local122.anUnpack1 = (unpack) local198.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local240, Boolean.TRUE);
			}
			@Pc(276) String local276 = System.getProperty("os.name").toLowerCase();
			@Pc(280) String local280 = System.getProperty("os.arch").toLowerCase();
			@Pc(294) byte local294;
			if (local276.startsWith("win")) {
				if (local280.startsWith("amd64") || local280.startsWith("x86_64")) {
					local294 = 1;
				} else {
					local294 = 0;
				}
			} else if (local276.startsWith("linux")) {
				if (local280.startsWith("amd64") || local280.startsWith("x86_64")) {
					local294 = 3;
				} else {
					local294 = 2;
				}
			} else if (!local276.startsWith("mac")) {
				if (!local276.startsWith("sunos")) {
					this.method4728("os");
					return;
				}
				if (local280.startsWith("amd64") || local280.startsWith("x86_64")) {
					local294 = 6;
				} else if (local280.startsWith("sparc")) {
					local294 = 8;
				} else if (local280.startsWith("sparcv9")) {
					local294 = 9;
				} else {
					local294 = 7;
				}
			} else if (local280.startsWith("ppc")) {
				local294 = 4;
			} else {
				local294 = 5;
			}
			for (@Pc(368) int local368 = 0; local368 < Class204.aClass206ArrayArray1[local294].length; local368++) {
				local240 = this.method4727(Class204.aClass206ArrayArray1[local294][local368], local111);
				if (local240 == null) {
					return;
				}
			}
			@Pc(399) Class local399 = Class.forName("Class208");
			local122.aHashtable1.put(local399.getName(), local399);
			@Pc(409) Class local409 = Class.forName("Class211");
			local122.aHashtable1.put(local409.getName(), local409);
			@Pc(419) Class local419 = Class.forName("Class210");
			local122.aHashtable1.put(local419.getName(), local419);
			@Pc(429) Class local429 = Class.forName("Class209");
			local122.aHashtable1.put(local429.getName(), local429);
			@Pc(439) Class local439 = Class.forName("Interface10");
			local122.aHashtable1.put(local439.getName(), local439);
			@Pc(450) Class local450 = local122.loadClass("client");
			synchronized (this) {
				if (this.aBoolean382) {
					return;
				}
				this.anApplet2 = (Applet) local450.getDeclaredConstructor().newInstance();
				local450.getMethod("providesignlink", local409).invoke(null, local111);
				this.anApplet2.init();
				if (this.aBoolean379) {
					this.anApplet2.start();
				}
				if (this.aBoolean380) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(509) Exception local509) {
			RuntimeException_Sub2.anInt5567 = 665544400;
			if (local509 instanceof InvocationTargetException) {
				@Pc(518) Throwable local518 = ((InvocationTargetException) local509).getTargetException();
				if (local518 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method4704(local518, local509.toString(), this);
			} else {
				RuntimeException_Sub2.method4704(local509, null, this);
			}
			this.method4728("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BB)Z")
	private boolean method4730(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method4728("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean382 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean379 = false;
		this.aBoolean380 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}
}
