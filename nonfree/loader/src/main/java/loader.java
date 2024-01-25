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
	private static String aString73;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString74;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private static int anInt6440 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt6437;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt6439;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean599 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt6438 = 0;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean600 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean601 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean602 = false;

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean602 = false;
		this.aBoolean600 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean602 = this.aBoolean600 = false;
		this.aBoolean601 = true;
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;ZB)[B")
	private byte[] method5607(@OriginalArg(0) Class256 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class254.anIntArray753[anInt6440]);
		@Pc(26) Color local26 = new Color(Class254.anIntArray752[anInt6440]);
		@Pc(30) byte[] local30 = new byte[arg0.anInt6431];
		try {
			@Pc(72) InputStream local72;
			if (arg1) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg0.aString72 + "\n\n").getBytes());
				local72 = local43.getInputStream();
			} else {
				local72 = (new URL(this.getCodeBase(), arg0.aString72)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = 0;
			while (local30.length > local87) {
				@Pc(96) int local96 = local30.length - local87;
				if (local96 > 1000) {
					local96 = 1000;
				}
				@Pc(110) int local110 = local72.read(local30, local87, local96);
				if (local110 < 0) {
					throw new EOFException();
				}
				local87 += local110;
				@Pc(127) int local127 = local87 * 100 / local30.length;
				if (local127 != local85) {
					try {
						@Pc(138) Graphics local138 = this.getGraphics();
						if (local138 == null) {
							this.repaint();
						} else {
							local138.setColor(Color.black);
							local138.fillRect(0, 0, this.anInt6437, this.anInt6439);
							local138.setColor(local19);
							local138.drawRect(this.anInt6437 / 2 - 152, this.anInt6439 / 2 - 18, 303, 33);
							@Pc(188) String local188 = arg0.aStringArray91[this.anInt6438] + " - " + local127 + "%";
							local138.setFont(local8);
							local138.setColor(local26);
							local138.drawString(local188, (this.anInt6437 - local12.stringWidth(local188)) / 2, this.anInt6439 / 2 + 4);
							local85 = local127;
						}
					} catch (@Pc(219) Exception local219) {
					}
				}
			}
			local72.close();
			if (arg0.anInt6431 != arg0.anInt6432) {
				@Pc(236) byte[] local236 = new byte[arg0.anInt6432];
				@Pc(241) Inflater local241 = new Inflater(true);
				local241.setInput(local30);
				local241.inflate(local236);
				local30 = local236;
			}
		} catch (@Pc(252) Exception local252) {
			return null;
		}
		return this.method5609(arg0, local30, false) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method5608(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean601 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!f;[BZ)Z")
	private boolean method5609(@OriginalArg(1) Class256 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg1);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(19) int local19 = 0; local19 < 20; local19++) {
				if (local17[local19] != arg0.anIntArray754[local19]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(52) Exception local52) {
			this.method5611("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString73 = this.getParameter("unsignedurl");
			if (aString73 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(20) SecurityException local20) {
					this.aBoolean599 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString73), "_parent");
					} catch (@Pc(33) Exception local33) {
					}
					return;
				}
			}
			aString74 = this.getParameter("crashurl");
			@Pc(40) int local40 = 0;
			@Pc(44) String local44 = this.getParameter("cachesubdirid");
			if (local44 != null) {
				local40 = Integer.parseInt(local44);
				if (local40 < 0 || Class254.aStringArray90.length <= local40) {
					local40 = 0;
				}
			}
			@Pc(68) String local68 = this.getParameter("colourid");
			if (local68 != null) {
				anInt6440 = Integer.parseInt(local68);
				if (anInt6440 < 0 || Class254.anIntArray753.length <= anInt6440) {
					anInt6440 = 0;
				}
			}
			this.anInt6437 = this.getSize().width;
			this.anInt6439 = this.getSize().height;
			@Pc(98) int local98 = 32;
			try {
				@Pc(103) int local103 = Integer.parseInt(this.getParameter("modewhat"));
				local98 += local103;
			} catch (@Pc(109) Exception local109) {
			}
			try {
				@Pc(113) String local113 = this.getParameter("lang");
				if (local113 != null) {
					this.anInt6438 = Integer.parseInt(local113);
				}
			} catch (@Pc(122) Exception local122) {
			}
			@Pc(132) Class258 local132;
			try {
				local132 = new Class258(this, local98, Class254.aStringArray90[local40], 29);
			} catch (@Pc(134) Exception local134) {
				this.method5611("nocache");
				return;
			}
			@Pc(141) unpack local141 = null;
			@Pc(151) byte[] local151;
			try {
				Class.forName("java.util.jar.Pack200");
				local151 = this.method5612(false, local132, Class254.aClass256_2);
				if (local151 == null) {
					return;
				}
				local141 = new unpack_Sub1(local151);
			} catch (@Pc(162) Throwable local162) {
			}
			if (local141 == null) {
				local151 = this.method5612(false, local132, Class254.aClass256_1);
				if (local151 == null) {
					return;
				}
				@Pc(181) unpack local181 = new unpack(local151);
				@Pc(186) ClassLoader_Sub1 local186 = new ClassLoader_Sub1(local181);
				@Pc(189) Class local189 = Class.forName("unpack");
				local186.method5594(local189.getName(), local189);
				@Pc(199) Class local199 = local186.loadClass("unpackclass");
				@Pc(206) byte[] local206 = this.method5612(false, local132, Class254.aClass256_3);
				if (local206 == null) {
					return;
				}
				local141 = (unpack) local199.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local206, Boolean.TRUE);
			}
			@Pc(242) ClassLoader_Sub1 local242 = new ClassLoader_Sub1(local141);
			@Pc(244) byte local244 = -1;
			@Pc(248) String local248 = System.getProperty("os.name").toLowerCase();
			@Pc(252) String local252 = System.getProperty("os.arch").toLowerCase();
			if (local248.startsWith("win")) {
				if (local252.startsWith("amd64") || local252.startsWith("x86_64")) {
					local244 = 4;
				} else {
					local244 = 0;
				}
			} else if (local248.startsWith("linux")) {
				local244 = 1;
			} else if (local248.startsWith("mac")) {
				if (local252.startsWith("ppc")) {
					local244 = 2;
				} else if (local252.startsWith("x86_64")) {
					local244 = 5;
				} else {
					local244 = 3;
				}
			}
			if (local244 != -1) {
				for (@Pc(309) int local309 = 0; local309 < Class254.aClass256ArrayArray1[local244].length; local309++) {
					this.method5612(this.getParameter("suppress_sha") != null, local132, Class254.aClass256ArrayArray1[local244][local309]);
				}
			}
			if (Class254.aClass256Array1 != null) {
				local244 = -1;
				local248 = System.getProperty("os.name").toLowerCase();
				local252 = System.getProperty("os.arch").toLowerCase();
				if (local248.startsWith("win")) {
					if (local252.startsWith("amd64") || local252.startsWith("x86_64")) {
						local244 = 2;
					} else {
						local244 = 0;
					}
				}
				if (local244 != -1) {
					this.method5612(this.getParameter("suppress_sha") != null, local132, Class254.aClass256Array1[local244]);
				}
			}
			@Pc(388) Class local388 = Class.forName("Class259");
			local242.method5594(local388.getName(), local388);
			@Pc(397) Class local397 = Class.forName("Class258");
			local242.method5594(local397.getName(), local397);
			@Pc(406) Class local406 = Class.forName("Class257");
			local242.method5594(local406.getName(), local406);
			@Pc(415) Class local415 = Class.forName("Class260");
			local242.method5594(local415.getName(), local415);
			@Pc(424) Class local424 = Class.forName("Interface13");
			local242.method5594(local424.getName(), local424);
			@Pc(434) Class local434 = local242.loadClass("client");
			synchronized (this) {
				if (this.aBoolean601) {
					return;
				}
				this.anApplet2 = (Applet) local434.getDeclaredConstructor().newInstance();
				local434.getMethod("providesignlink", local397).invoke(null, local132);
				this.anApplet2.init();
				if (this.aBoolean602) {
					this.anApplet2.start();
				}
				if (this.aBoolean600) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(494) Exception local494) {
			RuntimeException_Sub2.anInt6429 = -931274037;
			if (local494 instanceof InvocationTargetException) {
				@Pc(510) Throwable local510 = ((InvocationTargetException) local494).getTargetException();
				if (local510 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5601(local494.toString(), local510, this);
			} else {
				RuntimeException_Sub2.method5601(null, local494, this);
			}
			this.method5611("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method5610(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method5611("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean602 = true;
		this.aBoolean600 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method5611(@OriginalArg(1) String arg0) {
		if (this.aBoolean599) {
			return;
		}
		this.aBoolean599 = true;
		try {
			if (aString74 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString74 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IZLloader!ng;Lloader!f;)[B")
	private byte[] method5612(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class258 arg1, @OriginalArg(3) Class256 arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg1.method5632(arg2.aString71);
		} catch (@Pc(7) Exception local7) {
			this.method5611("nocache");
			return null;
		}
		@Pc(18) byte[] local18 = this.method5608(local5);
		if (!this.method5609(arg2, local18, arg0)) {
			local18 = this.method5607(arg2, false);
			if (local18 == null) {
				local18 = this.method5607(arg2, true);
			}
			if (local18 == null) {
				this.method5611("download");
				return null;
			}
			if (!this.method5610(local5, local18)) {
				return null;
			}
			local18 = this.method5608(local5);
			if (!this.method5609(arg2, local18, false)) {
				this.method5611("mismatch");
				return null;
			}
		}
		return local18;
	}
}
