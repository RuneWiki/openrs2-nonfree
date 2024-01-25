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

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/lang/String;")
	private static String aString80;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString81;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private static int anInt6638 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt6635;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt6637;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean478 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt6636 = 0;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean479 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean480 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean481 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!d;Z[B)Z")
	private boolean method5728(@OriginalArg(1) Class256 arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg2);
			@Pc(18) byte[] local18 = local10.digest();
			for (@Pc(20) int local20 = 0; local20 < 20; local20++) {
				if (local18[local20] != arg0.anIntArray1360[local20]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(40) Exception local40) {
			this.method5731("sha");
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

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString81 = this.getParameter("unsignedurl");
			if (aString81 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean478 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString81), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString80 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || local37 >= Class254.aStringArray163.length) {
					local37 = 0;
				}
			}
			@Pc(64) String local64 = this.getParameter("colourid");
			if (local64 != null) {
				anInt6638 = Integer.parseInt(local64);
				if (anInt6638 < 0 || anInt6638 >= Class254.anIntArray1359.length) {
					anInt6638 = 0;
				}
			}
			this.anInt6637 = this.getSize().width;
			this.anInt6635 = this.getSize().height;
			@Pc(95) int local95 = 32;
			try {
				@Pc(100) int local100 = Integer.parseInt(this.getParameter("modewhat"));
				local95 += local100;
			} catch (@Pc(106) Exception local106) {
			}
			try {
				@Pc(110) String local110 = this.getParameter("lang");
				if (local110 != null) {
					this.anInt6636 = Integer.parseInt(local110);
				}
			} catch (@Pc(120) Exception local120) {
			}
			@Pc(130) Class258 local130;
			try {
				local130 = new Class258(this, local95, Class254.aStringArray163[local37], 29);
			} catch (@Pc(132) Exception local132) {
				this.method5731("nocache");
				return;
			}
			@Pc(139) unpack local139 = null;
			@Pc(149) byte[] local149;
			try {
				Class.forName("java.util.jar.Pack200");
				local149 = this.method5733(local130, Class254.aClass256_2, false);
				if (local149 == null) {
					return;
				}
				local139 = new unpack_Sub1(local149);
			} catch (@Pc(161) Throwable local161) {
			}
			if (local139 == null) {
				local149 = this.method5733(local130, Class254.aClass256_1, false);
				if (local149 == null) {
					return;
				}
				@Pc(180) unpack local180 = new unpack(local149);
				@Pc(185) ClassLoader_Sub1 local185 = new ClassLoader_Sub1(local180);
				@Pc(188) Class local188 = Class.forName("unpack");
				local185.method5686(local188, local188.getName());
				@Pc(198) Class local198 = local185.loadClass("unpackclass");
				@Pc(205) byte[] local205 = this.method5733(local130, Class254.aClass256_3, false);
				if (local205 == null) {
					return;
				}
				local139 = (unpack) local198.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local205, Boolean.TRUE);
			}
			@Pc(239) ClassLoader_Sub1 local239 = new ClassLoader_Sub1(local139);
			@Pc(241) byte local241 = -1;
			@Pc(245) String local245 = System.getProperty("os.name").toLowerCase();
			@Pc(249) String local249 = System.getProperty("os.arch").toLowerCase();
			if (local245.startsWith("win")) {
				if (local249.startsWith("amd64") || local249.startsWith("x86_64")) {
					local241 = 4;
				} else {
					local241 = 0;
				}
			} else if (local245.startsWith("linux")) {
				local241 = 1;
			} else if (local245.startsWith("mac")) {
				if (local249.startsWith("ppc")) {
					local241 = 2;
				} else if (local249.startsWith("x86_64")) {
					local241 = 5;
				} else {
					local241 = 3;
				}
			}
			if (local241 != -1) {
				for (@Pc(304) int local304 = 0; local304 < Class254.aClass256ArrayArray1[local241].length; local304++) {
					this.method5733(local130, Class254.aClass256ArrayArray1[local241][local304], this.getParameter("suppress_sha") != null);
				}
			}
			if (Class254.aClass256Array1 != null) {
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
					this.method5733(local130, Class254.aClass256Array1[local241], this.getParameter("suppress_sha") != null);
				}
			}
			@Pc(389) Class local389 = Class.forName("Class253");
			local239.method5686(local389, local389.getName());
			@Pc(398) Class local398 = Class.forName("Class258");
			local239.method5686(local398, local398.getName());
			@Pc(407) Class local407 = Class.forName("Class259");
			local239.method5686(local407, local407.getName());
			@Pc(416) Class local416 = Class.forName("Class255");
			local239.method5686(local416, local416.getName());
			@Pc(425) Class local425 = Class.forName("Interface13");
			local239.method5686(local425, local425.getName());
			@Pc(435) Class local435 = local239.loadClass("client");
			synchronized (this) {
				if (this.aBoolean481) {
					return;
				}
				this.anApplet3 = (Applet) local435.getDeclaredConstructor().newInstance();
				local435.getMethod("providesignlink", local398).invoke(null, local130);
				this.anApplet3.init();
				if (this.aBoolean480) {
					this.anApplet3.start();
				}
				if (this.aBoolean479) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(495) Exception local495) {
			RuntimeException_Sub2.anInt6631 = 142684109;
			if (local495 instanceof InvocationTargetException) {
				@Pc(511) Throwable local511 = ((InvocationTargetException) local495).getTargetException();
				if (local511 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5692(local495.toString(), this, local511);
			} else {
				RuntimeException_Sub2.method5692(null, this, local495);
			}
			this.method5731("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean481 = true;
		this.aBoolean480 = this.aBoolean479 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!d;Z)[B")
	private byte[] method5729(@OriginalArg(1) Class256 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class254.anIntArray1359[anInt6638]);
		@Pc(26) Color local26 = new Color(Class254.anIntArray1358[anInt6638]);
		@Pc(30) byte[] local30 = new byte[arg0.anInt6630];
		try {
			@Pc(41) InputStream local41;
			if (arg1) {
				@Pc(46) URL local46 = this.getCodeBase();
				@Pc(54) Socket local54 = new Socket(InetAddress.getByName(local46.getHost()), 443);
				local54.setSoTimeout(10000);
				@Pc(60) OutputStream local60 = local54.getOutputStream();
				local60.write(17);
				local60.write(("JAGGRAB " + local46.getFile() + arg0.aString69 + "\n\n").getBytes());
				local41 = local54.getInputStream();
			} else {
				local41 = (new URL(this.getCodeBase(), arg0.aString69)).openStream();
			}
			@Pc(85) int local85 = -1;
			@Pc(87) int local87 = 0;
			while (local30.length > local87) {
				@Pc(100) int local100 = local30.length - local87;
				if (local100 > 1000) {
					local100 = 1000;
				}
				@Pc(113) int local113 = local41.read(local30, local87, local100);
				if (local113 < 0) {
					throw new EOFException();
				}
				local87 += local113;
				@Pc(131) int local131 = local87 * 100 / local30.length;
				if (local131 != local85) {
					try {
						@Pc(142) Graphics local142 = this.getGraphics();
						if (local142 == null) {
							this.repaint();
						} else {
							local142.setColor(Color.black);
							local142.fillRect(0, 0, this.anInt6637, this.anInt6635);
							local142.setColor(local19);
							local142.drawRect(this.anInt6637 / 2 - 152, this.anInt6635 / 2 - 18, 303, 33);
							@Pc(196) String local196 = arg0.aStringArray164[this.anInt6636] + " - " + local131 + "%";
							local142.setFont(local8);
							local142.setColor(local26);
							local85 = local131;
							local142.drawString(local196, (this.anInt6637 - local12.stringWidth(local196)) / 2, this.anInt6635 / 2 + 4);
						}
					} catch (@Pc(224) Exception local224) {
					}
				}
			}
			local41.close();
			if (arg0.anInt6630 != arg0.anInt6629) {
				@Pc(238) byte[] local238 = new byte[arg0.anInt6629];
				@Pc(243) Inflater local243 = new Inflater(true);
				local243.setInput(local30);
				local243.inflate(local238);
				local30 = local238;
			}
		} catch (@Pc(254) Exception local254) {
			return null;
		}
		return this.method5728(arg0, false, local30) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean480 = true;
		this.aBoolean479 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BZ)Z")
	private boolean method5730(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method5731("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean481 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method5731(@OriginalArg(1) String arg0) {
		if (this.aBoolean478) {
			return;
		}
		this.aBoolean478 = true;
		try {
			if (aString80 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString80 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(61) Exception local61) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B)[B")
	private byte[] method5732(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(9) int local9 = (int) arg0.length();
			@Pc(20) DataInputStream local20 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(31) byte[] local31 = new byte[local9];
			local20.readFully(local31, 0, local9);
			local20.close();
			return local31;
		} catch (@Pc(41) IOException local41) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean480 = false;
		this.aBoolean479 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!is;Lloader!d;Z)[B")
	private byte[] method5733(@OriginalArg(1) Class258 arg0, @OriginalArg(2) Class256 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg0.method5700(arg1.aString70);
		} catch (@Pc(7) Exception local7) {
			this.method5731("nocache");
			return null;
		}
		@Pc(26) byte[] local26 = this.method5732(local5);
		if (!this.method5728(arg1, arg2, local26)) {
			local26 = this.method5729(arg1, false);
			if (local26 == null) {
				local26 = this.method5729(arg1, true);
			}
			if (local26 == null) {
				this.method5731("download");
				return null;
			}
			if (!this.method5730(local5, local26)) {
				return null;
			}
			local26 = this.method5732(local5);
			if (!this.method5728(arg1, false, local26)) {
				this.method5731("mismatch");
				return null;
			}
		}
		return local26;
	}
}
