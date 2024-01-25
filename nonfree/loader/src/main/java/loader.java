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
	private static String aString266;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString267;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private static int anInt6772 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt6771;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt6773;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean452 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean449 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean450 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean451 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt6770 = 0;

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString267 = this.getParameter("unsignedurl");
			if (aString267 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean450 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString267), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString266 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || Class222.aStringArray79.length <= local37) {
					local37 = 0;
				}
			}
			@Pc(61) String local61 = this.getParameter("colourid");
			if (local61 != null) {
				anInt6772 = Integer.parseInt(local61);
				if (anInt6772 < 0 || anInt6772 >= Class222.anIntArray651.length) {
					anInt6772 = 0;
				}
			}
			this.anInt6773 = this.getSize().width;
			this.anInt6771 = this.getSize().height;
			@Pc(91) int local91 = 32;
			try {
				@Pc(96) int local96 = Integer.parseInt(this.getParameter("modewhat"));
				local91 += local96;
			} catch (@Pc(102) Exception local102) {
			}
			try {
				@Pc(106) String local106 = this.getParameter("lang");
				if (local106 != null) {
					this.anInt6770 = Integer.parseInt(local106);
				}
			} catch (@Pc(115) Exception local115) {
			}
			@Pc(125) Class221 local125;
			try {
				local125 = new Class221(this, local91, Class222.aStringArray79[local37], 29);
			} catch (@Pc(127) Exception local127) {
				this.method6072("nocache");
				return;
			}
			@Pc(134) unpack local134 = null;
			@Pc(144) byte[] local144;
			try {
				Class.forName("java.util.jar.Pack200");
				local144 = this.method6076(local125, false, Class222.aClass224_2);
				if (local144 == null) {
					return;
				}
				local134 = new unpack_Sub1(local144);
			} catch (@Pc(155) Throwable local155) {
			}
			if (local134 == null) {
				local144 = this.method6076(local125, false, Class222.aClass224_1);
				if (local144 == null) {
					return;
				}
				@Pc(173) unpack local173 = new unpack(local144);
				@Pc(178) ClassLoader_Sub1 local178 = new ClassLoader_Sub1(local173);
				@Pc(181) Class local181 = Class.forName("unpack");
				local178.method6049(local181.getName(), local181);
				@Pc(191) Class local191 = local178.loadClass("unpackclass");
				@Pc(198) byte[] local198 = this.method6076(local125, false, Class222.aClass224_3);
				if (local198 == null) {
					return;
				}
				local134 = (unpack) local191.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local198, Boolean.TRUE);
			}
			@Pc(234) ClassLoader_Sub1 local234 = new ClassLoader_Sub1(local134);
			@Pc(236) byte local236 = -1;
			@Pc(240) String local240 = System.getProperty("os.name").toLowerCase();
			@Pc(244) String local244 = System.getProperty("os.arch").toLowerCase();
			if (local240.startsWith("win")) {
				if (local244.startsWith("amd64") || local244.startsWith("x86_64")) {
					local236 = 4;
				} else {
					local236 = 0;
				}
			} else if (local240.startsWith("linux")) {
				local236 = 1;
			} else if (local240.startsWith("mac")) {
				if (local244.startsWith("ppc")) {
					local236 = 2;
				} else {
					local236 = 3;
				}
			}
			if (local236 != -1) {
				for (@Pc(291) int local291 = 0; local291 < Class222.aClass224ArrayArray1[local236].length; local291++) {
					this.method6076(local125, this.getParameter("suppress_sha") != null, Class222.aClass224ArrayArray1[local236][local291]);
				}
			}
			if (Class222.aClass224Array1 != null) {
				local236 = -1;
				local240 = System.getProperty("os.name").toLowerCase();
				local244 = System.getProperty("os.arch").toLowerCase();
				if (local240.startsWith("win")) {
					if (local244.startsWith("amd64") || local244.startsWith("x86_64")) {
						local236 = 2;
					} else {
						local236 = 0;
					}
				}
				if (local236 != -1) {
					this.method6076(local125, this.getParameter("suppress_sha") != null, Class222.aClass224Array1[local236]);
				}
			}
			@Pc(375) Class local375 = Class.forName("Class226");
			local234.method6049(local375.getName(), local375);
			@Pc(384) Class local384 = Class.forName("Class221");
			local234.method6049(local384.getName(), local384);
			@Pc(393) Class local393 = Class.forName("Class228");
			local234.method6049(local393.getName(), local393);
			@Pc(402) Class local402 = Class.forName("Class227");
			local234.method6049(local402.getName(), local402);
			@Pc(411) Class local411 = Class.forName("Interface10");
			local234.method6049(local411.getName(), local411);
			@Pc(421) Class local421 = local234.loadClass("client");
			synchronized (this) {
				if (this.aBoolean451) {
					return;
				}
				this.anApplet3 = (Applet) local421.getDeclaredConstructor().newInstance();
				local421.getMethod("providesignlink", local384).invoke(null, local125);
				this.anApplet3.init();
				if (this.aBoolean449) {
					this.anApplet3.start();
				}
				if (this.aBoolean452) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(480) Exception local480) {
			RuntimeException_Sub2.anInt6766 = -1426357175;
			if (local480 instanceof InvocationTargetException) {
				@Pc(489) Throwable local489 = ((InvocationTargetException) local480).getTargetException();
				if (local489 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6053(local489, this, local480.toString());
			} else {
				RuntimeException_Sub2.method6053(local480, this, null);
			}
			this.method6072("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/lang/String;)V")
	private void method6072(@OriginalArg(1) String arg0) {
		if (this.aBoolean450) {
			return;
		}
		this.aBoolean450 = true;
		try {
			if (aString266 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString266 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(52) Exception local52) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean452 = false;
		this.aBoolean449 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method6073(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;I)Z")
	private boolean method6074(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method6072("savefile");
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

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean452 = true;
		this.aBoolean449 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!g;BZ)[B")
	private byte[] method6075(@OriginalArg(0) Class224 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class222.anIntArray651[anInt6772]);
		@Pc(26) Color local26 = new Color(Class222.anIntArray652[anInt6772]);
		@Pc(30) byte[] local30 = new byte[arg0.anInt6769];
		try {
			@Pc(72) InputStream local72;
			if (arg1) {
				@Pc(35) URL local35 = this.getCodeBase();
				@Pc(43) Socket local43 = new Socket(InetAddress.getByName(local35.getHost()), 443);
				local43.setSoTimeout(10000);
				@Pc(49) OutputStream local49 = local43.getOutputStream();
				local49.write(17);
				local49.write(("JAGGRAB " + local35.getFile() + arg0.aString265 + "\n\n").getBytes());
				local72 = local43.getInputStream();
			} else {
				local72 = (new URL(this.getCodeBase(), arg0.aString265)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = 0;
			while (local87 < local30.length) {
				@Pc(101) int local101 = local30.length - local87;
				if (local101 > 1000) {
					local101 = 1000;
				}
				@Pc(114) int local114 = local72.read(local30, local87, local101);
				if (local114 < 0) {
					throw new EOFException();
				}
				local87 += local114;
				@Pc(135) int local135 = local87 * 100 / local30.length;
				if (local135 != local85) {
					try {
						@Pc(145) Graphics local145 = this.getGraphics();
						if (local145 == null) {
							this.repaint();
						} else {
							local145.setColor(Color.black);
							local145.fillRect(0, 0, this.anInt6773, this.anInt6771);
							local145.setColor(local19);
							local145.drawRect(this.anInt6773 / 2 - 152, this.anInt6771 / 2 - 18, 303, 33);
							@Pc(198) String local198 = arg0.aStringArray80[this.anInt6770] + " - " + local135 + "%";
							local145.setFont(local8);
							local145.setColor(local26);
							local85 = local135;
							local145.drawString(local198, (this.anInt6773 - local12.stringWidth(local198)) / 2, this.anInt6771 / 2 + 4);
						}
					} catch (@Pc(225) Exception local225) {
					}
				}
			}
			local72.close();
			if (arg0.anInt6769 != arg0.anInt6768) {
				@Pc(242) byte[] local242 = new byte[arg0.anInt6768];
				@Pc(247) Inflater local247 = new Inflater(true);
				local247.setInput(local30);
				local247.inflate(local242);
				local30 = local242;
			}
		} catch (@Pc(258) Exception local258) {
			return null;
		}
		return this.method6077(arg0, local30, false) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!ap;IZLloader!g;)[B")
	private byte[] method6076(@OriginalArg(0) Class221 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class224 arg2) {
		@Pc(11) File local11;
		try {
			local11 = arg0.method6042(arg2.aString264);
		} catch (@Pc(13) Exception local13) {
			this.method6072("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method6073(local11);
		if (!this.method6077(arg2, local24, arg1)) {
			local24 = this.method6075(arg2, false);
			if (local24 == null) {
				local24 = this.method6075(arg2, true);
			}
			if (local24 == null) {
				this.method6072("download");
				return null;
			}
			if (!this.method6074(local24, local11)) {
				return null;
			}
			local24 = this.method6073(local11);
			if (!this.method6077(arg2, local24, false)) {
				this.method6072("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean451 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!g;[BZ)Z")
	private boolean method6077(@OriginalArg(1) Class224 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(14) MessageDigest local14 = MessageDigest.getInstance("SHA");
			local14.reset();
			local14.update(arg1);
			@Pc(22) byte[] local22 = local14.digest();
			for (@Pc(24) int local24 = 0; local24 < 20; local24++) {
				if (arg0.anIntArray653[local24] != local22[local24]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(44) Exception local44) {
			this.method6072("sha");
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
		this.aBoolean451 = true;
		this.aBoolean449 = this.aBoolean452 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}
}
