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

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Ljava/lang/String;")
	private static String aString273;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString274;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private static int anInt6905 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt6906;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt6907;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean599 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean600 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean601 = false;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt6904 = 0;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean602 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLloader!g;Z)Z")
	private boolean method5770(@OriginalArg(1) byte[] arg0, @OriginalArg(2) Class224 arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg0);
			@Pc(23) byte[] local23 = local8.digest();
			for (@Pc(25) int local25 = 0; local25 < 20; local25++) {
				if (local23[local25] != arg1.anIntArray545[local25]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(43) Exception local43) {
			this.method5772("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	private boolean method5771(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method5772("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method5772(@OriginalArg(0) String arg0) {
		if (this.aBoolean600) {
			return;
		}
		this.aBoolean600 = true;
		try {
			if (aString274 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString274 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean601 = false;
		this.aBoolean599 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean602 = true;
		this.aBoolean601 = this.aBoolean599 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!g;IZ)[B")
	private byte[] method5773(@OriginalArg(0) Class224 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class221.anIntArray543[anInt6905]);
		@Pc(26) Color local26 = new Color(Class221.anIntArray544[anInt6905]);
		@Pc(30) byte[] local30 = new byte[arg0.anInt6901];
		try {
			@Pc(80) InputStream local80;
			if (arg1) {
				@Pc(43) URL local43 = this.getCodeBase();
				@Pc(51) Socket local51 = new Socket(InetAddress.getByName(local43.getHost()), 443);
				local51.setSoTimeout(10000);
				@Pc(57) OutputStream local57 = local51.getOutputStream();
				local57.write(17);
				local57.write(("JAGGRAB " + local43.getFile() + arg0.aString263 + "\n\n").getBytes());
				local80 = local51.getInputStream();
			} else {
				local80 = (new URL(this.getCodeBase(), arg0.aString263)).openStream();
			}
			@Pc(93) int local93 = -1;
			@Pc(95) int local95 = 0;
			while (local30.length > local95) {
				@Pc(109) int local109 = local30.length - local95;
				if (local109 > 1000) {
					local109 = 1000;
				}
				@Pc(123) int local123 = local80.read(local30, local95, local109);
				if (local123 < 0) {
					throw new EOFException();
				}
				local95 += local123;
				@Pc(144) int local144 = local95 * 100 / local30.length;
				if (local144 != local93) {
					try {
						@Pc(155) Graphics local155 = this.getGraphics();
						if (local155 == null) {
							this.repaint();
						} else {
							local155.setColor(Color.black);
							local155.fillRect(0, 0, this.anInt6906, this.anInt6907);
							local155.setColor(local19);
							local155.drawRect(this.anInt6906 / 2 - 152, this.anInt6907 / 2 - 18, 303, 33);
							@Pc(204) String local204 = arg0.aStringArray48[this.anInt6904] + " - " + local144 + "%";
							local155.setFont(local8);
							local155.setColor(local26);
							local93 = local144;
							local155.drawString(local204, (this.anInt6906 - local12.stringWidth(local204)) / 2, this.anInt6907 / 2 + 4);
						}
					} catch (@Pc(235) Exception local235) {
					}
				}
			}
			local80.close();
			if (arg0.anInt6901 != arg0.anInt6900) {
				@Pc(248) byte[] local248 = new byte[arg0.anInt6900];
				@Pc(253) Inflater local253 = new Inflater(true);
				local253.setInput(local30);
				local253.inflate(local248);
				local30 = local248;
			}
		} catch (@Pc(264) Exception local264) {
			return null;
		}
		return this.method5770(local30, arg0, false) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean602 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method5774(@OriginalArg(1) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString273 = this.getParameter("unsignedurl");
			if (aString273 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean600 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString273), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString274 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || Class221.aStringArray47.length <= local37) {
					local37 = 0;
				}
			}
			@Pc(63) String local63 = this.getParameter("colourid");
			if (local63 != null) {
				anInt6905 = Integer.parseInt(local63);
				if (anInt6905 < 0 || anInt6905 >= Class221.anIntArray543.length) {
					anInt6905 = 0;
				}
			}
			this.anInt6906 = this.getSize().width;
			this.anInt6907 = this.getSize().height;
			@Pc(95) int local95 = 32;
			try {
				@Pc(100) int local100 = Integer.parseInt(this.getParameter("modewhat"));
				local95 += local100;
			} catch (@Pc(106) Exception local106) {
			}
			try {
				@Pc(110) String local110 = this.getParameter("lang");
				if (local110 != null) {
					this.anInt6904 = Integer.parseInt(local110);
				}
			} catch (@Pc(119) Exception local119) {
			}
			@Pc(129) Class226 local129;
			try {
				local129 = new Class226(this, local95, Class221.aStringArray47[local37], 29);
			} catch (@Pc(131) Exception local131) {
				this.method5772("nocache");
				return;
			}
			@Pc(138) unpack local138 = null;
			@Pc(148) byte[] local148;
			try {
				Class.forName("java.util.jar.Pack200");
				local148 = this.method5775(false, local129, Class221.aClass224_2);
				if (local148 == null) {
					return;
				}
				local138 = new unpack_Sub1(local148);
			} catch (@Pc(158) Throwable local158) {
			}
			if (local138 == null) {
				local148 = this.method5775(false, local129, Class221.aClass224_1);
				if (local148 == null) {
					return;
				}
				@Pc(176) unpack local176 = new unpack(local148);
				@Pc(181) ClassLoader_Sub1 local181 = new ClassLoader_Sub1(local176);
				@Pc(184) Class local184 = Class.forName("unpack");
				local181.method5722(local184.getName(), local184);
				@Pc(194) Class local194 = local181.loadClass("unpackclass");
				@Pc(201) byte[] local201 = this.method5775(false, local129, Class221.aClass224_3);
				if (local201 == null) {
					return;
				}
				local138 = (unpack) local194.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local201, Boolean.TRUE);
			}
			@Pc(236) ClassLoader_Sub1 local236 = new ClassLoader_Sub1(local138);
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
				for (@Pc(296) int local296 = 0; local296 < Class221.aClass224ArrayArray1[local238].length; local296++) {
					this.method5775(this.getParameter("suppress_sha") != null, local129, Class221.aClass224ArrayArray1[local238][local296]);
				}
			}
			if (Class221.aClass224Array1 != null) {
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
					this.method5775(this.getParameter("suppress_sha") != null, local129, Class221.aClass224Array1[local238]);
				}
			}
			@Pc(376) Class local376 = Class.forName("Class228");
			local236.method5722(local376.getName(), local376);
			@Pc(385) Class local385 = Class.forName("Class226");
			local236.method5722(local385.getName(), local385);
			@Pc(394) Class local394 = Class.forName("Class222");
			local236.method5722(local394.getName(), local394);
			@Pc(403) Class local403 = Class.forName("Class227");
			local236.method5722(local403.getName(), local403);
			@Pc(412) Class local412 = Class.forName("Interface11");
			local236.method5722(local412.getName(), local412);
			@Pc(422) Class local422 = local236.loadClass("client");
			synchronized (this) {
				if (this.aBoolean602) {
					return;
				}
				this.anApplet3 = (Applet) local422.getDeclaredConstructor().newInstance();
				local422.getMethod("providesignlink", local385).invoke(null, local129);
				this.anApplet3.init();
				if (this.aBoolean601) {
					this.anApplet3.start();
				}
				if (this.aBoolean599) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(483) Exception local483) {
			RuntimeException_Sub2.anInt6894 = -972512699;
			if (local483 instanceof InvocationTargetException) {
				@Pc(492) Throwable local492 = ((InvocationTargetException) local483).getTargetException();
				if (local492 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5727(local492, local483.toString(), this);
			} else {
				RuntimeException_Sub2.method5727(local483, null, this);
			}
			this.method5772("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean601 = true;
		this.aBoolean599 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(IZLloader!lh;Lloader!g;)[B")
	private byte[] method5775(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class226 arg1, @OriginalArg(3) Class224 arg2) {
		@Pc(11) File local11;
		try {
			local11 = arg1.method5751(arg2.aString264);
		} catch (@Pc(13) Exception local13) {
			this.method5772("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method5774(local11);
		if (!this.method5770(local24, arg2, arg0)) {
			local24 = this.method5773(arg2, false);
			if (local24 == null) {
				local24 = this.method5773(arg2, true);
			}
			if (local24 == null) {
				this.method5772("download");
				return null;
			}
			if (!this.method5771(local24, local11)) {
				return null;
			}
			local24 = this.method5774(local11);
			if (!this.method5770(local24, arg2, false)) {
				this.method5772("mismatch");
				return null;
			}
		}
		return local24;
	}
}
