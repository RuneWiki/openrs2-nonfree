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
	private static String aString76;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString77;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private static int anInt7425 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt7424;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt7426;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean512 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt7423 = 0;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean515 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean514 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean513 = false;

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method6046(@OriginalArg(1) String arg0) {
		if (this.aBoolean514) {
			return;
		}
		this.aBoolean514 = true;
		try {
			if (aString77 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString77 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(58) Exception local58) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!h;[BZ)Z")
	private boolean method6047(@OriginalArg(1) Class277 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(19) MessageDigest local19 = MessageDigest.getInstance("SHA");
			local19.reset();
			local19.update(arg1);
			@Pc(27) byte[] local27 = local19.digest();
			for (@Pc(29) int local29 = 0; local29 < 20; local29++) {
				if (arg0.anIntArray667[local29] != local27[local29]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(54) Exception local54) {
			this.method6046("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean513 = this.aBoolean512 = false;
		this.aBoolean515 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method6048(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(20) DataInputStream local20 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(28) byte[] local28 = new byte[local9];
			local20.readFully(local28, 0, local9);
			local20.close();
			return local28;
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;I)Z")
	private boolean method6049(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method6046("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString76 = this.getParameter("unsignedurl");
			if (aString76 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean514 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString76), "_parent");
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
				if (local38 < 0 || local38 >= Class275.aStringArray45.length) {
					local38 = 0;
				}
			}
			@Pc(64) String local64 = this.getParameter("colourid");
			if (local64 != null) {
				anInt7425 = Integer.parseInt(local64);
				if (anInt7425 < 0 || Class275.anIntArray666.length <= anInt7425) {
					anInt7425 = 0;
				}
			}
			this.anInt7424 = this.getSize().width;
			this.anInt7426 = this.getSize().height;
			@Pc(95) int local95 = 32;
			try {
				@Pc(100) int local100 = Integer.parseInt(this.getParameter("modewhat"));
				local95 += local100;
			} catch (@Pc(106) Exception local106) {
			}
			try {
				@Pc(110) String local110 = this.getParameter("lang");
				if (local110 != null) {
					this.anInt7423 = Integer.parseInt(local110);
				}
			} catch (@Pc(119) Exception local119) {
			}
			@Pc(129) Class279 local129;
			try {
				local129 = new Class279(this, local95, Class275.aStringArray45[local38], 30);
			} catch (@Pc(131) Exception local131) {
				this.method6046("nocache");
				return;
			}
			@Pc(138) unpack local138 = null;
			@Pc(148) byte[] local148;
			try {
				Class.forName("java.util.jar.Pack200");
				local148 = this.method6051(local129, Class275.aClass277_2, false);
				if (local148 == null) {
					return;
				}
				local138 = new unpack_Sub1(local148);
			} catch (@Pc(158) Throwable local158) {
			}
			if (local138 == null) {
				local148 = this.method6051(local129, Class275.aClass277_1, false);
				if (local148 == null) {
					return;
				}
				@Pc(177) unpack local177 = new unpack(local148);
				@Pc(182) ClassLoader_Sub1 local182 = new ClassLoader_Sub1(local177);
				@Pc(185) Class local185 = Class.forName("unpack");
				local182.method6027(local185, local185.getName());
				@Pc(195) Class local195 = local182.loadClass("unpackclass");
				@Pc(202) byte[] local202 = this.method6051(local129, Class275.aClass277_3, false);
				if (local202 == null) {
					return;
				}
				local138 = (unpack) local195.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local202, Boolean.TRUE);
			}
			@Pc(237) ClassLoader_Sub1 local237 = new ClassLoader_Sub1(local138);
			@Pc(239) byte local239 = -1;
			@Pc(243) String local243 = System.getProperty("os.name").toLowerCase();
			@Pc(247) String local247 = System.getProperty("os.arch").toLowerCase();
			if (local243.startsWith("win")) {
				if (local247.startsWith("amd64") || local247.startsWith("x86_64")) {
					local239 = 1;
				} else {
					local239 = 0;
				}
			} else if (local243.startsWith("linux")) {
				if (local247.startsWith("amd64") || local247.startsWith("x86_64")) {
					local239 = 3;
				} else {
					local239 = 2;
				}
			} else if (local243.startsWith("mac")) {
				if (local247.startsWith("ppc")) {
					local239 = 4;
				} else if (local247.startsWith("x86_64")) {
					local239 = 6;
				} else {
					local239 = 7;
				}
			}
			if (local239 != -1) {
				this.method6051(local129, Class275.aClass277Array1[local239], this.getParameter("suppress_sha") != null);
			}
			if (Class275.aClass277Array2 != null) {
				local239 = -1;
				local243 = System.getProperty("os.name").toLowerCase();
				local247 = System.getProperty("os.arch").toLowerCase();
				if (local243.startsWith("win")) {
					if (local247.startsWith("amd64") || local247.startsWith("x86_64")) {
						local239 = 2;
					} else {
						local239 = 0;
					}
				}
				if (local239 != -1) {
					this.method6051(local129, Class275.aClass277Array2[local239], this.getParameter("suppress_sha") != null);
				}
			}
			if (Class275.aClass277Array3 != null) {
				local239 = -1;
				local243 = System.getProperty("os.name").toLowerCase();
				local247 = System.getProperty("os.arch").toLowerCase();
				if (local243.startsWith("win") && !local247.startsWith("amd64") && !local247.startsWith("x86_64")) {
					local239 = 0;
				}
				if (local239 != -1) {
					this.method6051(local129, Class275.aClass277Array3[local239], this.getParameter("suppress_sha") != null);
				}
			}
			@Pc(428) Class local428 = Class.forName("Class280");
			local237.method6027(local428, local428.getName());
			@Pc(437) Class local437 = Class.forName("Class279");
			local237.method6027(local437, local437.getName());
			@Pc(446) Class local446 = Class.forName("Class273");
			local237.method6027(local446, local446.getName());
			@Pc(455) Class local455 = Class.forName("Class278");
			local237.method6027(local455, local455.getName());
			@Pc(464) Class local464 = Class.forName("Interface14");
			local237.method6027(local464, local464.getName());
			@Pc(474) Class local474 = local237.loadClass("client");
			synchronized (this) {
				if (this.aBoolean515) {
					return;
				}
				this.anApplet2 = (Applet) local474.getDeclaredConstructor().newInstance();
				local474.getMethod("providesignlink", local437).invoke(null, local129);
				this.anApplet2.init();
				if (this.aBoolean513) {
					this.anApplet2.start();
				}
				if (this.aBoolean512) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(533) Exception local533) {
			RuntimeException_Sub2.anInt7419 = 176844988;
			if (local533 instanceof InvocationTargetException) {
				@Pc(549) Throwable local549 = ((InvocationTargetException) local533).getTargetException();
				if (local549 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6029(this, local549, local533.toString());
			} else {
				RuntimeException_Sub2.method6029(this, local533, null);
			}
			this.method6046("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean515 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean513 = true;
		this.aBoolean512 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!h;BZ)[B")
	private byte[] method6050(@OriginalArg(0) Class277 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class275.anIntArray666[anInt7425]);
		@Pc(26) Color local26 = new Color(Class275.anIntArray665[anInt7425]);
		@Pc(30) byte[] local30 = new byte[arg0.anInt7421];
		try {
			@Pc(77) InputStream local77;
			if (arg1) {
				@Pc(40) URL local40 = this.getCodeBase();
				@Pc(48) Socket local48 = new Socket(InetAddress.getByName(local40.getHost()), 443);
				local48.setSoTimeout(10000);
				@Pc(54) OutputStream local54 = local48.getOutputStream();
				local54.write(17);
				local54.write(("JAGGRAB " + local40.getFile() + arg0.aString74 + "\n\n").getBytes());
				local77 = local48.getInputStream();
			} else {
				local77 = (new URL(this.getCodeBase(), arg0.aString74)).openStream();
			}
			@Pc(90) int local90 = -1;
			@Pc(92) int local92 = 0;
			while (local92 < local30.length) {
				@Pc(102) int local102 = local30.length - local92;
				if (local102 > 1000) {
					local102 = 1000;
				}
				@Pc(113) int local113 = local77.read(local30, local92, local102);
				if (local113 < 0) {
					throw new EOFException();
				}
				local92 += local113;
				@Pc(131) int local131 = local92 * 100 / local30.length;
				if (local131 != local90) {
					try {
						@Pc(142) Graphics local142 = this.getGraphics();
						if (local142 == null) {
							this.repaint();
						} else {
							local142.setColor(Color.black);
							local142.fillRect(0, 0, this.anInt7424, this.anInt7426);
							local142.setColor(local19);
							local142.drawRect(this.anInt7424 / 2 - 152, this.anInt7426 / 2 + -18, 303, 33);
							@Pc(191) String local191 = arg0.aStringArray46[this.anInt7423] + " - " + local131 + "%";
							local142.setFont(local8);
							local142.setColor(local26);
							local142.drawString(local191, (this.anInt7424 - local12.stringWidth(local191)) / 2, this.anInt7426 / 2 + 4);
							local90 = local131;
						}
					} catch (@Pc(223) Exception local223) {
					}
				}
			}
			local77.close();
			if (arg0.anInt7421 != arg0.anInt7422) {
				@Pc(237) byte[] local237 = new byte[arg0.anInt7422];
				@Pc(242) Inflater local242 = new Inflater(true);
				local242.setInput(local30);
				local242.inflate(local237);
				local30 = local237;
			}
		} catch (@Pc(253) Exception local253) {
			return null;
		}
		return this.method6047(arg0, local30, false) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!od;Lloader!h;ZI)[B")
	private byte[] method6051(@OriginalArg(0) Class279 arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(10) File local10;
		try {
			local10 = arg0.method6080(arg1.aString75);
		} catch (@Pc(12) Exception local12) {
			this.method6046("nocache");
			return null;
		}
		@Pc(23) byte[] local23 = this.method6048(local10);
		if (!this.method6047(arg1, local23, arg2)) {
			local23 = this.method6050(arg1, false);
			if (local23 == null) {
				local23 = this.method6050(arg1, true);
			}
			if (local23 == null) {
				this.method6046("download");
				return null;
			}
			if (!this.method6049(local23, local10)) {
				return null;
			}
			local23 = this.method6048(local10);
			if (!this.method6047(arg1, local23, false)) {
				this.method6046("mismatch");
				return null;
			}
		}
		return local23;
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
		this.aBoolean513 = false;
		this.aBoolean512 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}
}
