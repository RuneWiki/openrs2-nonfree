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

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString79;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private static int anInt7070 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt7067;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt7069;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean515 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean516 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt7068 = 0;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean518 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean517 = false;

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean518 = false;
		this.aBoolean515 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean516 = true;
		this.aBoolean515 = this.aBoolean518 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean516 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method6142(@OriginalArg(1) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILloader!h;)[B")
	private byte[] method6143(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class229 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(17) FontMetrics local17 = this.getFontMetrics(local8);
		@Pc(24) Color local24 = new Color(Class225.anIntArray523[anInt7070]);
		@Pc(31) Color local31 = new Color(Class225.anIntArray524[anInt7070]);
		@Pc(35) byte[] local35 = new byte[arg1.anInt7061];
		try {
			@Pc(46) InputStream local46;
			if (arg0) {
				@Pc(51) URL local51 = this.getCodeBase();
				@Pc(59) Socket local59 = new Socket(InetAddress.getByName(local51.getHost()), 443);
				local59.setSoTimeout(10000);
				@Pc(65) OutputStream local65 = local59.getOutputStream();
				local65.write(17);
				local65.write(("JAGGRAB " + local51.getFile() + arg1.aString77 + "\n\n").getBytes());
				local46 = local59.getInputStream();
			} else {
				local46 = (new URL(this.getCodeBase(), arg1.aString77)).openStream();
			}
			@Pc(90) int local90 = -1;
			@Pc(92) int local92 = 0;
			while (local92 < local35.length) {
				@Pc(106) int local106 = local35.length - local92;
				if (local106 > 1000) {
					local106 = 1000;
				}
				@Pc(117) int local117 = local46.read(local35, local92, local106);
				if (local117 < 0) {
					throw new EOFException();
				}
				local92 += local117;
				@Pc(135) int local135 = local92 * 100 / local35.length;
				if (local90 != local135) {
					try {
						@Pc(146) Graphics local146 = this.getGraphics();
						if (local146 == null) {
							this.repaint();
						} else {
							local146.setColor(Color.black);
							local146.fillRect(0, 0, this.anInt7067, this.anInt7069);
							local146.setColor(local24);
							local146.drawRect(this.anInt7067 / 2 - 152, this.anInt7069 / 2 + -18, 303, 33);
							@Pc(195) String local195 = arg1.aStringArray47[this.anInt7068] + " - " + local135 + "%";
							local146.setFont(local8);
							local146.setColor(local31);
							local146.drawString(local195, (this.anInt7067 - local17.stringWidth(local195)) / 2, this.anInt7069 / 2 + 4);
							local90 = local135;
						}
					} catch (@Pc(227) Exception local227) {
					}
				}
			}
			local46.close();
			if (arg1.anInt7062 != arg1.anInt7061) {
				@Pc(241) byte[] local241 = new byte[arg1.anInt7062];
				@Pc(246) Inflater local246 = new Inflater(true);
				local246.setInput(local35);
				local35 = local241;
				local246.inflate(local241);
			}
		} catch (@Pc(257) Exception local257) {
			return null;
		}
		return this.method6147(local35, arg1, false) ? local35 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;I)Z")
	private boolean method6144(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method6146("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean518 = true;
		this.aBoolean515 = false;
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!gt;Lloader!h;BZ)[B")
	private byte[] method6145(@OriginalArg(0) Class228 arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg0.method6107(arg1.aString76);
		} catch (@Pc(7) Exception local7) {
			this.method6146("nocache");
			return null;
		}
		@Pc(18) byte[] local18 = this.method6142(local5);
		if (!this.method6147(local18, arg1, arg2)) {
			local18 = this.method6143(false, arg1);
			if (local18 == null) {
				local18 = this.method6143(true, arg1);
			}
			if (local18 == null) {
				this.method6146("download");
				return null;
			}
			if (!this.method6144(local18, local5)) {
				return null;
			}
			local18 = this.method6142(local5);
			if (!this.method6147(local18, arg1, false)) {
				this.method6146("mismatch");
				return null;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method6146(@OriginalArg(0) String arg0) {
		if (this.aBoolean517) {
			return;
		}
		this.aBoolean517 = true;
		try {
			if (aString78 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString78 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(57) Exception local57) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString79 = this.getParameter("unsignedurl");
			if (aString79 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean517 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString79), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			aString78 = this.getParameter("crashurl");
			@Pc(39) int local39 = 0;
			@Pc(43) String local43 = this.getParameter("cachesubdirid");
			if (local43 != null) {
				local39 = Integer.parseInt(local43);
				if (local39 < 0 || local39 >= Class225.aStringArray46.length) {
					local39 = 0;
				}
			}
			@Pc(61) String local61 = this.getParameter("colourid");
			if (local61 != null) {
				anInt7070 = Integer.parseInt(local61);
				if (anInt7070 < 0 || anInt7070 >= Class225.anIntArray523.length) {
					anInt7070 = 0;
				}
			}
			this.anInt7067 = this.getSize().width;
			this.anInt7069 = this.getSize().height;
			@Pc(89) int local89 = 32;
			try {
				@Pc(94) int local94 = Integer.parseInt(this.getParameter("modewhat"));
				local89 += local94;
			} catch (@Pc(100) Exception local100) {
			}
			try {
				@Pc(104) String local104 = this.getParameter("lang");
				if (local104 != null) {
					this.anInt7068 = Integer.parseInt(local104);
				}
			} catch (@Pc(114) Exception local114) {
			}
			@Pc(124) Class228 local124;
			try {
				local124 = new Class228(this, local89, Class225.aStringArray46[local39], 29);
			} catch (@Pc(126) Exception local126) {
				this.method6146("nocache");
				return;
			}
			@Pc(133) unpack local133 = null;
			@Pc(143) byte[] local143;
			try {
				Class.forName("java.util.jar.Pack200");
				local143 = this.method6145(local124, Class225.aClass229_2, false);
				if (local143 == null) {
					return;
				}
				local133 = new unpack_Sub1(local143);
			} catch (@Pc(155) Throwable local155) {
			}
			if (local133 == null) {
				local143 = this.method6145(local124, Class225.aClass229_1, false);
				if (local143 == null) {
					return;
				}
				@Pc(173) unpack local173 = new unpack(local143);
				@Pc(178) ClassLoader_Sub1 local178 = new ClassLoader_Sub1(local173);
				@Pc(181) Class local181 = Class.forName("unpack");
				local178.method6087(local181, local181.getName());
				@Pc(191) Class local191 = local178.loadClass("unpackclass");
				@Pc(198) byte[] local198 = this.method6145(local124, Class225.aClass229_3, false);
				if (local198 == null) {
					return;
				}
				local133 = (unpack) local191.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local198, Boolean.TRUE);
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
				for (@Pc(297) int local297 = 0; local297 < Class225.aClass229ArrayArray1[local234].length; local297++) {
					this.method6145(local124, Class225.aClass229ArrayArray1[local234][local297], this.getParameter("suppress_sha") != null);
				}
			}
			if (Class225.aClass229Array1 != null) {
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
					this.method6145(local124, Class225.aClass229Array1[local234], this.getParameter("suppress_sha") != null);
				}
			}
			@Pc(382) Class local382 = Class.forName("Class232");
			local232.method6087(local382, local382.getName());
			@Pc(391) Class local391 = Class.forName("Class228");
			local232.method6087(local391, local391.getName());
			@Pc(400) Class local400 = Class.forName("Class230");
			local232.method6087(local400, local400.getName());
			@Pc(409) Class local409 = Class.forName("Class231");
			local232.method6087(local409, local409.getName());
			@Pc(418) Class local418 = Class.forName("Interface12");
			local232.method6087(local418, local418.getName());
			@Pc(428) Class local428 = local232.loadClass("client");
			synchronized (this) {
				if (this.aBoolean516) {
					return;
				}
				this.anApplet3 = (Applet) local428.getDeclaredConstructor().newInstance();
				local428.getMethod("providesignlink", local391).invoke(null, local124);
				this.anApplet3.init();
				if (this.aBoolean515) {
					this.anApplet3.start();
				}
				if (this.aBoolean518) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(488) Exception local488) {
			RuntimeException_Sub2.anInt7057 = -313318955;
			if (local488 instanceof InvocationTargetException) {
				@Pc(497) Throwable local497 = ((InvocationTargetException) local488).getTargetException();
				if (local497 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6092(this, local497, local488.toString());
			} else {
				RuntimeException_Sub2.method6092(this, local488, null);
			}
			this.method6146("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BBLloader!h;Z)Z")
	private boolean method6147(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class229 arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(13) MessageDigest local13 = MessageDigest.getInstance("SHA");
			local13.reset();
			local13.update(arg0);
			@Pc(21) byte[] local21 = local13.digest();
			for (@Pc(23) int local23 = 0; local23 < 20; local23++) {
				if (local21[local23] != arg1.anIntArray525[local23]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(42) Exception local42) {
			this.method6146("sha");
			return false;
		}
	}
}
