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
	private static String aString450;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString451;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private static int anInt6713 = 0;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private int anInt6714;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt6716;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean498 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean500 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt6715 = 0;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean501 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean499 = false;

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean499 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!bd;ZLloader!f;Z)[B")
	private byte[] method5768(@OriginalArg(0) Class222 arg0, @OriginalArg(2) Class225 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(15) File local15;
		try {
			local15 = arg0.method5726(arg1.aString448);
		} catch (@Pc(17) Exception local17) {
			this.method5771("nocache");
			return null;
		}
		@Pc(28) byte[] local28 = this.method5769(local15);
		if (!this.method5770(arg1, arg2, local28)) {
			local28 = this.method5772(arg1, false);
			if (local28 == null) {
				local28 = this.method5772(arg1, true);
			}
			if (local28 == null) {
				this.method5771("download");
				return null;
			}
			if (!this.method5773(local28, local15)) {
				return null;
			}
			local28 = this.method5769(local15);
			if (!this.method5770(arg1, false, local28)) {
				this.method5771("mismatch");
				return null;
			}
		}
		return local28;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean498 = true;
		this.aBoolean501 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method5769(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(13) int local13 = (int) arg0.length();
			@Pc(24) DataInputStream local24 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(27) byte[] local27 = new byte[local13];
			local24.readFully(local27, 0, local13);
			local24.close();
			return local27;
		} catch (@Pc(37) IOException local37) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;Z[BB)Z")
	private boolean method5770(@OriginalArg(0) Class225 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) byte[] arg2) {
		try {
			if (arg2 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg2);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(19) int local19 = 0; local19 < 20; local19++) {
				if (local17[local19] != arg0.anIntArray856[local19]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(48) Exception local48) {
			this.method5771("sha");
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

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean498 = this.aBoolean501 = false;
		this.aBoolean499 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method5771(@OriginalArg(0) String arg0) {
		if (this.aBoolean500) {
			return;
		}
		this.aBoolean500 = true;
		try {
			if (aString451 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString451 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!f;Z)[B")
	private byte[] method5772(@OriginalArg(1) Class225 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class221.anIntArray854[anInt6713]);
		@Pc(26) Color local26 = new Color(Class221.anIntArray855[anInt6713]);
		@Pc(30) byte[] local30 = new byte[arg0.anInt6707];
		try {
			@Pc(41) InputStream local41;
			if (arg1) {
				@Pc(46) URL local46 = this.getCodeBase();
				@Pc(54) Socket local54 = new Socket(InetAddress.getByName(local46.getHost()), 443);
				local54.setSoTimeout(10000);
				@Pc(60) OutputStream local60 = local54.getOutputStream();
				local60.write(17);
				local60.write(("JAGGRAB " + local46.getFile() + arg0.aString449 + "\n\n").getBytes());
				local41 = local54.getInputStream();
			} else {
				local41 = (new URL(this.getCodeBase(), arg0.aString449)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = 0;
			while (local87 < local30.length) {
				@Pc(101) int local101 = local30.length - local87;
				if (local101 > 1000) {
					local101 = 1000;
				}
				@Pc(114) int local114 = local41.read(local30, local87, local101);
				if (local114 < 0) {
					throw new EOFException();
				}
				local87 += local114;
				@Pc(135) int local135 = local87 * 100 / local30.length;
				if (local85 != local135) {
					try {
						@Pc(141) Graphics local141 = this.getGraphics();
						if (local141 == null) {
							this.repaint();
						} else {
							local141.setColor(Color.black);
							local141.fillRect(0, 0, this.anInt6716, this.anInt6714);
							local141.setColor(local19);
							local141.drawRect(this.anInt6716 / 2 - 152, this.anInt6714 / 2 + -18, 303, 33);
							@Pc(190) String local190 = arg0.aStringArray51[this.anInt6715] + " - " + local135 + "%";
							local141.setFont(local8);
							local141.setColor(local26);
							local85 = local135;
							local141.drawString(local190, (this.anInt6716 - local12.stringWidth(local190)) / 2, this.anInt6714 / 2 + 4);
						}
					} catch (@Pc(221) Exception local221) {
					}
				}
			}
			local41.close();
			if (arg0.anInt6707 != arg0.anInt6708) {
				@Pc(235) byte[] local235 = new byte[arg0.anInt6708];
				@Pc(240) Inflater local240 = new Inflater(true);
				local240.setInput(local30);
				local30 = local235;
				local240.inflate(local235);
			}
		} catch (@Pc(251) Exception local251) {
			return null;
		}
		return this.method5770(arg0, false, local30) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString450 = this.getParameter("unsignedurl");
			if (aString450 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean500 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString450), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			aString451 = this.getParameter("crashurl");
			@Pc(39) int local39 = 0;
			@Pc(43) String local43 = this.getParameter("cachesubdirid");
			if (local43 != null) {
				local39 = Integer.parseInt(local43);
				if (local39 < 0 || local39 >= Class221.aStringArray50.length) {
					local39 = 0;
				}
			}
			@Pc(62) String local62 = this.getParameter("colourid");
			if (local62 != null) {
				anInt6713 = Integer.parseInt(local62);
				if (anInt6713 < 0 || anInt6713 >= Class221.anIntArray854.length) {
					anInt6713 = 0;
				}
			}
			this.anInt6716 = this.getSize().width;
			this.anInt6714 = this.getSize().height;
			@Pc(90) int local90 = 32;
			try {
				@Pc(95) int local95 = Integer.parseInt(this.getParameter("modewhat"));
				local90 += local95;
			} catch (@Pc(101) Exception local101) {
			}
			try {
				@Pc(105) String local105 = this.getParameter("lang");
				if (local105 != null) {
					this.anInt6715 = Integer.parseInt(local105);
				}
			} catch (@Pc(114) Exception local114) {
			}
			@Pc(124) Class222 local124;
			try {
				local124 = new Class222(this, local90, Class221.aStringArray50[local39], 29);
			} catch (@Pc(126) Exception local126) {
				this.method5771("nocache");
				return;
			}
			@Pc(133) unpack local133 = null;
			@Pc(143) byte[] local143;
			try {
				Class.forName("java.util.jar.Pack200");
				local143 = this.method5768(local124, Class221.aClass225_2, false);
				if (local143 == null) {
					return;
				}
				local133 = new unpack_Sub1(local143);
			} catch (@Pc(154) Throwable local154) {
			}
			if (local133 == null) {
				local143 = this.method5768(local124, Class221.aClass225_1, false);
				if (local143 == null) {
					return;
				}
				@Pc(175) unpack local175 = new unpack(local143);
				@Pc(180) ClassLoader_Sub1 local180 = new ClassLoader_Sub1(local175);
				@Pc(183) Class local183 = Class.forName("unpack");
				local180.method5764(local183, local183.getName());
				@Pc(193) Class local193 = local180.loadClass("unpackclass");
				@Pc(200) byte[] local200 = this.method5768(local124, Class221.aClass225_3, false);
				if (local200 == null) {
					return;
				}
				local133 = (unpack) local193.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local200, Boolean.TRUE);
			}
			@Pc(236) ClassLoader_Sub1 local236 = new ClassLoader_Sub1(local133);
			@Pc(238) byte local238 = -1;
			@Pc(242) String local242 = System.getProperty("os.name").toLowerCase();
			@Pc(246) String local246 = System.getProperty("os.arch").toLowerCase();
			if (local242.startsWith("win")) {
				if (local246.startsWith("amd64") || local246.startsWith("x86_64")) {
					local238 = 4;
				} else {
					local238 = 0;
				}
			} else if (local242.startsWith("linux")) {
				local238 = 1;
			} else if (local242.startsWith("mac")) {
				if (local246.startsWith("ppc")) {
					local238 = 2;
				} else {
					local238 = 3;
				}
			}
			if (local238 != -1) {
				for (@Pc(294) int local294 = 0; local294 < Class221.aClass225ArrayArray1[local238].length; local294++) {
					this.method5768(local124, Class221.aClass225ArrayArray1[local238][local294], this.getParameter("suppress_sha") != null);
				}
			}
			if (Class221.aClass225Array1 != null) {
				local238 = -1;
				local242 = System.getProperty("os.name").toLowerCase();
				local246 = System.getProperty("os.arch").toLowerCase();
				if (local242.startsWith("win")) {
					if (local246.startsWith("amd64") || local246.startsWith("x86_64")) {
						local238 = 2;
					} else {
						local238 = 0;
					}
				}
				if (local238 != -1) {
					this.method5768(local124, Class221.aClass225Array1[local238], this.getParameter("suppress_sha") != null);
				}
			}
			@Pc(377) Class local377 = Class.forName("Class228");
			local236.method5764(local377, local377.getName());
			@Pc(386) Class local386 = Class.forName("Class222");
			local236.method5764(local386, local386.getName());
			@Pc(395) Class local395 = Class.forName("Class226");
			local236.method5764(local395, local395.getName());
			@Pc(404) Class local404 = Class.forName("Class227");
			local236.method5764(local404, local404.getName());
			@Pc(413) Class local413 = Class.forName("Interface11");
			local236.method5764(local413, local413.getName());
			@Pc(423) Class local423 = local236.loadClass("client");
			synchronized (this) {
				if (this.aBoolean499) {
					return;
				}
				this.anApplet3 = (Applet) local423.getDeclaredConstructor().newInstance();
				local423.getMethod("providesignlink", local386).invoke(null, local124);
				this.anApplet3.init();
				if (this.aBoolean498) {
					this.anApplet3.start();
				}
				if (this.aBoolean501) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(482) Exception local482) {
			RuntimeException_Sub2.anInt6705 = -1055488767;
			if (local482 instanceof InvocationTargetException) {
				@Pc(491) Throwable local491 = ((InvocationTargetException) local482).getTargetException();
				if (local491 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5760(this, local482.toString(), local491);
			} else {
				RuntimeException_Sub2.method5760(this, null, local482);
			}
			this.method5771("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(B[BLjava/io/File;)Z")
	private boolean method5773(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method5771("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean498 = false;
		this.aBoolean501 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}
}
