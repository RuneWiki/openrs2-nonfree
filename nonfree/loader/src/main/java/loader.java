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
	private static String aString71;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString72;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private static int anInt7982 = 0;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt7981;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt7983;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean521 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean522 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean523 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean524 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt7984 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private void method6231(@OriginalArg(1) String arg0) {
		if (this.aBoolean524) {
			return;
		}
		this.aBoolean524 = true;
		try {
			if (aString72 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString72 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(49) Exception local49) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean522 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString71 = this.getParameter("unsignedurl");
			if (aString71 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean524 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString71), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			aString72 = this.getParameter("crashurl");
			@Pc(39) int local39 = 0;
			@Pc(43) String local43 = this.getParameter("cachesubdirid");
			if (local43 != null) {
				local39 = Integer.parseInt(local43);
				if (local39 < 0 || Class276.aStringArray47.length <= local39) {
					local39 = 0;
				}
			}
			@Pc(67) String local67 = this.getParameter("colourid");
			if (local67 != null) {
				anInt7982 = Integer.parseInt(local67);
				if (anInt7982 < 0 || Class276.anIntArray755.length <= anInt7982) {
					anInt7982 = 0;
				}
			}
			this.anInt7981 = this.getSize().width;
			this.anInt7983 = this.getSize().height;
			@Pc(100) int local100 = 32;
			try {
				@Pc(105) int local105 = Integer.parseInt(this.getParameter("modewhat"));
				local100 += local105;
			} catch (@Pc(111) Exception local111) {
			}
			try {
				@Pc(115) String local115 = this.getParameter("lang");
				if (local115 != null) {
					this.anInt7984 = Integer.parseInt(local115);
				}
			} catch (@Pc(124) Exception local124) {
			}
			@Pc(134) Class280 local134;
			try {
				local134 = new Class280(this, local100, Class276.aStringArray47[local39], 30);
			} catch (@Pc(136) Exception local136) {
				this.method6231("nocache");
				return;
			}
			@Pc(143) unpack local143 = null;
			@Pc(153) byte[] local153;
			try {
				Class.forName("java.util.jar.Pack200");
				local153 = this.method6235(false, local134, Class276.aClass274_2);
				if (local153 == null) {
					return;
				}
				local143 = new unpack_Sub1(local153);
			} catch (@Pc(164) Throwable local164) {
			}
			if (local143 == null) {
				local153 = this.method6235(false, local134, Class276.aClass274_1);
				if (local153 == null) {
					return;
				}
				@Pc(183) unpack local183 = new unpack(local153);
				@Pc(188) ClassLoader_Sub1 local188 = new ClassLoader_Sub1(local183);
				@Pc(191) Class local191 = Class.forName("unpack");
				local188.method6224(local191.getName(), local191);
				@Pc(201) Class local201 = local188.loadClass("unpackclass");
				@Pc(208) byte[] local208 = this.method6235(false, local134, Class276.aClass274_3);
				if (local208 == null) {
					return;
				}
				local143 = (unpack) local201.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local208, Boolean.TRUE);
			}
			@Pc(242) ClassLoader_Sub1 local242 = new ClassLoader_Sub1(local143);
			@Pc(244) byte local244 = -1;
			@Pc(248) String local248 = System.getProperty("os.name").toLowerCase();
			@Pc(252) String local252 = System.getProperty("os.arch").toLowerCase();
			if (local248.startsWith("win")) {
				if (local252.startsWith("amd64") || local252.startsWith("x86_64")) {
					local244 = 1;
				} else {
					local244 = 0;
				}
			} else if (local248.startsWith("linux")) {
				if (local252.startsWith("amd64") || local252.startsWith("x86_64")) {
					local244 = 3;
				} else {
					local244 = 2;
				}
			} else if (local248.startsWith("mac")) {
				if (local252.startsWith("ppc")) {
					local244 = 4;
				} else if (local252.startsWith("x86_64")) {
					local244 = 6;
				} else {
					local244 = 7;
				}
			}
			if (local244 != -1) {
				this.method6235(this.getParameter("suppress_sha") != null, local134, Class276.aClass274Array1[local244]);
			}
			if (Class276.aClass274Array2 != null) {
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
					this.method6235(this.getParameter("suppress_sha") != null, local134, Class276.aClass274Array2[local244]);
				}
			}
			if (Class276.aClass274Array3 != null) {
				local244 = -1;
				local248 = System.getProperty("os.name").toLowerCase();
				local252 = System.getProperty("os.arch").toLowerCase();
				if (local248.startsWith("win") && !local252.startsWith("amd64") && !local252.startsWith("x86_64")) {
					local244 = 0;
				}
				if (local244 != -1) {
					this.method6235(this.getParameter("suppress_sha") != null, local134, Class276.aClass274Array3[local244]);
				}
			}
			@Pc(434) Class local434 = Class.forName("Class277");
			local242.method6224(local434.getName(), local434);
			@Pc(443) Class local443 = Class.forName("Class280");
			local242.method6224(local443.getName(), local443);
			@Pc(452) Class local452 = Class.forName("Class278");
			local242.method6224(local452.getName(), local452);
			@Pc(461) Class local461 = Class.forName("Class279");
			local242.method6224(local461.getName(), local461);
			@Pc(470) Class local470 = Class.forName("Interface14");
			local242.method6224(local470.getName(), local470);
			@Pc(480) Class local480 = local242.loadClass("client");
			synchronized (this) {
				if (this.aBoolean522) {
					return;
				}
				this.anApplet2 = (Applet) local480.getDeclaredConstructor().newInstance();
				local480.getMethod("providesignlink", local443).invoke(null, local134);
				this.anApplet2.init();
				if (this.aBoolean521) {
					this.anApplet2.start();
				}
				if (this.aBoolean523) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(540) Exception local540) {
			RuntimeException_Sub2.anInt7975 = 709819036;
			if (local540 instanceof InvocationTargetException) {
				@Pc(549) Throwable local549 = ((InvocationTargetException) local540).getTargetException();
				if (local549 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6223(local540.toString(), this, local549);
			} else {
				RuntimeException_Sub2.method6223(null, this, local540);
			}
			this.method6231("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean522 = true;
		this.aBoolean521 = this.aBoolean523 = false;
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!c;[BZI)Z")
	private boolean method6232(@OriginalArg(0) Class274 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg1);
			@Pc(22) byte[] local22 = local9.digest();
			for (@Pc(24) int local24 = 0; local24 < 20; local24++) {
				if (arg0.anIntArray753[local24] != local22[local24]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(46) Exception local46) {
			this.method6231("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BILjava/io/File;)Z")
	private boolean method6233(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method6231("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean523 = true;
		this.aBoolean521 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean521 = true;
		this.aBoolean523 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B)[B")
	private byte[] method6234(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IZLloader!nv;Lloader!c;)[B")
	private byte[] method6235(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class280 arg1, @OriginalArg(3) Class274 arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg1.method6265(arg2.aString69);
		} catch (@Pc(7) Exception local7) {
			this.method6231("nocache");
			return null;
		}
		@Pc(18) byte[] local18 = this.method6234(local5);
		if (!this.method6232(arg2, local18, arg0)) {
			local18 = this.method6236(false, arg2);
			if (local18 == null) {
				local18 = this.method6236(true, arg2);
			}
			if (local18 == null) {
				this.method6231("download");
				return null;
			}
			if (!this.method6233(local18, local5)) {
				return null;
			}
			local18 = this.method6234(local5);
			if (!this.method6232(arg2, local18, false)) {
				this.method6231("mismatch");
				return null;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILloader!c;)[B")
	private byte[] method6236(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class274 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class276.anIntArray755[anInt7982]);
		@Pc(26) Color local26 = new Color(Class276.anIntArray754[anInt7982]);
		@Pc(30) byte[] local30 = new byte[arg1.anInt7974];
		try {
			@Pc(41) InputStream local41;
			if (arg0) {
				@Pc(46) URL local46 = this.getCodeBase();
				@Pc(54) Socket local54 = new Socket(InetAddress.getByName(local46.getHost()), 443);
				local54.setSoTimeout(10000);
				@Pc(60) OutputStream local60 = local54.getOutputStream();
				local60.write(17);
				local60.write(("JAGGRAB " + local46.getFile() + arg1.aString68 + "\n\n").getBytes());
				local41 = local54.getInputStream();
			} else {
				local41 = (new URL(this.getCodeBase(), arg1.aString68)).openStream();
			}
			@Pc(93) int local93 = -1;
			@Pc(95) int local95 = 0;
			while (local30.length > local95) {
				@Pc(104) int local104 = local30.length - local95;
				if (local104 > 1000) {
					local104 = 1000;
				}
				@Pc(118) int local118 = local41.read(local30, local95, local104);
				if (local118 < 0) {
					throw new EOFException();
				}
				local95 += local118;
				@Pc(138) int local138 = local95 * 100 / local30.length;
				if (local93 != local138) {
					try {
						@Pc(144) Graphics local144 = this.getGraphics();
						if (local144 == null) {
							this.repaint();
						} else {
							local144.setColor(Color.black);
							local144.fillRect(0, 0, this.anInt7981, this.anInt7983);
							local144.setColor(local19);
							local144.drawRect(this.anInt7981 / 2 - 152, this.anInt7983 / 2 + -18, 303, 33);
							@Pc(193) String local193 = arg1.aStringArray46[this.anInt7984] + " - " + local138 + "%";
							local144.setFont(local8);
							local144.setColor(local26);
							local144.drawString(local193, (this.anInt7981 - local12.stringWidth(local193)) / 2, this.anInt7983 / 2 + 4);
							local93 = local138;
						}
					} catch (@Pc(225) Exception local225) {
					}
				}
			}
			local41.close();
			if (arg1.anInt7973 != arg1.anInt7974) {
				@Pc(238) byte[] local238 = new byte[arg1.anInt7973];
				@Pc(243) Inflater local243 = new Inflater(true);
				local243.setInput(local30);
				local30 = local238;
				local243.inflate(local238);
			}
		} catch (@Pc(254) Exception local254) {
			return null;
		}
		return this.method6232(arg1, local30, false) ? local30 : null;
	}
}
