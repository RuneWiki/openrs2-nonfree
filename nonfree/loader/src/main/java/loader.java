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
	private static String aString77;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString78;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private static int anInt6795 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt6796;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt6798;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt6797 = 0;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean432 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean433 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean430 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean431 = false;

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean432 = this.aBoolean431 = false;
		this.aBoolean433 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BB)Z")
	private boolean method5794(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method5795("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean433 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method5795(@OriginalArg(1) String arg0) {
		if (this.aBoolean430) {
			return;
		}
		this.aBoolean430 = true;
		try {
			if (aString77 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString77 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!ko;ZLloader!f;I)[B")
	private byte[] method5796(@OriginalArg(0) Class224 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class221 arg2) {
		@Pc(10) File local10;
		try {
			local10 = arg0.method5767(arg2.aString66);
		} catch (@Pc(12) Exception local12) {
			this.method5795("nocache");
			return null;
		}
		@Pc(23) byte[] local23 = this.method5797(local10);
		if (!this.method5798(arg2, local23, arg1)) {
			local23 = this.method5799(false, arg2);
			if (local23 == null) {
				local23 = this.method5799(true, arg2);
			}
			if (local23 == null) {
				this.method5795("download");
				return null;
			}
			if (!this.method5794(local10, local23)) {
				return null;
			}
			local23 = this.method5797(local10);
			if (!this.method5798(arg2, local23, false)) {
				this.method5795("mismatch");
				return null;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method5797(@OriginalArg(1) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;[BZI)Z")
	private boolean method5798(@OriginalArg(0) Class221 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg1);
			@Pc(18) byte[] local18 = local10.digest();
			for (@Pc(20) int local20 = 0; local20 < 20; local20++) {
				if (arg0.anIntArray551[local20] != local18[local20]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(45) Exception local45) {
			this.method5795("sha");
			return false;
		}
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
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean430 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString78), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString77 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || local38 >= Class222.aStringArray54.length) {
					local38 = 0;
				}
			}
			@Pc(68) String local68 = this.getParameter("colourid");
			if (local68 != null) {
				anInt6795 = Integer.parseInt(local68);
				if (anInt6795 < 0 || anInt6795 >= Class222.anIntArray552.length) {
					anInt6795 = 0;
				}
			}
			this.anInt6798 = this.getSize().width;
			this.anInt6796 = this.getSize().height;
			@Pc(102) int local102 = 32;
			try {
				@Pc(107) int local107 = Integer.parseInt(this.getParameter("modewhat"));
				local102 += local107;
			} catch (@Pc(113) Exception local113) {
			}
			try {
				@Pc(117) String local117 = this.getParameter("lang");
				if (local117 != null) {
					this.anInt6797 = Integer.parseInt(local117);
				}
			} catch (@Pc(126) Exception local126) {
			}
			@Pc(136) Class224 local136;
			try {
				local136 = new Class224(this, local102, Class222.aStringArray54[local38], 29);
			} catch (@Pc(138) Exception local138) {
				this.method5795("nocache");
				return;
			}
			@Pc(145) unpack local145 = null;
			@Pc(155) byte[] local155;
			try {
				Class.forName("java.util.jar.Pack200");
				local155 = this.method5796(local136, false, Class222.aClass221_2);
				if (local155 == null) {
					return;
				}
				local145 = new unpack_Sub1(local155);
			} catch (@Pc(167) Throwable local167) {
			}
			if (local145 == null) {
				local155 = this.method5796(local136, false, Class222.aClass221_1);
				if (local155 == null) {
					return;
				}
				@Pc(186) unpack local186 = new unpack(local155);
				@Pc(191) ClassLoader_Sub1 local191 = new ClassLoader_Sub1(local186);
				@Pc(194) Class local194 = Class.forName("unpack");
				local191.method5734(local194, local194.getName());
				@Pc(204) Class local204 = local191.loadClass("unpackclass");
				@Pc(211) byte[] local211 = this.method5796(local136, false, Class222.aClass221_3);
				if (local211 == null) {
					return;
				}
				local145 = (unpack) local204.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local211, Boolean.TRUE);
			}
			@Pc(246) ClassLoader_Sub1 local246 = new ClassLoader_Sub1(local145);
			@Pc(248) byte local248 = -1;
			@Pc(252) String local252 = System.getProperty("os.name").toLowerCase();
			@Pc(256) String local256 = System.getProperty("os.arch").toLowerCase();
			if (local252.startsWith("win")) {
				if (local256.startsWith("amd64") || local256.startsWith("x86_64")) {
					local248 = 4;
				} else {
					local248 = 0;
				}
			} else if (local252.startsWith("linux")) {
				local248 = 1;
			} else if (local252.startsWith("mac")) {
				if (local256.startsWith("ppc")) {
					local248 = 2;
				} else if (local256.startsWith("x86_64")) {
					local248 = 5;
				} else {
					local248 = 3;
				}
			}
			if (local248 != -1) {
				for (@Pc(314) int local314 = 0; local314 < Class222.aClass221ArrayArray1[local248].length; local314++) {
					this.method5796(local136, this.getParameter("suppress_sha") != null, Class222.aClass221ArrayArray1[local248][local314]);
				}
			}
			if (Class222.aClass221Array1 != null) {
				local248 = -1;
				local252 = System.getProperty("os.name").toLowerCase();
				local256 = System.getProperty("os.arch").toLowerCase();
				if (local252.startsWith("win")) {
					if (local256.startsWith("amd64") || local256.startsWith("x86_64")) {
						local248 = 2;
					} else {
						local248 = 0;
					}
				}
				if (local248 != -1) {
					this.method5796(local136, this.getParameter("suppress_sha") != null, Class222.aClass221Array1[local248]);
				}
			}
			@Pc(398) Class local398 = Class.forName("Class223");
			local246.method5734(local398, local398.getName());
			@Pc(407) Class local407 = Class.forName("Class224");
			local246.method5734(local407, local407.getName());
			@Pc(416) Class local416 = Class.forName("Class218");
			local246.method5734(local416, local416.getName());
			@Pc(425) Class local425 = Class.forName("Class225");
			local246.method5734(local425, local425.getName());
			@Pc(434) Class local434 = Class.forName("Interface11");
			local246.method5734(local434, local434.getName());
			@Pc(444) Class local444 = local246.loadClass("client");
			synchronized (this) {
				if (this.aBoolean433) {
					return;
				}
				this.anApplet3 = (Applet) local444.getDeclaredConstructor().newInstance();
				local444.getMethod("providesignlink", local407).invoke(null, local136);
				this.anApplet3.init();
				if (this.aBoolean432) {
					this.anApplet3.start();
				}
				if (this.aBoolean431) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(503) Exception local503) {
			RuntimeException_Sub2.anInt6791 = -422492429;
			if (local503 instanceof InvocationTargetException) {
				@Pc(519) Throwable local519 = ((InvocationTargetException) local503).getTargetException();
				if (local519 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5746(this, local519, local503.toString());
			} else {
				RuntimeException_Sub2.method5746(this, local503, null);
			}
			this.method5795("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean431 = false;
		this.aBoolean432 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IZLloader!f;)[B")
	private byte[] method5799(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class221 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class222.anIntArray552[anInt6795]);
		@Pc(26) Color local26 = new Color(Class222.anIntArray553[anInt6795]);
		@Pc(30) byte[] local30 = new byte[arg1.anInt6790];
		try {
			@Pc(41) InputStream local41;
			if (arg0) {
				@Pc(46) URL local46 = this.getCodeBase();
				@Pc(54) Socket local54 = new Socket(InetAddress.getByName(local46.getHost()), 443);
				local54.setSoTimeout(10000);
				@Pc(60) OutputStream local60 = local54.getOutputStream();
				local60.write(17);
				local60.write(("JAGGRAB " + local46.getFile() + arg1.aString67 + "\n\n").getBytes());
				local41 = local54.getInputStream();
			} else {
				local41 = (new URL(this.getCodeBase(), arg1.aString67)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = 0;
			while (local30.length > local87) {
				@Pc(101) int local101 = local30.length - local87;
				if (local101 > 1000) {
					local101 = 1000;
				}
				@Pc(113) int local113 = local41.read(local30, local87, local101);
				if (local113 < 0) {
					throw new EOFException();
				}
				local87 += local113;
				@Pc(131) int local131 = local87 * 100 / local30.length;
				if (local131 != local85) {
					try {
						@Pc(137) Graphics local137 = this.getGraphics();
						if (local137 == null) {
							this.repaint();
						} else {
							local137.setColor(Color.black);
							local137.fillRect(0, 0, this.anInt6798, this.anInt6796);
							local137.setColor(local19);
							local137.drawRect(this.anInt6798 / 2 - 152, this.anInt6796 / 2 + -18, 303, 33);
							@Pc(186) String local186 = arg1.aStringArray53[this.anInt6797] + " - " + local131 + "%";
							local137.setFont(local8);
							local137.setColor(local26);
							local85 = local131;
							local137.drawString(local186, (this.anInt6798 - local12.stringWidth(local186)) / 2, this.anInt6796 / 2 + 4);
						}
					} catch (@Pc(217) Exception local217) {
					}
				}
			}
			local41.close();
			if (arg1.anInt6790 != arg1.anInt6789) {
				@Pc(242) byte[] local242 = new byte[arg1.anInt6789];
				@Pc(247) Inflater local247 = new Inflater(true);
				local247.setInput(local30);
				local247.inflate(local242);
				local30 = local242;
			}
		} catch (@Pc(258) Exception local258) {
			return null;
		}
		return this.method5798(arg1, local30, false) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean432 = false;
		this.aBoolean431 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}
}
