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
	private static String aString85;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString86;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private static int anInt7554 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt7551;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt7552;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt7553 = 0;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean516 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean518 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean517 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean519 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BZ[BLloader!c;)Z")
	private boolean method5861(@OriginalArg(1) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class275 arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(15) MessageDigest local15 = MessageDigest.getInstance("SHA");
			local15.reset();
			local15.update(arg1);
			@Pc(23) byte[] local23 = local15.digest();
			for (@Pc(25) int local25 = 0; local25 < 20; local25++) {
				if (local23[local25] != arg2.anIntArray630[local25]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(47) Exception local47) {
			this.method5866("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILloader!c;)[B")
	private byte[] method5862(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class275 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class274.anIntArray628[anInt7554]);
		@Pc(26) Color local26 = new Color(Class274.anIntArray629[anInt7554]);
		@Pc(30) byte[] local30 = new byte[arg1.anInt7546];
		try {
			@Pc(77) InputStream local77;
			if (arg0) {
				@Pc(40) URL local40 = this.getCodeBase();
				@Pc(48) Socket local48 = new Socket(InetAddress.getByName(local40.getHost()), 443);
				local48.setSoTimeout(10000);
				@Pc(54) OutputStream local54 = local48.getOutputStream();
				local54.write(17);
				local54.write(("JAGGRAB " + local40.getFile() + arg1.aString75 + "\n\n").getBytes());
				local77 = local48.getInputStream();
			} else {
				local77 = (new URL(this.getCodeBase(), arg1.aString75)).openStream();
			}
			@Pc(90) int local90 = -1;
			@Pc(92) int local92 = 0;
			while (local30.length > local92) {
				@Pc(102) int local102 = local30.length - local92;
				if (local102 > 1000) {
					local102 = 1000;
				}
				@Pc(115) int local115 = local77.read(local30, local92, local102);
				if (local115 < 0) {
					throw new EOFException();
				}
				local92 += local115;
				@Pc(132) int local132 = local92 * 100 / local30.length;
				if (local132 != local90) {
					try {
						@Pc(142) Graphics local142 = this.getGraphics();
						if (local142 == null) {
							this.repaint();
						} else {
							local142.setColor(Color.black);
							local142.fillRect(0, 0, this.anInt7552, this.anInt7551);
							local142.setColor(local19);
							local142.drawRect(this.anInt7552 / 2 - 152, this.anInt7551 / 2 - 18, 303, 33);
							@Pc(191) String local191 = arg1.aStringArray55[this.anInt7553] + " - " + local132 + "%";
							local142.setFont(local8);
							local142.setColor(local26);
							local90 = local132;
							local142.drawString(local191, (this.anInt7552 - local12.stringWidth(local191)) / 2, this.anInt7551 / 2 + 4);
						}
					} catch (@Pc(222) Exception local222) {
					}
				}
			}
			local77.close();
			if (arg1.anInt7545 != arg1.anInt7546) {
				@Pc(236) byte[] local236 = new byte[arg1.anInt7545];
				@Pc(241) Inflater local241 = new Inflater(true);
				local241.setInput(local30);
				local241.inflate(local236);
				local30 = local236;
			}
		} catch (@Pc(252) Exception local252) {
			return null;
		}
		return this.method5861(false, local30, arg1) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method5863(@OriginalArg(1) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean518 = false;
		this.aBoolean517 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean517 = false;
		this.aBoolean518 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!ec;IZLloader!c;)[B")
	private byte[] method5864(@OriginalArg(0) Class277 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class275 arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg0.method5834(arg2.aString74);
		} catch (@Pc(7) Exception local7) {
			this.method5866("nocache");
			return null;
		}
		@Pc(26) byte[] local26 = this.method5863(local5);
		if (!this.method5861(arg1, local26, arg2)) {
			local26 = this.method5862(false, arg2);
			if (local26 == null) {
				local26 = this.method5862(true, arg2);
			}
			if (local26 == null) {
				this.method5866("download");
				return null;
			}
			if (!this.method5865(local26, local5)) {
				return null;
			}
			local26 = this.method5863(local5);
			if (!this.method5861(false, local26, arg2)) {
				this.method5866("mismatch");
				return null;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BBLjava/io/File;)Z")
	private boolean method5865(@OriginalArg(0) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(25) IOException local25) {
			this.method5866("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean518 = this.aBoolean517 = false;
		this.aBoolean516 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString85 = this.getParameter("unsignedurl");
			if (aString85 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean519 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString85), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString86 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || Class274.aStringArray54.length <= local38) {
					local38 = 0;
				}
			}
			@Pc(67) String local67 = this.getParameter("colourid");
			if (local67 != null) {
				anInt7554 = Integer.parseInt(local67);
				if (anInt7554 < 0 || Class274.anIntArray628.length <= anInt7554) {
					anInt7554 = 0;
				}
			}
			this.anInt7552 = this.getSize().width;
			this.anInt7551 = this.getSize().height;
			@Pc(100) int local100 = 32;
			try {
				@Pc(105) int local105 = Integer.parseInt(this.getParameter("modewhat"));
				local100 += local105;
			} catch (@Pc(111) Exception local111) {
			}
			try {
				@Pc(115) String local115 = this.getParameter("lang");
				if (local115 != null) {
					this.anInt7553 = Integer.parseInt(local115);
				}
			} catch (@Pc(125) Exception local125) {
			}
			@Pc(135) Class277 local135;
			try {
				local135 = new Class277(this, local100, Class274.aStringArray54[local38], 30);
			} catch (@Pc(137) Exception local137) {
				this.method5866("nocache");
				return;
			}
			@Pc(144) unpack local144 = null;
			@Pc(154) byte[] local154;
			try {
				Class.forName("java.util.jar.Pack200");
				local154 = this.method5864(local135, false, Class274.aClass275_2);
				if (local154 == null) {
					return;
				}
				local144 = new unpack_Sub1(local154);
			} catch (@Pc(165) Throwable local165) {
			}
			if (local144 == null) {
				local154 = this.method5864(local135, false, Class274.aClass275_1);
				if (local154 == null) {
					return;
				}
				@Pc(183) unpack local183 = new unpack(local154);
				@Pc(188) ClassLoader_Sub1 local188 = new ClassLoader_Sub1(local183);
				@Pc(191) Class local191 = Class.forName("unpack");
				local188.method5853(local191.getName(), local191);
				@Pc(201) Class local201 = local188.loadClass("unpackclass");
				@Pc(208) byte[] local208 = this.method5864(local135, false, Class274.aClass275_3);
				if (local208 == null) {
					return;
				}
				local144 = (unpack) local201.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local208, Boolean.TRUE);
			}
			@Pc(243) ClassLoader_Sub1 local243 = new ClassLoader_Sub1(local144);
			@Pc(245) byte local245 = -1;
			@Pc(249) String local249 = System.getProperty("os.name").toLowerCase();
			@Pc(253) String local253 = System.getProperty("os.arch").toLowerCase();
			if (local249.startsWith("win")) {
				if (local253.startsWith("amd64") || local253.startsWith("x86_64")) {
					local245 = 1;
				} else {
					local245 = 0;
				}
			} else if (local249.startsWith("linux")) {
				if (local253.startsWith("amd64") || local253.startsWith("x86_64")) {
					local245 = 3;
				} else {
					local245 = 2;
				}
			} else if (local249.startsWith("mac")) {
				if (local253.startsWith("ppc")) {
					local245 = 4;
				} else if (local253.startsWith("x86_64")) {
					local245 = 6;
				} else {
					local245 = 7;
				}
			}
			if (local245 != -1) {
				this.method5864(local135, this.getParameter("suppress_sha") != null, Class274.aClass275Array1[local245]);
			}
			if (Class274.aClass275Array2 != null) {
				local245 = -1;
				local249 = System.getProperty("os.name").toLowerCase();
				local253 = System.getProperty("os.arch").toLowerCase();
				if (local249.startsWith("win")) {
					if (local253.startsWith("amd64") || local253.startsWith("x86_64")) {
						local245 = 2;
					} else {
						local245 = 0;
					}
				}
				if (local245 != -1) {
					this.method5864(local135, this.getParameter("suppress_sha") != null, Class274.aClass275Array2[local245]);
				}
			}
			if (Class274.aClass275Array3 != null) {
				local245 = -1;
				local249 = System.getProperty("os.name").toLowerCase();
				local253 = System.getProperty("os.arch").toLowerCase();
				if (local249.startsWith("win") && !local253.startsWith("amd64") && !local253.startsWith("x86_64")) {
					local245 = 0;
				}
				if (local245 != -1) {
					this.method5864(local135, this.getParameter("suppress_sha") != null, Class274.aClass275Array3[local245]);
				}
			}
			@Pc(436) Class local436 = Class.forName("Class280");
			local243.method5853(local436.getName(), local436);
			@Pc(445) Class local445 = Class.forName("Class277");
			local243.method5853(local445.getName(), local445);
			@Pc(454) Class local454 = Class.forName("Class279");
			local243.method5853(local454.getName(), local454);
			@Pc(463) Class local463 = Class.forName("Class278");
			local243.method5853(local463.getName(), local463);
			@Pc(472) Class local472 = Class.forName("Interface14");
			local243.method5853(local472.getName(), local472);
			@Pc(482) Class local482 = local243.loadClass("client");
			synchronized (this) {
				if (this.aBoolean516) {
					return;
				}
				this.anApplet3 = (Applet) local482.getDeclaredConstructor().newInstance();
				local482.getMethod("providesignlink", local445).invoke(null, local135);
				this.anApplet3.init();
				if (this.aBoolean518) {
					this.anApplet3.start();
				}
				if (this.aBoolean517) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(542) Exception local542) {
			RuntimeException_Sub2.anInt7549 = -1491534272;
			if (local542 instanceof InvocationTargetException) {
				@Pc(558) Throwable local558 = ((InvocationTargetException) local542).getTargetException();
				if (local558 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5850(local558, this, local542.toString());
			} else {
				RuntimeException_Sub2.method5850(local542, this, null);
			}
			this.method5866("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean516 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method5866(@OriginalArg(1) String arg0) {
		if (this.aBoolean519) {
			return;
		}
		this.aBoolean519 = true;
		try {
			if (aString86 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString86 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(60) Exception local60) {
		}
	}
}
