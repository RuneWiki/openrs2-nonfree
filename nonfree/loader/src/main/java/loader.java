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

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString100;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString101;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private static int anInt7806 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt7804;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt7807;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean664 = false;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt7805 = 0;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean665 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean663 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean666 = false;

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString100 = this.getParameter("unsignedurl");
			if (aString100 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean663 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString100), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			aString101 = this.getParameter("crashurl");
			@Pc(39) int local39 = 0;
			@Pc(43) String local43 = this.getParameter("cachesubdirid");
			if (local43 != null) {
				local39 = Integer.parseInt(local43);
				if (local39 < 0 || local39 >= Class274.aStringArray47.length) {
					local39 = 0;
				}
			}
			@Pc(67) String local67 = this.getParameter("colourid");
			if (local67 != null) {
				anInt7806 = Integer.parseInt(local67);
				if (anInt7806 < 0 || Class274.anIntArray587.length <= anInt7806) {
					anInt7806 = 0;
				}
			}
			this.anInt7807 = this.getSize().width;
			this.anInt7804 = this.getSize().height;
			@Pc(98) int local98 = 32;
			try {
				@Pc(103) int local103 = Integer.parseInt(this.getParameter("modewhat"));
				local98 += local103;
			} catch (@Pc(109) Exception local109) {
			}
			try {
				@Pc(113) String local113 = this.getParameter("lang");
				if (local113 != null) {
					this.anInt7805 = Integer.parseInt(local113);
				}
			} catch (@Pc(122) Exception local122) {
			}
			@Pc(132) Class269 local132;
			try {
				local132 = new Class269(this, local98, Class274.aStringArray47[local39], 30);
			} catch (@Pc(134) Exception local134) {
				this.method6064("nocache");
				return;
			}
			@Pc(141) unpack local141 = null;
			@Pc(151) byte[] local151;
			try {
				Class.forName("java.util.jar.Pack200");
				local151 = this.method6066(Class274.aClass272_2, false, local132);
				if (local151 == null) {
					return;
				}
				local141 = new unpack_Sub1(local151);
			} catch (@Pc(163) Throwable local163) {
			}
			if (local141 == null) {
				local151 = this.method6066(Class274.aClass272_1, false, local132);
				if (local151 == null) {
					return;
				}
				@Pc(181) unpack local181 = new unpack(local151);
				@Pc(186) ClassLoader_Sub1 local186 = new ClassLoader_Sub1(local181);
				@Pc(189) Class local189 = Class.forName("unpack");
				local186.method6056(local189.getName(), local189);
				@Pc(199) Class local199 = local186.loadClass("unpackclass");
				@Pc(206) byte[] local206 = this.method6066(Class274.aClass272_3, false, local132);
				if (local206 == null) {
					return;
				}
				local141 = (unpack) local199.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local206, Boolean.TRUE);
			}
			@Pc(241) ClassLoader_Sub1 local241 = new ClassLoader_Sub1(local141);
			@Pc(243) byte local243 = -1;
			@Pc(247) String local247 = System.getProperty("os.name").toLowerCase();
			@Pc(251) String local251 = System.getProperty("os.arch").toLowerCase();
			if (local247.startsWith("win")) {
				if (local251.startsWith("amd64") || local251.startsWith("x86_64")) {
					local243 = 1;
				} else {
					local243 = 0;
				}
			} else if (local247.startsWith("linux")) {
				if (local251.startsWith("amd64") || local251.startsWith("x86_64")) {
					local243 = 3;
				} else {
					local243 = 2;
				}
			} else if (local247.startsWith("mac")) {
				if (local251.startsWith("ppc")) {
					local243 = 4;
				} else if (local251.startsWith("x86_64")) {
					local243 = 6;
				} else {
					local243 = 7;
				}
			}
			if (local243 != -1) {
				this.method6066(Class274.aClass272Array1[local243], this.getParameter("suppress_sha") != null, local132);
			}
			if (Class274.aClass272Array2 != null) {
				local243 = -1;
				local247 = System.getProperty("os.name").toLowerCase();
				local251 = System.getProperty("os.arch").toLowerCase();
				if (local247.startsWith("win")) {
					if (local251.startsWith("amd64") || local251.startsWith("x86_64")) {
						local243 = 2;
					} else {
						local243 = 0;
					}
				}
				if (local243 != -1) {
					this.method6066(Class274.aClass272Array2[local243], this.getParameter("suppress_sha") != null, local132);
				}
			}
			if (Class274.aClass272Array3 != null) {
				local243 = -1;
				local247 = System.getProperty("os.name").toLowerCase();
				local251 = System.getProperty("os.arch").toLowerCase();
				if (local247.startsWith("win") && !local251.startsWith("amd64") && !local251.startsWith("x86_64")) {
					local243 = 0;
				}
				if (local243 != -1) {
					this.method6066(Class274.aClass272Array3[local243], this.getParameter("suppress_sha") != null, local132);
				}
			}
			@Pc(432) Class local432 = Class.forName("Class275");
			local241.method6056(local432.getName(), local432);
			@Pc(441) Class local441 = Class.forName("Class269");
			local241.method6056(local441.getName(), local441);
			@Pc(450) Class local450 = Class.forName("Class276");
			local241.method6056(local450.getName(), local450);
			@Pc(459) Class local459 = Class.forName("Class273");
			local241.method6056(local459.getName(), local459);
			@Pc(468) Class local468 = Class.forName("Interface14");
			local241.method6056(local468.getName(), local468);
			@Pc(478) Class local478 = local241.loadClass("client");
			synchronized (this) {
				if (this.aBoolean666) {
					return;
				}
				this.anApplet3 = (Applet) local478.getDeclaredConstructor().newInstance();
				local478.getMethod("providesignlink", local441).invoke(null, local132);
				this.anApplet3.init();
				if (this.aBoolean665) {
					this.anApplet3.start();
				}
				if (this.aBoolean664) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(538) Exception local538) {
			RuntimeException_Sub2.anInt7798 = -1012054337;
			if (local538 instanceof InvocationTargetException) {
				@Pc(547) Throwable local547 = ((InvocationTargetException) local538).getTargetException();
				if (local547 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6012(local547, this, local538.toString());
			} else {
				RuntimeException_Sub2.method6012(local538, this, null);
			}
			this.method6064("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;[B)Z")
	private boolean method6063(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg0);
			local9.write(arg1, 0, arg1.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method6064("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean665 = true;
		this.aBoolean664 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean664 = true;
		this.aBoolean665 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method6064(@OriginalArg(1) String arg0) {
		if (this.aBoolean663) {
			return;
		}
		this.aBoolean663 = true;
		try {
			if (aString101 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString101 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BZLloader!f;)Z")
	private boolean method6065(@OriginalArg(1) byte[] arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class272 arg2) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg0);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(19) int local19 = 0; local19 < 20; local19++) {
				if (local17[local19] != arg2.anIntArray585[local19]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(45) Exception local45) {
			this.method6064("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!f;ZLloader!ci;)[B")
	private byte[] method6066(@OriginalArg(1) Class272 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class269 arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg2.method6021(arg0.aString98);
		} catch (@Pc(13) Exception local13) {
			this.method6064("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method6067(local5);
		if (!this.method6065(local24, arg1, arg0)) {
			local24 = this.method6068(false, arg0);
			if (local24 == null) {
				local24 = this.method6068(true, arg0);
			}
			if (local24 == null) {
				this.method6064("download");
				return null;
			}
			if (!this.method6063(local5, local24)) {
				return null;
			}
			local24 = this.method6067(local5);
			if (!this.method6065(local24, false, arg0)) {
				this.method6064("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method6067(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(19) DataInputStream local19 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(22) byte[] local22 = new byte[local8];
			local19.readFully(local22, 0, local8);
			local19.close();
			return local22;
		} catch (@Pc(32) IOException local32) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean666 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean665 = this.aBoolean664 = false;
		this.aBoolean666 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IZLloader!f;)[B")
	private byte[] method6068(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class272 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class274.anIntArray587[anInt7806]);
		@Pc(26) Color local26 = new Color(Class274.anIntArray586[anInt7806]);
		@Pc(30) byte[] local30 = new byte[arg1.anInt7803];
		try {
			@Pc(41) InputStream local41;
			if (arg0) {
				@Pc(46) URL local46 = this.getCodeBase();
				@Pc(54) Socket local54 = new Socket(InetAddress.getByName(local46.getHost()), 443);
				local54.setSoTimeout(10000);
				@Pc(60) OutputStream local60 = local54.getOutputStream();
				local60.write(17);
				local60.write(("JAGGRAB " + local46.getFile() + arg1.aString99 + "\n\n").getBytes());
				local41 = local54.getInputStream();
			} else {
				local41 = (new URL(this.getCodeBase(), arg1.aString99)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = 0;
			while (local30.length > local87) {
				@Pc(97) int local97 = local30.length - local87;
				if (local97 > 1000) {
					local97 = 1000;
				}
				@Pc(110) int local110 = local41.read(local30, local87, local97);
				if (local110 < 0) {
					throw new EOFException();
				}
				local87 += local110;
				@Pc(130) int local130 = local87 * 100 / local30.length;
				if (local130 != local85) {
					try {
						@Pc(137) Graphics local137 = this.getGraphics();
						if (local137 == null) {
							this.repaint();
						} else {
							local137.setColor(Color.black);
							local137.fillRect(0, 0, this.anInt7807, this.anInt7804);
							local137.setColor(local19);
							local137.drawRect(this.anInt7807 / 2 - 152, this.anInt7804 / 2 + -18, 303, 33);
							@Pc(187) String local187 = arg1.aStringArray46[this.anInt7805] + " - " + local130 + "%";
							local137.setFont(local8);
							local137.setColor(local26);
							local85 = local130;
							local137.drawString(local187, (this.anInt7807 - local12.stringWidth(local187)) / 2, this.anInt7804 / 2 + 4);
						}
					} catch (@Pc(218) Exception local218) {
					}
				}
			}
			local41.close();
			if (arg1.anInt7802 != arg1.anInt7803) {
				@Pc(235) byte[] local235 = new byte[arg1.anInt7802];
				@Pc(240) Inflater local240 = new Inflater(true);
				local240.setInput(local30);
				local30 = local235;
				local240.inflate(local235);
			}
		} catch (@Pc(251) Exception local251) {
			return null;
		}
		return this.method6065(local30, false, arg1) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}
}
