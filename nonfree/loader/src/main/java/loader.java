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
	private static String aString74;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString75;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private static int anInt7448 = 0;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt7446;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt7447;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean653 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean654 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt7449 = 0;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean655 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean656 = false;

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean656 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!h;IZ[B)Z")
	private boolean method6020(@OriginalArg(0) Class277 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg2);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(19) int local19 = 0; local19 < 20; local19++) {
				if (arg0.anIntArray549[local19] != local17[local19]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(41) Exception local41) {
			this.method6025("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B)[B")
	private byte[] method6021(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;I)Z")
	private boolean method6022(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method6025("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZBLloader!h;)[B")
	private byte[] method6023(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class277 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class274.anIntArray547[anInt7448]);
		@Pc(26) Color local26 = new Color(Class274.anIntArray548[anInt7448]);
		@Pc(30) byte[] local30 = new byte[arg1.anInt7444];
		try {
			@Pc(41) InputStream local41;
			if (arg0) {
				@Pc(46) URL local46 = this.getCodeBase();
				@Pc(54) Socket local54 = new Socket(InetAddress.getByName(local46.getHost()), 443);
				local54.setSoTimeout(10000);
				@Pc(60) OutputStream local60 = local54.getOutputStream();
				local60.write(17);
				local60.write(("JAGGRAB " + local46.getFile() + arg1.aString73 + "\n\n").getBytes());
				local41 = local54.getInputStream();
			} else {
				local41 = (new URL(this.getCodeBase(), arg1.aString73)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(93) int local93 = 0;
			while (local93 < local30.length) {
				@Pc(103) int local103 = local30.length - local93;
				if (local103 > 1000) {
					local103 = 1000;
				}
				@Pc(116) int local116 = local41.read(local30, local93, local103);
				if (local116 < 0) {
					throw new EOFException();
				}
				local93 += local116;
				@Pc(137) int local137 = local93 * 100 / local30.length;
				if (local85 != local137) {
					try {
						@Pc(143) Graphics local143 = this.getGraphics();
						if (local143 == null) {
							this.repaint();
						} else {
							local143.setColor(Color.black);
							local143.fillRect(0, 0, this.anInt7447, this.anInt7446);
							local143.setColor(local19);
							local143.drawRect(this.anInt7447 / 2 - 152, this.anInt7446 / 2 + -18, 303, 33);
							@Pc(196) String local196 = arg1.aStringArray54[this.anInt7449] + " - " + local137 + "%";
							local143.setFont(local8);
							local143.setColor(local26);
							local85 = local137;
							local143.drawString(local196, (this.anInt7447 - local12.stringWidth(local196)) / 2, this.anInt7446 / 2 + 4);
						}
					} catch (@Pc(223) Exception local223) {
					}
				}
			}
			local41.close();
			if (arg1.anInt7444 != arg1.anInt7445) {
				@Pc(237) byte[] local237 = new byte[arg1.anInt7445];
				@Pc(242) Inflater local242 = new Inflater(true);
				local242.setInput(local30);
				local242.inflate(local237);
				local30 = local237;
			}
		} catch (@Pc(253) Exception local253) {
			return null;
		}
		return this.method6020(arg1, false, local30) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!h;ZBLloader!nt;)[B")
	private byte[] method6024(@OriginalArg(0) Class277 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) Class279 arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg2.method6041(arg0.aString72);
		} catch (@Pc(13) Exception local13) {
			this.method6025("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method6021(local5);
		if (!this.method6020(arg0, arg1, local24)) {
			local24 = this.method6023(false, arg0);
			if (local24 == null) {
				local24 = this.method6023(true, arg0);
			}
			if (local24 == null) {
				this.method6025("download");
				return null;
			}
			if (!this.method6022(local24, local5)) {
				return null;
			}
			local24 = this.method6021(local5);
			if (!this.method6020(arg0, false, local24)) {
				this.method6025("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method6025(@OriginalArg(0) String arg0) {
		if (this.aBoolean653) {
			return;
		}
		this.aBoolean653 = true;
		try {
			if (aString75 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString75 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(49) Exception local49) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean655 = true;
		this.aBoolean654 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean654 = true;
		this.aBoolean655 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean656 = true;
		this.aBoolean655 = this.aBoolean654 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString74 = this.getParameter("unsignedurl");
			if (aString74 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean653 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString74), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString75 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || Class274.aStringArray53.length <= local38) {
					local38 = 0;
				}
			}
			@Pc(61) String local61 = this.getParameter("colourid");
			if (local61 != null) {
				anInt7448 = Integer.parseInt(local61);
				if (anInt7448 < 0 || anInt7448 >= Class274.anIntArray547.length) {
					anInt7448 = 0;
				}
			}
			this.anInt7447 = this.getSize().width;
			this.anInt7446 = this.getSize().height;
			@Pc(94) int local94 = 32;
			try {
				@Pc(99) int local99 = Integer.parseInt(this.getParameter("modewhat"));
				local94 += local99;
			} catch (@Pc(105) Exception local105) {
			}
			try {
				@Pc(109) String local109 = this.getParameter("lang");
				if (local109 != null) {
					this.anInt7449 = Integer.parseInt(local109);
				}
			} catch (@Pc(118) Exception local118) {
			}
			@Pc(128) Class279 local128;
			try {
				local128 = new Class279(this, local94, Class274.aStringArray53[local38], 30);
			} catch (@Pc(130) Exception local130) {
				this.method6025("nocache");
				return;
			}
			@Pc(137) unpack local137 = null;
			@Pc(147) byte[] local147;
			try {
				Class.forName("java.util.jar.Pack200");
				local147 = this.method6024(Class274.aClass277_2, false, local128);
				if (local147 == null) {
					return;
				}
				local137 = new unpack_Sub1(local147);
			} catch (@Pc(159) Throwable local159) {
			}
			if (local137 == null) {
				local147 = this.method6024(Class274.aClass277_1, false, local128);
				if (local147 == null) {
					return;
				}
				@Pc(179) unpack local179 = new unpack(local147);
				@Pc(184) ClassLoader_Sub1 local184 = new ClassLoader_Sub1(local179);
				@Pc(187) Class local187 = Class.forName("unpack");
				local184.method6003(local187, local187.getName());
				@Pc(197) Class local197 = local184.loadClass("unpackclass");
				@Pc(204) byte[] local204 = this.method6024(Class274.aClass277_3, false, local128);
				if (local204 == null) {
					return;
				}
				local137 = (unpack) local197.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local204, Boolean.TRUE);
			}
			@Pc(238) ClassLoader_Sub1 local238 = new ClassLoader_Sub1(local137);
			@Pc(240) byte local240 = -1;
			@Pc(244) String local244 = System.getProperty("os.name").toLowerCase();
			@Pc(248) String local248 = System.getProperty("os.arch").toLowerCase();
			if (local244.startsWith("win")) {
				if (local248.startsWith("amd64") || local248.startsWith("x86_64")) {
					local240 = 1;
				} else {
					local240 = 0;
				}
			} else if (local244.startsWith("linux")) {
				if (local248.startsWith("amd64") || local248.startsWith("x86_64")) {
					local240 = 3;
				} else {
					local240 = 2;
				}
			} else if (local244.startsWith("mac")) {
				if (local248.startsWith("ppc")) {
					local240 = 4;
				} else if (local248.startsWith("x86_64")) {
					local240 = 6;
				} else {
					local240 = 7;
				}
			}
			if (local240 != -1) {
				this.method6024(Class274.aClass277Array1[local240], this.getParameter("suppress_sha") != null, local128);
			}
			if (Class274.aClass277Array2 != null) {
				local240 = -1;
				local244 = System.getProperty("os.name").toLowerCase();
				local248 = System.getProperty("os.arch").toLowerCase();
				if (local244.startsWith("win")) {
					if (local248.startsWith("amd64") || local248.startsWith("x86_64")) {
						local240 = 2;
					} else {
						local240 = 0;
					}
				}
				if (local240 != -1) {
					this.method6024(Class274.aClass277Array2[local240], this.getParameter("suppress_sha") != null, local128);
				}
			}
			if (Class274.aClass277Array3 != null) {
				local240 = -1;
				local244 = System.getProperty("os.name").toLowerCase();
				local248 = System.getProperty("os.arch").toLowerCase();
				if (local244.startsWith("win") && !local248.startsWith("amd64") && !local248.startsWith("x86_64")) {
					local240 = 0;
				}
				if (local240 != -1) {
					this.method6024(Class274.aClass277Array3[local240], this.getParameter("suppress_sha") != null, local128);
				}
			}
			@Pc(433) Class local433 = Class.forName("Class280");
			local238.method6003(local433, local433.getName());
			@Pc(442) Class local442 = Class.forName("Class279");
			local238.method6003(local442, local442.getName());
			@Pc(451) Class local451 = Class.forName("Class281");
			local238.method6003(local451, local451.getName());
			@Pc(460) Class local460 = Class.forName("Class278");
			local238.method6003(local460, local460.getName());
			@Pc(469) Class local469 = Class.forName("Interface15");
			local238.method6003(local469, local469.getName());
			@Pc(479) Class local479 = local238.loadClass("client");
			synchronized (this) {
				if (this.aBoolean656) {
					return;
				}
				this.anApplet2 = (Applet) local479.getDeclaredConstructor().newInstance();
				local479.getMethod("providesignlink", local442).invoke(null, local128);
				this.anApplet2.init();
				if (this.aBoolean655) {
					this.anApplet2.start();
				}
				if (this.aBoolean654) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(539) Exception local539) {
			RuntimeException_Sub2.anInt7442 = -1663830085;
			if (local539 instanceof InvocationTargetException) {
				@Pc(555) Throwable local555 = ((InvocationTargetException) local539).getTargetException();
				if (local555 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6017(local539.toString(), local555, this);
			} else {
				RuntimeException_Sub2.method6017(null, local539, this);
			}
			this.method6025("crash");
		}
	}
}
