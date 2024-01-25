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

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString79;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private static int anInt7464 = 0;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt7466;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt7467;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt7465 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean492 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean493 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean495 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean494 = false;

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean494 = false;
		this.aBoolean493 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLloader!e;IZ)Z")
	private boolean method5929(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(14) MessageDigest local14 = MessageDigest.getInstance("SHA");
			local14.reset();
			local14.update(arg0);
			@Pc(22) byte[] local22 = local14.digest();
			for (@Pc(24) int local24 = 0; local24 < 20; local24++) {
				if (local22[local24] != arg1.anIntArray639[local24]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(47) Exception local47) {
			this.method5930("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method5930(@OriginalArg(0) String arg0) {
		if (this.aBoolean492) {
			return;
		}
		this.aBoolean492 = true;
		try {
			if (aString79 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString79 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(61) Exception local61) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BZ)Z")
	private boolean method5931(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method5930("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean494 = true;
		this.aBoolean493 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!e;ZZ)[B")
	private byte[] method5932(@OriginalArg(0) Class273 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class275.anIntArray641[anInt7464]);
		@Pc(26) Color local26 = new Color(Class275.anIntArray640[anInt7464]);
		@Pc(30) byte[] local30 = new byte[arg0.anInt7458];
		try {
			@Pc(41) InputStream local41;
			if (arg1) {
				@Pc(46) URL local46 = this.getCodeBase();
				@Pc(54) Socket local54 = new Socket(InetAddress.getByName(local46.getHost()), 443);
				local54.setSoTimeout(10000);
				@Pc(60) OutputStream local60 = local54.getOutputStream();
				local60.write(17);
				local60.write(("JAGGRAB " + local46.getFile() + arg0.aString76 + "\n\n").getBytes());
				local41 = local54.getInputStream();
			} else {
				local41 = (new URL(this.getCodeBase(), arg0.aString76)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = 0;
			while (local30.length > local87) {
				@Pc(97) int local97 = local30.length - local87;
				if (local97 > 1000) {
					local97 = 1000;
				}
				@Pc(109) int local109 = local41.read(local30, local87, local97);
				if (local109 < 0) {
					throw new EOFException();
				}
				local87 += local109;
				@Pc(127) int local127 = local87 * 100 / local30.length;
				if (local85 != local127) {
					try {
						@Pc(133) Graphics local133 = this.getGraphics();
						if (local133 == null) {
							this.repaint();
						} else {
							local133.setColor(Color.black);
							local133.fillRect(0, 0, this.anInt7466, this.anInt7467);
							local133.setColor(local19);
							local133.drawRect(this.anInt7466 / 2 - 152, this.anInt7467 / 2 - 18, 303, 33);
							@Pc(183) String local183 = arg0.aStringArray50[this.anInt7465] + " - " + local127 + "%";
							local133.setFont(local8);
							local133.setColor(local26);
							local85 = local127;
							local133.drawString(local183, (this.anInt7466 - local12.stringWidth(local183)) / 2, this.anInt7467 / 2 + 4);
						}
					} catch (@Pc(214) Exception local214) {
					}
				}
			}
			local41.close();
			if (arg0.anInt7459 != arg0.anInt7458) {
				@Pc(228) byte[] local228 = new byte[arg0.anInt7459];
				@Pc(233) Inflater local233 = new Inflater(true);
				local233.setInput(local30);
				local30 = local228;
				local233.inflate(local228);
			}
		} catch (@Pc(244) Exception local244) {
			return null;
		}
		return this.method5929(local30, arg0, false) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!dr;ILloader!e;Z)[B")
	private byte[] method5933(@OriginalArg(0) Class272 arg0, @OriginalArg(2) Class273 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg0.method5892(arg1.aString77);
		} catch (@Pc(7) Exception local7) {
			this.method5930("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method5934(local5);
		if (!this.method5929(local24, arg1, arg2)) {
			local24 = this.method5932(arg1, false);
			if (local24 == null) {
				local24 = this.method5932(arg1, true);
			}
			if (local24 == null) {
				this.method5930("download");
				return null;
			}
			if (!this.method5931(local5, local24)) {
				return null;
			}
			local24 = this.method5934(local5);
			if (!this.method5929(local24, arg1, false)) {
				this.method5930("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method5934(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(8) int local8 = (int) arg0.length();
			@Pc(27) DataInputStream local27 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(30) byte[] local30 = new byte[local8];
			local27.readFully(local30, 0, local8);
			local27.close();
			return local30;
		} catch (@Pc(40) IOException local40) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean495 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString78 = this.getParameter("unsignedurl");
			if (aString78 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean492 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString78), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString79 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || local37 >= Class275.aStringArray51.length) {
					local37 = 0;
				}
			}
			@Pc(67) String local67 = this.getParameter("colourid");
			if (local67 != null) {
				anInt7464 = Integer.parseInt(local67);
				if (anInt7464 < 0 || anInt7464 >= Class275.anIntArray641.length) {
					anInt7464 = 0;
				}
			}
			this.anInt7466 = this.getSize().width;
			this.anInt7467 = this.getSize().height;
			@Pc(96) int local96 = 32;
			try {
				@Pc(101) int local101 = Integer.parseInt(this.getParameter("modewhat"));
				local96 += local101;
			} catch (@Pc(107) Exception local107) {
			}
			try {
				@Pc(111) String local111 = this.getParameter("lang");
				if (local111 != null) {
					this.anInt7465 = Integer.parseInt(local111);
				}
			} catch (@Pc(121) Exception local121) {
			}
			@Pc(131) Class272 local131;
			try {
				local131 = new Class272(this, local96, Class275.aStringArray51[local37], 30);
			} catch (@Pc(133) Exception local133) {
				this.method5930("nocache");
				return;
			}
			@Pc(140) unpack local140 = null;
			@Pc(150) byte[] local150;
			try {
				Class.forName("java.util.jar.Pack200");
				local150 = this.method5933(local131, Class275.aClass273_2, false);
				if (local150 == null) {
					return;
				}
				local140 = new unpack_Sub1(local150);
			} catch (@Pc(160) Throwable local160) {
			}
			if (local140 == null) {
				local150 = this.method5933(local131, Class275.aClass273_1, false);
				if (local150 == null) {
					return;
				}
				@Pc(181) unpack local181 = new unpack(local150);
				@Pc(186) ClassLoader_Sub1 local186 = new ClassLoader_Sub1(local181);
				@Pc(189) Class local189 = Class.forName("unpack");
				local186.method5922(local189, local189.getName());
				@Pc(199) Class local199 = local186.loadClass("unpackclass");
				@Pc(206) byte[] local206 = this.method5933(local131, Class275.aClass273_3, false);
				if (local206 == null) {
					return;
				}
				local140 = (unpack) local199.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local206, Boolean.TRUE);
			}
			@Pc(240) ClassLoader_Sub1 local240 = new ClassLoader_Sub1(local140);
			@Pc(242) byte local242 = -1;
			@Pc(246) String local246 = System.getProperty("os.name").toLowerCase();
			@Pc(250) String local250 = System.getProperty("os.arch").toLowerCase();
			if (local246.startsWith("win")) {
				if (local250.startsWith("amd64") || local250.startsWith("x86_64")) {
					local242 = 1;
				} else {
					local242 = 0;
				}
			} else if (local246.startsWith("linux")) {
				if (local250.startsWith("amd64") || local250.startsWith("x86_64")) {
					local242 = 3;
				} else {
					local242 = 2;
				}
			} else if (local246.startsWith("mac")) {
				if (local250.startsWith("ppc")) {
					local242 = 4;
				} else if (local250.startsWith("x86_64")) {
					local242 = 6;
				} else {
					local242 = 7;
				}
			}
			if (local242 != -1) {
				this.method5933(local131, Class275.aClass273Array1[local242], this.getParameter("suppress_sha") != null);
			}
			if (Class275.aClass273Array2 != null) {
				local242 = -1;
				local246 = System.getProperty("os.name").toLowerCase();
				local250 = System.getProperty("os.arch").toLowerCase();
				if (local246.startsWith("win")) {
					if (local250.startsWith("amd64") || local250.startsWith("x86_64")) {
						local242 = 2;
					} else {
						local242 = 0;
					}
				}
				if (local242 != -1) {
					this.method5933(local131, Class275.aClass273Array2[local242], this.getParameter("suppress_sha") != null);
				}
			}
			if (Class275.aClass273Array3 != null) {
				local242 = -1;
				local246 = System.getProperty("os.name").toLowerCase();
				local250 = System.getProperty("os.arch").toLowerCase();
				if (local246.startsWith("win") && !local250.startsWith("amd64") && !local250.startsWith("x86_64")) {
					local242 = 0;
				}
				if (local242 != -1) {
					this.method5933(local131, Class275.aClass273Array3[local242], this.getParameter("suppress_sha") != null);
				}
			}
			@Pc(434) Class local434 = Class.forName("Class276");
			local240.method5922(local434, local434.getName());
			@Pc(443) Class local443 = Class.forName("Class272");
			local240.method5922(local443, local443.getName());
			@Pc(452) Class local452 = Class.forName("Class277");
			local240.method5922(local452, local452.getName());
			@Pc(461) Class local461 = Class.forName("Class270");
			local240.method5922(local461, local461.getName());
			@Pc(470) Class local470 = Class.forName("Interface14");
			local240.method5922(local470, local470.getName());
			@Pc(480) Class local480 = local240.loadClass("client");
			synchronized (this) {
				if (this.aBoolean495) {
					return;
				}
				this.anApplet3 = (Applet) local480.getDeclaredConstructor().newInstance();
				local480.getMethod("providesignlink", local443).invoke(null, local131);
				this.anApplet3.init();
				if (this.aBoolean493) {
					this.anApplet3.start();
				}
				if (this.aBoolean494) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(539) Exception local539) {
			RuntimeException_Sub2.anInt7454 = 1655517202;
			if (local539 instanceof InvocationTargetException) {
				@Pc(548) Throwable local548 = ((InvocationTargetException) local539).getTargetException();
				if (local548 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5871(local548, this, local539.toString());
			} else {
				RuntimeException_Sub2.method5871(local539, this, null);
			}
			this.method5930("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean495 = true;
		this.aBoolean493 = this.aBoolean494 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}
}
