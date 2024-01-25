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
	private static String aString82;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString83;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private static int anInt7464 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt7463;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt7465;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt7462 = 0;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean616 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean615 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean617 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean618 = false;

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString83 = this.getParameter("unsignedurl");
			if (aString83 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean618 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString83), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString82 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || Class270.aStringArray56.length <= local37) {
					local37 = 0;
				}
			}
			@Pc(64) String local64 = this.getParameter("colourid");
			if (local64 != null) {
				anInt7464 = Integer.parseInt(local64);
				if (anInt7464 < 0 || anInt7464 >= Class270.anIntArray499.length) {
					anInt7464 = 0;
				}
			}
			this.anInt7463 = this.getSize().width;
			this.anInt7465 = this.getSize().height;
			@Pc(96) int local96 = 32;
			try {
				@Pc(101) int local101 = Integer.parseInt(this.getParameter("modewhat"));
				local96 += local101;
			} catch (@Pc(107) Exception local107) {
			}
			try {
				@Pc(111) String local111 = this.getParameter("lang");
				if (local111 != null) {
					this.anInt7462 = Integer.parseInt(local111);
				}
			} catch (@Pc(121) Exception local121) {
			}
			@Pc(131) Class274 local131;
			try {
				local131 = new Class274(this, local96, Class270.aStringArray56[local37], 30);
			} catch (@Pc(133) Exception local133) {
				this.method5702("nocache");
				return;
			}
			@Pc(140) unpack local140 = null;
			@Pc(150) byte[] local150;
			try {
				Class.forName("java.util.jar.Pack200");
				local150 = this.method5703(local131, Class270.aClass272_2, false);
				if (local150 == null) {
					return;
				}
				local140 = new unpack_Sub1(local150);
			} catch (@Pc(161) Throwable local161) {
			}
			if (local140 == null) {
				local150 = this.method5703(local131, Class270.aClass272_1, false);
				if (local150 == null) {
					return;
				}
				@Pc(180) unpack local180 = new unpack(local150);
				@Pc(185) ClassLoader_Sub1 local185 = new ClassLoader_Sub1(local180);
				@Pc(188) Class local188 = Class.forName("unpack");
				local185.method5657(local188.getName(), local188);
				@Pc(198) Class local198 = local185.loadClass("unpackclass");
				@Pc(205) byte[] local205 = this.method5703(local131, Class270.aClass272_3, false);
				if (local205 == null) {
					return;
				}
				local140 = (unpack) local198.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local205, Boolean.TRUE);
			}
			@Pc(239) ClassLoader_Sub1 local239 = new ClassLoader_Sub1(local140);
			@Pc(241) byte local241 = -1;
			@Pc(245) String local245 = System.getProperty("os.name").toLowerCase();
			@Pc(249) String local249 = System.getProperty("os.arch").toLowerCase();
			if (local245.startsWith("win")) {
				if (local249.startsWith("amd64") || local249.startsWith("x86_64")) {
					local241 = 1;
				} else {
					local241 = 0;
				}
			} else if (local245.startsWith("linux")) {
				if (local249.startsWith("amd64") || local249.startsWith("x86_64")) {
					local241 = 3;
				} else {
					local241 = 2;
				}
			} else if (local245.startsWith("mac")) {
				if (local249.startsWith("ppc")) {
					local241 = 4;
				} else if (local249.startsWith("x86_64")) {
					local241 = 6;
				} else {
					local241 = 7;
				}
			}
			if (local241 != -1) {
				this.method5703(local131, Class270.aClass272Array1[local241], this.getParameter("suppress_sha") != null);
			}
			if (Class270.aClass272Array2 != null) {
				local241 = -1;
				local245 = System.getProperty("os.name").toLowerCase();
				local249 = System.getProperty("os.arch").toLowerCase();
				if (local245.startsWith("win")) {
					if (local249.startsWith("amd64") || local249.startsWith("x86_64")) {
						local241 = 2;
					} else {
						local241 = 0;
					}
				}
				if (local241 != -1) {
					this.method5703(local131, Class270.aClass272Array2[local241], this.getParameter("suppress_sha") != null);
				}
			}
			if (Class270.aClass272Array3 != null) {
				local241 = -1;
				local245 = System.getProperty("os.name").toLowerCase();
				local249 = System.getProperty("os.arch").toLowerCase();
				if (local245.startsWith("win") && !local249.startsWith("amd64") && !local249.startsWith("x86_64")) {
					local241 = 0;
				}
				if (local241 != -1) {
					this.method5703(local131, Class270.aClass272Array3[local241], this.getParameter("suppress_sha") != null);
				}
			}
			@Pc(433) Class local433 = Class.forName("Class277");
			local239.method5657(local433.getName(), local433);
			@Pc(442) Class local442 = Class.forName("Class274");
			local239.method5657(local442.getName(), local442);
			@Pc(451) Class local451 = Class.forName("Class276");
			local239.method5657(local451.getName(), local451);
			@Pc(460) Class local460 = Class.forName("Class275");
			local239.method5657(local460.getName(), local460);
			@Pc(469) Class local469 = Class.forName("Interface13");
			local239.method5657(local469.getName(), local469);
			@Pc(479) Class local479 = local239.loadClass("client");
			synchronized (this) {
				if (this.aBoolean615) {
					return;
				}
				this.anApplet3 = (Applet) local479.getDeclaredConstructor().newInstance();
				local479.getMethod("providesignlink", local442).invoke(null, local131);
				this.anApplet3.init();
				if (this.aBoolean616) {
					this.anApplet3.start();
				}
				if (this.aBoolean617) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(537) Exception local537) {
			RuntimeException_Sub2.anInt7456 = -978020087;
			if (local537 instanceof InvocationTargetException) {
				@Pc(553) Throwable local553 = ((InvocationTargetException) local537).getTargetException();
				if (local553 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5661(local537.toString(), this, local553);
			} else {
				RuntimeException_Sub2.method5661(null, this, local537);
			}
			this.method5702("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;[B)Z")
	private boolean method5700(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method5702("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;Z)[B")
	private byte[] method5701(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean615 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	private void method5702(@OriginalArg(0) String arg0) {
		if (this.aBoolean618) {
			return;
		}
		this.aBoolean618 = true;
		try {
			if (aString82 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString82 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean617 = false;
		this.aBoolean616 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!ji;Lloader!f;ZB)[B")
	private byte[] method5703(@OriginalArg(0) Class274 arg0, @OriginalArg(1) Class272 arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg0.method5672(arg1.aString72);
		} catch (@Pc(7) Exception local7) {
			this.method5702("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method5701(local5);
		if (!this.method5705(arg2, local24, arg1)) {
			local24 = this.method5704(arg1, false);
			if (local24 == null) {
				local24 = this.method5704(arg1, true);
			}
			if (local24 == null) {
				this.method5702("download");
				return null;
			}
			if (!this.method5700(local5, local24)) {
				return null;
			}
			local24 = this.method5701(local5);
			if (!this.method5705(false, local24, arg1)) {
				this.method5702("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!f;Z)[B")
	private byte[] method5704(@OriginalArg(1) Class272 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class270.anIntArray499[anInt7464]);
		@Pc(32) Color local32 = new Color(Class270.anIntArray500[anInt7464]);
		@Pc(36) byte[] local36 = new byte[arg0.anInt7458];
		try {
			@Pc(78) InputStream local78;
			if (arg1) {
				@Pc(41) URL local41 = this.getCodeBase();
				@Pc(49) Socket local49 = new Socket(InetAddress.getByName(local41.getHost()), 443);
				local49.setSoTimeout(10000);
				@Pc(55) OutputStream local55 = local49.getOutputStream();
				local55.write(17);
				local55.write(("JAGGRAB " + local41.getFile() + arg0.aString73 + "\n\n").getBytes());
				local78 = local49.getInputStream();
			} else {
				local78 = (new URL(this.getCodeBase(), arg0.aString73)).openStream();
			}
			@Pc(91) int local91 = -1;
			@Pc(93) int local93 = 0;
			while (local36.length > local93) {
				@Pc(107) int local107 = local36.length - local93;
				if (local107 > 1000) {
					local107 = 1000;
				}
				@Pc(120) int local120 = local78.read(local36, local93, local107);
				if (local120 < 0) {
					throw new EOFException();
				}
				local93 += local120;
				@Pc(141) int local141 = local93 * 100 / local36.length;
				if (local141 != local91) {
					try {
						@Pc(152) Graphics local152 = this.getGraphics();
						if (local152 == null) {
							this.repaint();
						} else {
							local152.setColor(Color.black);
							local152.fillRect(0, 0, this.anInt7463, this.anInt7465);
							local152.setColor(local19);
							local152.drawRect(this.anInt7463 / 2 - 152, this.anInt7465 / 2 - 18, 303, 33);
							@Pc(202) String local202 = arg0.aStringArray57[this.anInt7462] + " - " + local141 + "%";
							local152.setFont(local8);
							local152.setColor(local32);
							local91 = local141;
							local152.drawString(local202, (this.anInt7463 - local12.stringWidth(local202)) / 2, this.anInt7465 / 2 + 4);
						}
					} catch (@Pc(234) Exception local234) {
					}
				}
			}
			local78.close();
			if (arg0.anInt7459 != arg0.anInt7458) {
				@Pc(251) byte[] local251 = new byte[arg0.anInt7459];
				@Pc(256) Inflater local256 = new Inflater(true);
				local256.setInput(local36);
				local256.inflate(local251);
				local36 = local251;
			}
		} catch (@Pc(267) Exception local267) {
			return null;
		}
		return this.method5705(false, local36, arg0) ? local36 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean616 = this.aBoolean617 = false;
		this.aBoolean615 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z[BLloader!f;I)Z")
	private boolean method5705(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class272 arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg1);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(19) int local19 = 0; local19 < 20; local19++) {
				if (arg2.anIntArray501[local19] != local17[local19]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(42) Exception local42) {
			this.method5702("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean617 = true;
		this.aBoolean616 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}
}
