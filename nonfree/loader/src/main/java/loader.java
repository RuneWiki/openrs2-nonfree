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
	private static String aString91;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString92;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private static int anInt7559 = 0;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt7556;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt7557;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean825 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean823 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean826 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt7558 = 0;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean824 = false;

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean825 = false;
		this.aBoolean824 = true;
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

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean826 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method6029(@OriginalArg(0) String arg0) {
		if (this.aBoolean823) {
			return;
		}
		this.aBoolean823 = true;
		try {
			if (aString92 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString92 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(61) Exception local61) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!f;Z[B)Z")
	private boolean method6030(@OriginalArg(1) Class275 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg2);
			@Pc(18) byte[] local18 = local10.digest();
			for (@Pc(20) int local20 = 0; local20 < 20; local20++) {
				if (arg0.anIntArray522[local20] != local18[local20]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(45) Exception local45) {
			this.method6029("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean825 = true;
		this.aBoolean824 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;I)Z")
	private boolean method6031(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(11) FileOutputStream local11 = new FileOutputStream(arg1);
			local11.write(arg0, 0, arg0.length);
			local11.close();
			return true;
		} catch (@Pc(22) IOException local22) {
			this.method6029("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;IZLloader!fq;)[B")
	private byte[] method6032(@OriginalArg(0) Class275 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class276 arg2) {
		@Pc(7) File local7;
		try {
			local7 = arg2.method5994(arg0.aString81);
		} catch (@Pc(9) Exception local9) {
			this.method6029("nocache");
			return null;
		}
		@Pc(22) byte[] local22 = this.method6034(local7);
		if (!this.method6030(arg0, arg1, local22)) {
			local22 = this.method6033(arg0, false);
			if (local22 == null) {
				local22 = this.method6033(arg0, true);
			}
			if (local22 == null) {
				this.method6029("download");
				return null;
			}
			if (!this.method6031(local22, local7)) {
				return null;
			}
			local22 = this.method6034(local7);
			if (!this.method6030(arg0, false, local22)) {
				this.method6029("mismatch");
				return null;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString91 = this.getParameter("unsignedurl");
			if (aString91 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean823 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString91), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString92 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || Class278.aStringArray50.length <= local38) {
					local38 = 0;
				}
			}
			@Pc(61) String local61 = this.getParameter("colourid");
			if (local61 != null) {
				anInt7559 = Integer.parseInt(local61);
				if (anInt7559 < 0 || anInt7559 >= Class278.anIntArray523.length) {
					anInt7559 = 0;
				}
			}
			this.anInt7556 = this.getSize().width;
			this.anInt7557 = this.getSize().height;
			@Pc(86) int local86 = 32;
			try {
				@Pc(91) int local91 = Integer.parseInt(this.getParameter("modewhat"));
				local86 += local91;
			} catch (@Pc(97) Exception local97) {
			}
			try {
				@Pc(101) String local101 = this.getParameter("lang");
				if (local101 != null) {
					this.anInt7558 = Integer.parseInt(local101);
				}
			} catch (@Pc(110) Exception local110) {
			}
			@Pc(120) Class276 local120;
			try {
				local120 = new Class276(this, local86, Class278.aStringArray50[local38], 30);
			} catch (@Pc(122) Exception local122) {
				this.method6029("nocache");
				return;
			}
			@Pc(129) unpack local129 = null;
			@Pc(139) byte[] local139;
			try {
				Class.forName("java.util.jar.Pack200");
				local139 = this.method6032(Class278.aClass275_2, false, local120);
				if (local139 == null) {
					return;
				}
				local129 = new unpack_Sub1(local139);
			} catch (@Pc(151) Throwable local151) {
			}
			if (local129 == null) {
				local139 = this.method6032(Class278.aClass275_1, false, local120);
				if (local139 == null) {
					return;
				}
				@Pc(169) unpack local169 = new unpack(local139);
				@Pc(174) ClassLoader_Sub1 local174 = new ClassLoader_Sub1(local169);
				@Pc(177) Class local177 = Class.forName("unpack");
				local174.method5974(local177.getName(), local177);
				@Pc(187) Class local187 = local174.loadClass("unpackclass");
				@Pc(194) byte[] local194 = this.method6032(Class278.aClass275_3, false, local120);
				if (local194 == null) {
					return;
				}
				local129 = (unpack) local187.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local194, Boolean.TRUE);
			}
			@Pc(230) ClassLoader_Sub1 local230 = new ClassLoader_Sub1(local129);
			@Pc(232) byte local232 = -1;
			@Pc(236) String local236 = System.getProperty("os.name").toLowerCase();
			@Pc(240) String local240 = System.getProperty("os.arch").toLowerCase();
			if (local236.startsWith("win")) {
				if (local240.startsWith("amd64") || local240.startsWith("x86_64")) {
					local232 = 1;
				} else {
					local232 = 0;
				}
			} else if (local236.startsWith("linux")) {
				if (local240.startsWith("amd64") || local240.startsWith("x86_64")) {
					local232 = 3;
				} else {
					local232 = 2;
				}
			} else if (local236.startsWith("mac")) {
				if (local240.startsWith("ppc")) {
					local232 = 4;
				} else if (local240.startsWith("x86_64")) {
					local232 = 6;
				} else {
					local232 = 7;
				}
			}
			if (local232 != -1) {
				this.method6032(Class278.aClass275Array1[local232], this.getParameter("suppress_sha") != null, local120);
			}
			if (Class278.aClass275Array2 != null) {
				local232 = -1;
				local236 = System.getProperty("os.name").toLowerCase();
				local240 = System.getProperty("os.arch").toLowerCase();
				if (local236.startsWith("win")) {
					if (local240.startsWith("amd64") || local240.startsWith("x86_64")) {
						local232 = 2;
					} else {
						local232 = 0;
					}
				}
				if (local232 != -1) {
					this.method6032(Class278.aClass275Array2[local232], this.getParameter("suppress_sha") != null, local120);
				}
			}
			if (Class278.aClass275Array3 != null) {
				local232 = -1;
				local236 = System.getProperty("os.name").toLowerCase();
				local240 = System.getProperty("os.arch").toLowerCase();
				if (local236.startsWith("win") && !local240.startsWith("amd64") && !local240.startsWith("x86_64")) {
					local232 = 0;
				}
				if (local232 != -1) {
					this.method6032(Class278.aClass275Array3[local232], this.getParameter("suppress_sha") != null, local120);
				}
			}
			@Pc(423) Class local423 = Class.forName("Class279");
			local230.method5974(local423.getName(), local423);
			@Pc(432) Class local432 = Class.forName("Class276");
			local230.method5974(local432.getName(), local432);
			@Pc(441) Class local441 = Class.forName("Class280");
			local230.method5974(local441.getName(), local441);
			@Pc(450) Class local450 = Class.forName("Class274");
			local230.method5974(local450.getName(), local450);
			@Pc(459) Class local459 = Class.forName("Interface14");
			local230.method5974(local459.getName(), local459);
			@Pc(469) Class local469 = local230.loadClass("client");
			synchronized (this) {
				if (this.aBoolean826) {
					return;
				}
				this.anApplet3 = (Applet) local469.getDeclaredConstructor().newInstance();
				local469.getMethod("providesignlink", local432).invoke(null, local120);
				this.anApplet3.init();
				if (this.aBoolean825) {
					this.anApplet3.start();
				}
				if (this.aBoolean824) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(527) Exception local527) {
			RuntimeException_Sub2.anInt7550 = -1602248974;
			if (local527 instanceof InvocationTargetException) {
				@Pc(543) Throwable local543 = ((InvocationTargetException) local527).getTargetException();
				if (local543 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5979(this, local543, local527.toString());
			} else {
				RuntimeException_Sub2.method5979(this, local527, null);
			}
			this.method6029("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;BZ)[B")
	private byte[] method6033(@OriginalArg(0) Class275 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(20) FontMetrics local20 = this.getFontMetrics(local8);
		@Pc(27) Color local27 = new Color(Class278.anIntArray523[anInt7559]);
		@Pc(34) Color local34 = new Color(Class278.anIntArray524[anInt7559]);
		@Pc(38) byte[] local38 = new byte[arg0.anInt7552];
		try {
			@Pc(49) InputStream local49;
			if (arg1) {
				@Pc(54) URL local54 = this.getCodeBase();
				@Pc(62) Socket local62 = new Socket(InetAddress.getByName(local54.getHost()), 443);
				local62.setSoTimeout(10000);
				@Pc(68) OutputStream local68 = local62.getOutputStream();
				local68.write(17);
				local68.write(("JAGGRAB " + local54.getFile() + arg0.aString82 + "\n\n").getBytes());
				local49 = local62.getInputStream();
			} else {
				local49 = (new URL(this.getCodeBase(), arg0.aString82)).openStream();
			}
			@Pc(93) int local93 = -1;
			@Pc(95) int local95 = 0;
			while (local38.length > local95) {
				@Pc(109) int local109 = local38.length - local95;
				if (local109 > 1000) {
					local109 = 1000;
				}
				@Pc(120) int local120 = local49.read(local38, local95, local109);
				if (local120 < 0) {
					throw new EOFException();
				}
				local95 += local120;
				@Pc(140) int local140 = local95 * 100 / local38.length;
				if (local140 != local93) {
					try {
						@Pc(151) Graphics local151 = this.getGraphics();
						if (local151 == null) {
							this.repaint();
						} else {
							local151.setColor(Color.black);
							local151.fillRect(0, 0, this.anInt7556, this.anInt7557);
							local151.setColor(local27);
							local151.drawRect(this.anInt7556 / 2 - 152, this.anInt7557 / 2 - 18, 303, 33);
							@Pc(205) String local205 = arg0.aStringArray49[this.anInt7558] + " - " + local140 + "%";
							local151.setFont(local8);
							local151.setColor(local34);
							local93 = local140;
							local151.drawString(local205, (this.anInt7556 - local20.stringWidth(local205)) / 2, this.anInt7557 / 2 + 4);
						}
					} catch (@Pc(232) Exception local232) {
					}
				}
			}
			local49.close();
			if (arg0.anInt7553 != arg0.anInt7552) {
				@Pc(249) byte[] local249 = new byte[arg0.anInt7553];
				@Pc(254) Inflater local254 = new Inflater(true);
				local254.setInput(local38);
				local38 = local249;
				local254.inflate(local249);
			}
		} catch (@Pc(265) Exception local265) {
			return null;
		}
		return this.method6030(arg0, false, local38) ? local38 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method6034(@OriginalArg(1) File arg0) {
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
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean826 = true;
		this.aBoolean825 = this.aBoolean824 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}
}
