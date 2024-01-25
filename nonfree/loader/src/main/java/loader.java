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

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString71;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private static int anInt6995 = 0;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt6993;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt6994;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean623 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean625 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean624 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean626 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt6996 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method6025(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(10) FileOutputStream local10 = new FileOutputStream(arg0);
			local10.write(arg1, 0, arg1.length);
			local10.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method6029("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean625 = this.aBoolean624 = false;
		this.aBoolean626 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!b;BZ)[B")
	private byte[] method6026(@OriginalArg(0) Class219 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(26) Color local26 = new Color(Class221.anIntArray511[anInt6995]);
		@Pc(33) Color local33 = new Color(Class221.anIntArray512[anInt6995]);
		@Pc(37) byte[] local37 = new byte[arg0.anInt6990];
		try {
			@Pc(48) InputStream local48;
			if (arg1) {
				@Pc(53) URL local53 = this.getCodeBase();
				@Pc(61) Socket local61 = new Socket(InetAddress.getByName(local53.getHost()), 443);
				local61.setSoTimeout(10000);
				@Pc(67) OutputStream local67 = local61.getOutputStream();
				local67.write(17);
				local67.write(("JAGGRAB " + local53.getFile() + arg0.aString68 + "\n\n").getBytes());
				local48 = local61.getInputStream();
			} else {
				local48 = (new URL(this.getCodeBase(), arg0.aString68)).openStream();
			}
			@Pc(92) int local92 = -1;
			@Pc(94) int local94 = 0;
			while (local37.length > local94) {
				@Pc(103) int local103 = local37.length - local94;
				if (local103 > 1000) {
					local103 = 1000;
				}
				@Pc(115) int local115 = local48.read(local37, local94, local103);
				if (local115 < 0) {
					throw new EOFException();
				}
				local94 += local115;
				@Pc(133) int local133 = local94 * 100 / local37.length;
				if (local92 != local133) {
					try {
						@Pc(144) Graphics local144 = this.getGraphics();
						if (local144 == null) {
							this.repaint();
						} else {
							local144.setColor(Color.black);
							local144.fillRect(0, 0, this.anInt6993, this.anInt6994);
							local144.setColor(local26);
							local144.drawRect(this.anInt6993 / 2 - 152, this.anInt6994 / 2 + -18, 303, 33);
							@Pc(198) String local198 = arg0.aStringArray66[this.anInt6996] + " - " + local133 + "%";
							local144.setFont(local8);
							local144.setColor(local33);
							local144.drawString(local198, (this.anInt6993 - local12.stringWidth(local198)) / 2, this.anInt6994 / 2 + 4);
							local92 = local133;
						}
					} catch (@Pc(226) Exception local226) {
					}
				}
			}
			local48.close();
			if (arg0.anInt6990 != arg0.anInt6989) {
				@Pc(239) byte[] local239 = new byte[arg0.anInt6989];
				@Pc(244) Inflater local244 = new Inflater(true);
				local244.setInput(local37);
				local244.inflate(local239);
				local37 = local239;
			}
		} catch (@Pc(255) Exception local255) {
			return null;
		}
		return this.method6027(local37, arg0, false) ? local37 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLloader!b;ZB)Z")
	private boolean method6027(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class219 arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg0);
			@Pc(23) byte[] local23 = local9.digest();
			for (@Pc(25) int local25 = 0; local25 < 20; local25++) {
				if (arg1.anIntArray510[local25] != local23[local25]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(49) Exception local49) {
			this.method6029("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean626 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BZLloader!b;Lloader!rd;)[B")
	private byte[] method6028(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class219 arg1, @OriginalArg(3) Class224 arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg2.method6073(arg1.aString67);
		} catch (@Pc(7) Exception local7) {
			this.method6029("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method6030(local5);
		if (!this.method6027(local24, arg1, arg0)) {
			local24 = this.method6026(arg1, false);
			if (local24 == null) {
				local24 = this.method6026(arg1, true);
			}
			if (local24 == null) {
				this.method6029("download");
				return null;
			}
			if (!this.method6025(local5, local24)) {
				return null;
			}
			local24 = this.method6030(local5);
			if (!this.method6027(local24, arg1, false)) {
				this.method6029("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method6029(@OriginalArg(1) String arg0) {
		if (this.aBoolean623) {
			return;
		}
		this.aBoolean623 = true;
		try {
			if (aString70 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString70 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString71 = this.getParameter("unsignedurl");
			if (aString71 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean623 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString71), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString70 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || Class221.aStringArray67.length <= local38) {
					local38 = 0;
				}
			}
			@Pc(61) String local61 = this.getParameter("colourid");
			if (local61 != null) {
				anInt6995 = Integer.parseInt(local61);
				if (anInt6995 < 0 || Class221.anIntArray511.length <= anInt6995) {
					anInt6995 = 0;
				}
			}
			this.anInt6993 = this.getSize().width;
			this.anInt6994 = this.getSize().height;
			@Pc(91) int local91 = 32;
			try {
				@Pc(96) int local96 = Integer.parseInt(this.getParameter("modewhat"));
				local91 += local96;
			} catch (@Pc(102) Exception local102) {
			}
			try {
				@Pc(106) String local106 = this.getParameter("lang");
				if (local106 != null) {
					this.anInt6996 = Integer.parseInt(local106);
				}
			} catch (@Pc(114) Exception local114) {
			}
			@Pc(124) Class224 local124;
			try {
				local124 = new Class224(this, local91, Class221.aStringArray67[local38], 29);
			} catch (@Pc(126) Exception local126) {
				this.method6029("nocache");
				return;
			}
			@Pc(133) unpack local133 = null;
			@Pc(143) byte[] local143;
			try {
				Class.forName("java.util.jar.Pack200");
				local143 = this.method6028(false, Class221.aClass219_2, local124);
				if (local143 == null) {
					return;
				}
				local133 = new unpack_Sub1(local143);
			} catch (@Pc(154) Throwable local154) {
			}
			if (local133 == null) {
				local143 = this.method6028(false, Class221.aClass219_1, local124);
				if (local143 == null) {
					return;
				}
				@Pc(172) unpack local172 = new unpack(local143);
				@Pc(177) ClassLoader_Sub1 local177 = new ClassLoader_Sub1(local172);
				@Pc(180) Class local180 = Class.forName("unpack");
				local177.method6012(local180.getName(), local180);
				@Pc(190) Class local190 = local177.loadClass("unpackclass");
				@Pc(197) byte[] local197 = this.method6028(false, Class221.aClass219_3, local124);
				if (local197 == null) {
					return;
				}
				local133 = (unpack) local190.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local197, Boolean.TRUE);
			}
			@Pc(232) ClassLoader_Sub1 local232 = new ClassLoader_Sub1(local133);
			@Pc(234) byte local234 = -1;
			@Pc(238) String local238 = System.getProperty("os.name").toLowerCase();
			@Pc(242) String local242 = System.getProperty("os.arch").toLowerCase();
			if (local238.startsWith("win")) {
				if (local242.startsWith("amd64") || local242.startsWith("x86_64")) {
					local234 = 4;
				} else {
					local234 = 0;
				}
			} else if (local238.startsWith("linux")) {
				local234 = 1;
			} else if (local238.startsWith("mac")) {
				if (local242.startsWith("ppc")) {
					local234 = 2;
				} else if (local242.startsWith("x86_64")) {
					local234 = 5;
				} else {
					local234 = 3;
				}
			}
			if (local234 != -1) {
				for (@Pc(299) int local299 = 0; local299 < Class221.aClass219ArrayArray1[local234].length; local299++) {
					this.method6028(this.getParameter("suppress_sha") != null, Class221.aClass219ArrayArray1[local234][local299], local124);
				}
			}
			if (Class221.aClass219Array1 != null) {
				local234 = -1;
				local238 = System.getProperty("os.name").toLowerCase();
				local242 = System.getProperty("os.arch").toLowerCase();
				if (local238.startsWith("win")) {
					if (local242.startsWith("amd64") || local242.startsWith("x86_64")) {
						local234 = 2;
					} else {
						local234 = 0;
					}
				}
				if (local234 != -1) {
					this.method6028(this.getParameter("suppress_sha") != null, Class221.aClass219Array1[local234], local124);
				}
			}
			@Pc(378) Class local378 = Class.forName("Class223");
			local232.method6012(local378.getName(), local378);
			@Pc(387) Class local387 = Class.forName("Class224");
			local232.method6012(local387.getName(), local387);
			@Pc(396) Class local396 = Class.forName("Class225");
			local232.method6012(local396.getName(), local396);
			@Pc(405) Class local405 = Class.forName("Class220");
			local232.method6012(local405.getName(), local405);
			@Pc(414) Class local414 = Class.forName("Interface11");
			local232.method6012(local414.getName(), local414);
			@Pc(424) Class local424 = local232.loadClass("client");
			synchronized (this) {
				if (this.aBoolean626) {
					return;
				}
				this.anApplet2 = (Applet) local424.getDeclaredConstructor().newInstance();
				local424.getMethod("providesignlink", local387).invoke(null, local124);
				this.anApplet2.init();
				if (this.aBoolean625) {
					this.anApplet2.start();
				}
				if (this.aBoolean624) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(484) Exception local484) {
			RuntimeException_Sub2.anInt6991 = 608308998;
			if (local484 instanceof InvocationTargetException) {
				@Pc(493) Throwable local493 = ((InvocationTargetException) local484).getTargetException();
				if (local493 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6022(local493, local484.toString(), this);
			} else {
				RuntimeException_Sub2.method6022(local484, null, this);
			}
			this.method6029("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean624 = false;
		this.aBoolean625 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method6030(@OriginalArg(1) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean625 = false;
		this.aBoolean624 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}
}
