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
	private static String aString72;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString73;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private static int anInt6820 = 0;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private int anInt6817;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt6819;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean666 = false;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean667 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean668 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt6818 = 0;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean669 = false;

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method5720(@OriginalArg(1) String arg0) {
		if (this.aBoolean667) {
			return;
		}
		this.aBoolean667 = true;
		try {
			if (aString73 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString73 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(60) Exception local60) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean666 = true;
		this.aBoolean668 = this.aBoolean669 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!d;Z)[B")
	private byte[] method5721(@OriginalArg(1) Class220 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class221.anIntArray536[anInt6820]);
		@Pc(26) Color local26 = new Color(Class221.anIntArray535[anInt6820]);
		@Pc(30) byte[] local30 = new byte[arg0.anInt6814];
		try {
			@Pc(72) InputStream local72;
			if (arg1) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg0.aString70 + "\n\n").getBytes());
				local72 = local43.getInputStream();
			} else {
				local72 = (new URL(this.getCodeBase(), arg0.aString70)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = 0;
			while (local87 < local30.length) {
				@Pc(100) int local100 = local30.length - local87;
				if (local100 > 1000) {
					local100 = 1000;
				}
				@Pc(111) int local111 = local72.read(local30, local87, local100);
				if (local111 < 0) {
					throw new EOFException();
				}
				local87 += local111;
				@Pc(131) int local131 = local87 * 100 / local30.length;
				if (local131 != local85) {
					try {
						@Pc(137) Graphics local137 = this.getGraphics();
						if (local137 == null) {
							this.repaint();
						} else {
							local137.setColor(Color.black);
							local137.fillRect(0, 0, this.anInt6819, this.anInt6817);
							local137.setColor(local19);
							local137.drawRect(this.anInt6819 / 2 - 152, this.anInt6817 / 2 + -18, 303, 33);
							@Pc(187) String local187 = arg0.aStringArray65[this.anInt6818] + " - " + local131 + "%";
							local137.setFont(local8);
							local137.setColor(local26);
							local137.drawString(local187, (this.anInt6819 - local12.stringWidth(local187)) / 2, this.anInt6817 / 2 + 4);
							local85 = local131;
						}
					} catch (@Pc(219) Exception local219) {
					}
				}
			}
			local72.close();
			if (arg0.anInt6814 != arg0.anInt6813) {
				@Pc(236) byte[] local236 = new byte[arg0.anInt6813];
				@Pc(241) Inflater local241 = new Inflater(true);
				local241.setInput(local30);
				local241.inflate(local236);
				local30 = local236;
			}
		} catch (@Pc(257) Exception local257) {
			return null;
		}
		return this.method5724(arg0, local30, false) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean666 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method5722(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean669 = false;
		this.aBoolean668 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLjava/io/File;)Z")
	private boolean method5723(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method5720("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean668 = false;
		this.aBoolean669 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!d;[BZI)Z")
	private boolean method5724(@OriginalArg(0) Class220 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg1);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(19) int local19 = 0; local19 < 20; local19++) {
				if (arg0.anIntArray534[local19] != local17[local19]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(38) Exception local38) {
			this.method5720("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!nh;IZLloader!d;)[B")
	private byte[] method5725(@OriginalArg(0) Class224 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class220 arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg0.method5754(arg2.aString69);
		} catch (@Pc(7) Exception local7) {
			this.method5720("nocache");
			return null;
		}
		@Pc(18) byte[] local18 = this.method5722(local5);
		if (!this.method5724(arg2, local18, arg1)) {
			local18 = this.method5721(arg2, false);
			if (local18 == null) {
				local18 = this.method5721(arg2, true);
			}
			if (local18 == null) {
				this.method5720("download");
				return null;
			}
			if (!this.method5723(local18, local5)) {
				return null;
			}
			local18 = this.method5722(local5);
			if (!this.method5724(arg2, local18, false)) {
				this.method5720("mismatch");
				return null;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString72 = this.getParameter("unsignedurl");
			if (aString72 != null) {
				try {
					@Pc(11) SecurityManager local11 = System.getSecurityManager();
					if (local11 != null) {
						local11.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean667 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString72), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			aString73 = this.getParameter("crashurl");
			@Pc(39) int local39 = 0;
			@Pc(43) String local43 = this.getParameter("cachesubdirid");
			if (local43 != null) {
				local39 = Integer.parseInt(local43);
				if (local39 < 0 || Class221.aStringArray66.length <= local39) {
					local39 = 0;
				}
			}
			@Pc(68) String local68 = this.getParameter("colourid");
			if (local68 != null) {
				anInt6820 = Integer.parseInt(local68);
				if (anInt6820 < 0 || anInt6820 >= Class221.anIntArray536.length) {
					anInt6820 = 0;
				}
			}
			this.anInt6819 = this.getSize().width;
			this.anInt6817 = this.getSize().height;
			@Pc(100) int local100 = 32;
			try {
				@Pc(105) int local105 = Integer.parseInt(this.getParameter("modewhat"));
				local100 += local105;
			} catch (@Pc(111) Exception local111) {
			}
			try {
				@Pc(115) String local115 = this.getParameter("lang");
				if (local115 != null) {
					this.anInt6818 = Integer.parseInt(local115);
				}
			} catch (@Pc(124) Exception local124) {
			}
			@Pc(134) Class224 local134;
			try {
				local134 = new Class224(this, local100, Class221.aStringArray66[local39], 29);
			} catch (@Pc(136) Exception local136) {
				this.method5720("nocache");
				return;
			}
			@Pc(143) unpack local143 = null;
			@Pc(153) byte[] local153;
			try {
				Class.forName("java.util.jar.Pack200");
				local153 = this.method5725(local134, false, Class221.aClass220_2);
				if (local153 == null) {
					return;
				}
				local143 = new unpack_Sub1(local153);
			} catch (@Pc(164) Throwable local164) {
			}
			if (local143 == null) {
				local153 = this.method5725(local134, false, Class221.aClass220_1);
				if (local153 == null) {
					return;
				}
				@Pc(182) unpack local182 = new unpack(local153);
				@Pc(187) ClassLoader_Sub1 local187 = new ClassLoader_Sub1(local182);
				@Pc(190) Class local190 = Class.forName("unpack");
				local187.method5712(local190.getName(), local190);
				@Pc(200) Class local200 = local187.loadClass("unpackclass");
				@Pc(207) byte[] local207 = this.method5725(local134, false, Class221.aClass220_3);
				if (local207 == null) {
					return;
				}
				local143 = (unpack) local200.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local207, Boolean.TRUE);
			}
			@Pc(243) ClassLoader_Sub1 local243 = new ClassLoader_Sub1(local143);
			@Pc(245) byte local245 = -1;
			@Pc(249) String local249 = System.getProperty("os.name").toLowerCase();
			@Pc(253) String local253 = System.getProperty("os.arch").toLowerCase();
			if (local249.startsWith("win")) {
				if (local253.startsWith("amd64") || local253.startsWith("x86_64")) {
					local245 = 4;
				} else {
					local245 = 0;
				}
			} else if (local249.startsWith("linux")) {
				local245 = 1;
			} else if (local249.startsWith("mac")) {
				if (local253.startsWith("ppc")) {
					local245 = 2;
				} else if (local253.startsWith("x86_64")) {
					local245 = 5;
				} else {
					local245 = 3;
				}
			}
			if (local245 != -1) {
				for (@Pc(311) int local311 = 0; local311 < Class221.aClass220ArrayArray1[local245].length; local311++) {
					this.method5725(local134, this.getParameter("suppress_sha") != null, Class221.aClass220ArrayArray1[local245][local311]);
				}
			}
			if (Class221.aClass220Array1 != null) {
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
					this.method5725(local134, this.getParameter("suppress_sha") != null, Class221.aClass220Array1[local245]);
				}
			}
			@Pc(391) Class local391 = Class.forName("Class222");
			local243.method5712(local391.getName(), local391);
			@Pc(400) Class local400 = Class.forName("Class224");
			local243.method5712(local400.getName(), local400);
			@Pc(409) Class local409 = Class.forName("Class225");
			local243.method5712(local409.getName(), local409);
			@Pc(418) Class local418 = Class.forName("Class223");
			local243.method5712(local418.getName(), local418);
			@Pc(427) Class local427 = Class.forName("Interface11");
			local243.method5712(local427.getName(), local427);
			@Pc(437) Class local437 = local243.loadClass("client");
			synchronized (this) {
				if (this.aBoolean666) {
					return;
				}
				this.anApplet2 = (Applet) local437.getDeclaredConstructor().newInstance();
				local437.getMethod("providesignlink", local400).invoke(null, local134);
				this.anApplet2.init();
				if (this.aBoolean668) {
					this.anApplet2.start();
				}
				if (this.aBoolean669) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(498) Exception local498) {
			RuntimeException_Sub2.anInt6815 = 1325391370;
			if (local498 instanceof InvocationTargetException) {
				@Pc(507) Throwable local507 = ((InvocationTargetException) local498).getTargetException();
				if (local507 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5698(local498.toString(), local507, this);
			} else {
				RuntimeException_Sub2.method5698(null, local498, this);
			}
			this.method5720("crash");
		}
	}
}
