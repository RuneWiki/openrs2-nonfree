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

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString79;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private static int anInt7864 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt7863;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt7866;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean499 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt7865 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean497 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean500 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean498 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!kj;Lloader!g;IZ)[B")
	private byte[] method6155(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg0.method6146(arg1.aString69);
		} catch (@Pc(7) Exception local7) {
			this.method6157("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method6156(local5);
		if (!this.method6160(arg2, local24, arg1)) {
			local24 = this.method6158(false, arg1);
			if (local24 == null) {
				local24 = this.method6158(true, arg1);
			}
			if (local24 == null) {
				this.method6157("download");
				return null;
			}
			if (!this.method6159(local24, local5)) {
				return null;
			}
			local24 = this.method6156(local5);
			if (!this.method6160(false, local24, arg1)) {
				this.method6157("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean497 = true;
		this.aBoolean499 = this.aBoolean498 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B)[B")
	private byte[] method6156(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(16) int local16 = (int) arg0.length();
			@Pc(27) DataInputStream local27 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(30) byte[] local30 = new byte[local16];
			local27.readFully(local30, 0, local16);
			local27.close();
			return local30;
		} catch (@Pc(40) IOException local40) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString79 = this.getParameter("unsignedurl");
			if (aString79 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean500 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString79), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString78 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || Class270.aStringArray57.length <= local38) {
					local38 = 0;
				}
			}
			@Pc(67) String local67 = this.getParameter("colourid");
			if (local67 != null) {
				anInt7864 = Integer.parseInt(local67);
				if (anInt7864 < 0 || Class270.anIntArray692.length <= anInt7864) {
					anInt7864 = 0;
				}
			}
			this.anInt7863 = this.getSize().width;
			this.anInt7866 = this.getSize().height;
			@Pc(99) int local99 = 32;
			try {
				@Pc(104) int local104 = Integer.parseInt(this.getParameter("modewhat"));
				local99 += local104;
			} catch (@Pc(110) Exception local110) {
			}
			try {
				@Pc(114) String local114 = this.getParameter("lang");
				if (local114 != null) {
					this.anInt7865 = Integer.parseInt(local114);
				}
			} catch (@Pc(122) Exception local122) {
			}
			@Pc(132) Class277 local132;
			try {
				local132 = new Class277(this, local99, Class270.aStringArray57[local38], 30);
			} catch (@Pc(134) Exception local134) {
				this.method6157("nocache");
				return;
			}
			@Pc(141) unpack local141 = null;
			@Pc(151) byte[] local151;
			try {
				Class.forName("java.util.jar.Pack200");
				local151 = this.method6155(local132, Class270.aClass273_2, false);
				if (local151 == null) {
					return;
				}
				local141 = new unpack_Sub1(local151);
			} catch (@Pc(161) Throwable local161) {
			}
			if (local141 == null) {
				local151 = this.method6155(local132, Class270.aClass273_1, false);
				if (local151 == null) {
					return;
				}
				@Pc(181) unpack local181 = new unpack(local151);
				@Pc(186) ClassLoader_Sub1 local186 = new ClassLoader_Sub1(local181);
				@Pc(189) Class local189 = Class.forName("unpack");
				local186.method6114(local189.getName(), local189);
				@Pc(199) Class local199 = local186.loadClass("unpackclass");
				@Pc(206) byte[] local206 = this.method6155(local132, Class270.aClass273_3, false);
				if (local206 == null) {
					return;
				}
				local141 = (unpack) local199.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local206, Boolean.TRUE);
			}
			@Pc(241) ClassLoader_Sub1 local241 = new ClassLoader_Sub1(local141);
			@Pc(243) byte local243 = -1;
			@Pc(247) String local247 = System.getProperty("os.name").toLowerCase();
			@Pc(251) String local251 = System.getProperty("os.arch").toLowerCase();
			if (local247.startsWith("win")) {
				if (local251.startsWith("amd64") || local251.startsWith("x86_64")) {
					local243 = 1;
				} else {
					local243 = 0;
				}
			} else if (local247.startsWith("linux")) {
				if (local251.startsWith("amd64") || local251.startsWith("x86_64")) {
					local243 = 3;
				} else {
					local243 = 2;
				}
			} else if (local247.startsWith("mac")) {
				if (local251.startsWith("ppc")) {
					local243 = 4;
				} else if (local251.startsWith("x86_64")) {
					local243 = 6;
				} else {
					local243 = 7;
				}
			}
			if (local243 != -1) {
				this.method6155(local132, Class270.aClass273Array1[local243], this.getParameter("suppress_sha") != null);
			}
			if (Class270.aClass273Array2 != null) {
				local243 = -1;
				local247 = System.getProperty("os.name").toLowerCase();
				local251 = System.getProperty("os.arch").toLowerCase();
				if (local247.startsWith("win")) {
					if (local251.startsWith("amd64") || local251.startsWith("x86_64")) {
						local243 = 2;
					} else {
						local243 = 0;
					}
				}
				if (local243 != -1) {
					this.method6155(local132, Class270.aClass273Array2[local243], this.getParameter("suppress_sha") != null);
				}
			}
			if (Class270.aClass273Array3 != null) {
				local243 = -1;
				local247 = System.getProperty("os.name").toLowerCase();
				local251 = System.getProperty("os.arch").toLowerCase();
				if (local247.startsWith("win") && !local251.startsWith("amd64") && !local251.startsWith("x86_64")) {
					local243 = 0;
				}
				if (local243 != -1) {
					this.method6155(local132, Class270.aClass273Array3[local243], this.getParameter("suppress_sha") != null);
				}
			}
			@Pc(438) Class local438 = Class.forName("Class276");
			local241.method6114(local438.getName(), local438);
			@Pc(447) Class local447 = Class.forName("Class277");
			local241.method6114(local447.getName(), local447);
			@Pc(456) Class local456 = Class.forName("Class274");
			local241.method6114(local456.getName(), local456);
			@Pc(465) Class local465 = Class.forName("Class272");
			local241.method6114(local465.getName(), local465);
			@Pc(474) Class local474 = Class.forName("Interface14");
			local241.method6114(local474.getName(), local474);
			@Pc(484) Class local484 = local241.loadClass("client");
			synchronized (this) {
				if (this.aBoolean497) {
					return;
				}
				this.anApplet3 = (Applet) local484.getDeclaredConstructor().newInstance();
				local484.getMethod("providesignlink", local447).invoke(null, local132);
				this.anApplet3.init();
				if (this.aBoolean499) {
					this.anApplet3.start();
				}
				if (this.aBoolean498) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(543) Exception local543) {
			RuntimeException_Sub2.anInt7853 = 1836482371;
			if (local543 instanceof InvocationTargetException) {
				@Pc(552) Throwable local552 = ((InvocationTargetException) local543).getTargetException();
				if (local552 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6106(local552, local543.toString(), this);
			} else {
				RuntimeException_Sub2.method6106(local543, null, this);
			}
			this.method6157("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method6157(@OriginalArg(1) String arg0) {
		if (this.aBoolean500) {
			return;
		}
		this.aBoolean500 = true;
		try {
			if (aString78 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString78 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean497 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!g;B)[B")
	private byte[] method6158(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class273 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class270.anIntArray692[anInt7864]);
		@Pc(26) Color local26 = new Color(Class270.anIntArray691[anInt7864]);
		@Pc(30) byte[] local30 = new byte[arg1.anInt7856];
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
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = 0;
			while (local87 < local30.length) {
				@Pc(100) int local100 = local30.length - local87;
				if (local100 > 1000) {
					local100 = 1000;
				}
				@Pc(113) int local113 = local41.read(local30, local87, local100);
				if (local113 < 0) {
					throw new EOFException();
				}
				local87 += local113;
				@Pc(132) int local132 = local87 * 100 / local30.length;
				if (local132 != local85) {
					try {
						@Pc(139) Graphics local139 = this.getGraphics();
						if (local139 == null) {
							this.repaint();
						} else {
							local139.setColor(Color.black);
							local139.fillRect(0, 0, this.anInt7863, this.anInt7866);
							local139.setColor(local19);
							local139.drawRect(this.anInt7863 / 2 - 152, this.anInt7866 / 2 + -18, 303, 33);
							@Pc(192) String local192 = arg1.aStringArray58[this.anInt7865] + " - " + local132 + "%";
							local139.setFont(local8);
							local139.setColor(local26);
							local85 = local132;
							local139.drawString(local192, (this.anInt7863 - local12.stringWidth(local192)) / 2, this.anInt7866 / 2 + 4);
						}
					} catch (@Pc(219) Exception local219) {
					}
				}
			}
			local41.close();
			if (arg1.anInt7856 != arg1.anInt7855) {
				@Pc(237) byte[] local237 = new byte[arg1.anInt7855];
				@Pc(242) Inflater local242 = new Inflater(true);
				local242.setInput(local30);
				local242.inflate(local237);
				local30 = local237;
			}
		} catch (@Pc(253) Exception local253) {
			return null;
		}
		return this.method6160(false, local30, arg1) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean499 = true;
		this.aBoolean498 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLjava/io/File;)Z")
	private boolean method6159(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method6157("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean499 = false;
		this.aBoolean498 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZI[BLloader!g;)Z")
	private boolean method6160(@OriginalArg(0) boolean arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) Class273 arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(18) MessageDigest local18 = MessageDigest.getInstance("SHA");
			local18.reset();
			local18.update(arg1);
			@Pc(26) byte[] local26 = local18.digest();
			for (@Pc(28) int local28 = 0; local28 < 20; local28++) {
				if (arg2.anIntArray693[local28] != local26[local28]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(53) Exception local53) {
			this.method6157("sha");
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
}
