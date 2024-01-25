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
	private static String aString280;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString281;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private static int anInt6805 = 0;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt6806;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt6808;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt6807 = 0;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean559 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean560 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean558 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean561 = false;

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean561 = this.aBoolean559 = false;
		this.aBoolean558 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean559 = false;
		this.aBoolean561 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString281 = this.getParameter("unsignedurl");
			if (aString281 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean560 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString281), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString280 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || local37 >= Class223.aStringArray45.length) {
					local37 = 0;
				}
			}
			@Pc(67) String local67 = this.getParameter("colourid");
			if (local67 != null) {
				anInt6805 = Integer.parseInt(local67);
				if (anInt6805 < 0 || anInt6805 >= Class223.anIntArray683.length) {
					anInt6805 = 0;
				}
			}
			this.anInt6808 = this.getSize().width;
			this.anInt6806 = this.getSize().height;
			@Pc(96) int local96 = 32;
			try {
				@Pc(101) int local101 = Integer.parseInt(this.getParameter("modewhat"));
				local96 += local101;
			} catch (@Pc(107) Exception local107) {
			}
			try {
				@Pc(111) String local111 = this.getParameter("lang");
				if (local111 != null) {
					this.anInt6807 = Integer.parseInt(local111);
				}
			} catch (@Pc(120) Exception local120) {
			}
			@Pc(130) Class228 local130;
			try {
				local130 = new Class228(this, local96, Class223.aStringArray45[local37], 29);
			} catch (@Pc(132) Exception local132) {
				this.method5899("nocache");
				return;
			}
			@Pc(139) unpack local139 = null;
			@Pc(149) byte[] local149;
			try {
				Class.forName("java.util.jar.Pack200");
				local149 = this.method5902(Class223.aClass222_2, false, local130);
				if (local149 == null) {
					return;
				}
				local139 = new unpack_Sub1(local149);
			} catch (@Pc(159) Throwable local159) {
			}
			if (local139 == null) {
				local149 = this.method5902(Class223.aClass222_1, false, local130);
				if (local149 == null) {
					return;
				}
				@Pc(177) unpack local177 = new unpack(local149);
				@Pc(182) ClassLoader_Sub1 local182 = new ClassLoader_Sub1(local177);
				@Pc(185) Class local185 = Class.forName("unpack");
				local182.method5885(local185.getName(), local185);
				@Pc(195) Class local195 = local182.loadClass("unpackclass");
				@Pc(202) byte[] local202 = this.method5902(Class223.aClass222_3, false, local130);
				if (local202 == null) {
					return;
				}
				local139 = (unpack) local195.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local202, Boolean.TRUE);
			}
			@Pc(237) ClassLoader_Sub1 local237 = new ClassLoader_Sub1(local139);
			@Pc(239) byte local239 = -1;
			@Pc(243) String local243 = System.getProperty("os.name").toLowerCase();
			@Pc(247) String local247 = System.getProperty("os.arch").toLowerCase();
			if (local243.startsWith("win")) {
				if (local247.startsWith("amd64") || local247.startsWith("x86_64")) {
					local239 = 4;
				} else {
					local239 = 0;
				}
			} else if (local243.startsWith("linux")) {
				local239 = 1;
			} else if (local243.startsWith("mac")) {
				if (local247.startsWith("ppc")) {
					local239 = 2;
				} else {
					local239 = 3;
				}
			}
			if (local239 != -1) {
				for (@Pc(295) int local295 = 0; local295 < Class223.aClass222ArrayArray1[local239].length; local295++) {
					this.method5902(Class223.aClass222ArrayArray1[local239][local295], this.getParameter("suppress_sha") != null, local130);
				}
			}
			if (Class223.aClass222Array1 != null) {
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
					this.method5902(Class223.aClass222Array1[local239], this.getParameter("suppress_sha") != null, local130);
				}
			}
			@Pc(383) Class local383 = Class.forName("Class225");
			local237.method5885(local383.getName(), local383);
			@Pc(392) Class local392 = Class.forName("Class228");
			local237.method5885(local392.getName(), local392);
			@Pc(401) Class local401 = Class.forName("Class227");
			local237.method5885(local401.getName(), local401);
			@Pc(410) Class local410 = Class.forName("Class226");
			local237.method5885(local410.getName(), local410);
			@Pc(419) Class local419 = Class.forName("Interface11");
			local237.method5885(local419.getName(), local419);
			@Pc(429) Class local429 = local237.loadClass("client");
			synchronized (this) {
				if (this.aBoolean558) {
					return;
				}
				this.anApplet2 = (Applet) local429.getDeclaredConstructor().newInstance();
				local429.getMethod("providesignlink", local392).invoke(null, local130);
				this.anApplet2.init();
				if (this.aBoolean561) {
					this.anApplet2.start();
				}
				if (this.aBoolean559) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(489) Exception local489) {
			RuntimeException_Sub2.anInt6801 = 1648144237;
			if (local489 instanceof InvocationTargetException) {
				@Pc(498) Throwable local498 = ((InvocationTargetException) local489).getTargetException();
				if (local498 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5872(local498, this, local489.toString());
			} else {
				RuntimeException_Sub2.method5872(local489, this, null);
			}
			this.method5899("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method5899(@OriginalArg(1) String arg0) {
		if (this.aBoolean560) {
			return;
		}
		this.aBoolean560 = true;
		try {
			if (aString280 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString280 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(50) Exception local50) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method5900(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean559 = true;
		this.aBoolean561 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!d;[BZI)Z")
	private boolean method5901(@OriginalArg(0) Class222 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg1);
			@Pc(16) byte[] local16 = local8.digest();
			for (@Pc(18) int local18 = 0; local18 < 20; local18++) {
				if (arg0.anIntArray681[local18] != local16[local18]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(41) Exception local41) {
			this.method5899("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean558 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!d;BZLloader!wd;)[B")
	private byte[] method5902(@OriginalArg(0) Class222 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class228 arg2) {
		@Pc(11) File local11;
		try {
			local11 = arg2.method5935(arg0.aString279);
		} catch (@Pc(13) Exception local13) {
			this.method5899("nocache");
			return null;
		}
		@Pc(26) byte[] local26 = this.method5900(local11);
		if (!this.method5901(arg0, local26, arg1)) {
			local26 = this.method5904(false, arg0);
			if (local26 == null) {
				local26 = this.method5904(true, arg0);
			}
			if (local26 == null) {
				this.method5899("download");
				return null;
			}
			if (!this.method5903(local11, local26)) {
				return null;
			}
			local26 = this.method5900(local11);
			if (!this.method5901(arg0, local26, false)) {
				this.method5899("mismatch");
				return null;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BI)Z")
	private boolean method5903(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method5899("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZILloader!d;)[B")
	private byte[] method5904(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class222 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class223.anIntArray683[anInt6805]);
		@Pc(26) Color local26 = new Color(Class223.anIntArray682[anInt6805]);
		@Pc(30) byte[] local30 = new byte[arg1.anInt6803];
		try {
			@Pc(41) InputStream local41;
			if (arg0) {
				@Pc(46) URL local46 = this.getCodeBase();
				@Pc(54) Socket local54 = new Socket(InetAddress.getByName(local46.getHost()), 443);
				local54.setSoTimeout(10000);
				@Pc(60) OutputStream local60 = local54.getOutputStream();
				local60.write(17);
				local60.write(("JAGGRAB " + local46.getFile() + arg1.aString278 + "\n\n").getBytes());
				local41 = local54.getInputStream();
			} else {
				local41 = (new URL(this.getCodeBase(), arg1.aString278)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = 0;
			while (local30.length > local87) {
				@Pc(101) int local101 = local30.length - local87;
				if (local101 > 1000) {
					local101 = 1000;
				}
				@Pc(115) int local115 = local41.read(local30, local87, local101);
				if (local115 < 0) {
					throw new EOFException();
				}
				local87 += local115;
				@Pc(135) int local135 = local87 * 100 / local30.length;
				if (local85 != local135) {
					try {
						@Pc(145) Graphics local145 = this.getGraphics();
						if (local145 == null) {
							this.repaint();
						} else {
							local145.setColor(Color.black);
							local145.fillRect(0, 0, this.anInt6808, this.anInt6806);
							local145.setColor(local19);
							local145.drawRect(this.anInt6808 / 2 - 152, this.anInt6806 / 2 + -18, 303, 33);
							@Pc(198) String local198 = arg1.aStringArray44[this.anInt6807] + " - " + local135 + "%";
							local145.setFont(local8);
							local145.setColor(local26);
							local85 = local135;
							local145.drawString(local198, (this.anInt6808 - local12.stringWidth(local198)) / 2, this.anInt6806 / 2 + 4);
						}
					} catch (@Pc(225) Exception local225) {
					}
				}
			}
			local41.close();
			if (arg1.anInt6804 != arg1.anInt6803) {
				@Pc(242) byte[] local242 = new byte[arg1.anInt6804];
				@Pc(247) Inflater local247 = new Inflater(true);
				local247.setInput(local30);
				local247.inflate(local242);
				local30 = local242;
			}
		} catch (@Pc(258) Exception local258) {
			return null;
		}
		return this.method5901(arg1, local30, false) ? local30 : null;
	}
}
