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

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString274;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private static int anInt6877 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt6875;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt6876;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean458 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean459 = false;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean457 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean460 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt6878 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method5807(@OriginalArg(0) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(14) int local14 = (int) arg0.length();
			@Pc(25) DataInputStream local25 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(28) byte[] local28 = new byte[local14];
			local25.readFully(local28, 0, local14);
			local25.close();
			return local28;
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean459 = true;
		this.aBoolean458 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean459 = false;
		this.aBoolean458 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!g;IZ)[B")
	private byte[] method5808(@OriginalArg(0) Class226 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class221.anIntArray570[anInt6877]);
		@Pc(26) Color local26 = new Color(Class221.anIntArray571[anInt6877]);
		@Pc(30) byte[] local30 = new byte[arg0.anInt6873];
		try {
			@Pc(41) InputStream local41;
			if (arg1) {
				@Pc(46) URL local46 = this.getCodeBase();
				@Pc(54) Socket local54 = new Socket(InetAddress.getByName(local46.getHost()), 443);
				local54.setSoTimeout(10000);
				@Pc(60) OutputStream local60 = local54.getOutputStream();
				local60.write(17);
				local60.write(("JAGGRAB " + local46.getFile() + arg0.aString272 + "\n\n").getBytes());
				local41 = local54.getInputStream();
			} else {
				local41 = (new URL(this.getCodeBase(), arg0.aString272)).openStream();
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
				if (local135 != local85) {
					try {
						@Pc(142) Graphics local142 = this.getGraphics();
						if (local142 == null) {
							this.repaint();
						} else {
							local142.setColor(Color.black);
							local142.fillRect(0, 0, this.anInt6876, this.anInt6875);
							local142.setColor(local19);
							local142.drawRect(this.anInt6876 / 2 - 152, this.anInt6875 / 2 - 18, 303, 33);
							@Pc(192) String local192 = arg0.aStringArray45[this.anInt6878] + " - " + local135 + "%";
							local142.setFont(local8);
							local142.setColor(local26);
							local85 = local135;
							local142.drawString(local192, (this.anInt6876 - local12.stringWidth(local192)) / 2, this.anInt6875 / 2 + 4);
						}
					} catch (@Pc(224) Exception local224) {
					}
				}
			}
			local41.close();
			if (arg0.anInt6873 != arg0.anInt6874) {
				@Pc(241) byte[] local241 = new byte[arg0.anInt6874];
				@Pc(246) Inflater local246 = new Inflater(true);
				local246.setInput(local30);
				local246.inflate(local241);
				local30 = local241;
			}
		} catch (@Pc(257) Exception local257) {
			return null;
		}
		return this.method5812(false, local30, arg0) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method5809(@OriginalArg(0) String arg0) {
		if (this.aBoolean460) {
			return;
		}
		this.aBoolean460 = true;
		try {
			if (aString273 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString273 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;[B)Z")
	private boolean method5810(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(24) IOException local24) {
			this.method5809("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString274 = this.getParameter("unsignedurl");
			if (aString274 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean460 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString274), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			aString273 = this.getParameter("crashurl");
			@Pc(39) int local39 = 0;
			@Pc(43) String local43 = this.getParameter("cachesubdirid");
			if (local43 != null) {
				local39 = Integer.parseInt(local43);
				if (local39 < 0 || Class221.aStringArray44.length <= local39) {
					local39 = 0;
				}
			}
			@Pc(65) String local65 = this.getParameter("colourid");
			if (local65 != null) {
				anInt6877 = Integer.parseInt(local65);
				if (anInt6877 < 0 || Class221.anIntArray570.length <= anInt6877) {
					anInt6877 = 0;
				}
			}
			this.anInt6876 = this.getSize().width;
			this.anInt6875 = this.getSize().height;
			@Pc(94) int local94 = 32;
			try {
				@Pc(99) int local99 = Integer.parseInt(this.getParameter("modewhat"));
				local94 += local99;
			} catch (@Pc(105) Exception local105) {
			}
			try {
				@Pc(109) String local109 = this.getParameter("lang");
				if (local109 != null) {
					this.anInt6878 = Integer.parseInt(local109);
				}
			} catch (@Pc(117) Exception local117) {
			}
			@Pc(127) Class224 local127;
			try {
				local127 = new Class224(this, local94, Class221.aStringArray44[local39], 29);
			} catch (@Pc(129) Exception local129) {
				this.method5809("nocache");
				return;
			}
			@Pc(136) unpack local136 = null;
			@Pc(146) byte[] local146;
			try {
				Class.forName("java.util.jar.Pack200");
				local146 = this.method5811(false, local127, Class221.aClass226_2);
				if (local146 == null) {
					return;
				}
				local136 = new unpack_Sub1(local146);
			} catch (@Pc(157) Throwable local157) {
			}
			if (local136 == null) {
				local146 = this.method5811(false, local127, Class221.aClass226_1);
				if (local146 == null) {
					return;
				}
				@Pc(177) unpack local177 = new unpack(local146);
				@Pc(182) ClassLoader_Sub1 local182 = new ClassLoader_Sub1(local177);
				@Pc(185) Class local185 = Class.forName("unpack");
				local182.method5796(local185, local185.getName());
				@Pc(195) Class local195 = local182.loadClass("unpackclass");
				@Pc(202) byte[] local202 = this.method5811(false, local127, Class221.aClass226_3);
				if (local202 == null) {
					return;
				}
				local136 = (unpack) local195.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local202, Boolean.TRUE);
			}
			@Pc(237) ClassLoader_Sub1 local237 = new ClassLoader_Sub1(local136);
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
				for (@Pc(296) int local296 = 0; local296 < Class221.aClass226ArrayArray1[local239].length; local296++) {
					this.method5811(this.getParameter("suppress_sha") != null, local127, Class221.aClass226ArrayArray1[local239][local296]);
				}
			}
			if (Class221.aClass226Array1 != null) {
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
					this.method5811(this.getParameter("suppress_sha") != null, local127, Class221.aClass226Array1[local239]);
				}
			}
			@Pc(376) Class local376 = Class.forName("Class223");
			local237.method5796(local376, local376.getName());
			@Pc(385) Class local385 = Class.forName("Class224");
			local237.method5796(local385, local385.getName());
			@Pc(394) Class local394 = Class.forName("Class228");
			local237.method5796(local394, local394.getName());
			@Pc(403) Class local403 = Class.forName("Class222");
			local237.method5796(local403, local403.getName());
			@Pc(412) Class local412 = Class.forName("Interface11");
			local237.method5796(local412, local412.getName());
			@Pc(422) Class local422 = local237.loadClass("client");
			synchronized (this) {
				if (this.aBoolean457) {
					return;
				}
				this.anApplet3 = (Applet) local422.getDeclaredConstructor().newInstance();
				local422.getMethod("providesignlink", local385).invoke(null, local127);
				this.anApplet3.init();
				if (this.aBoolean459) {
					this.anApplet3.start();
				}
				if (this.aBoolean458) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(481) Exception local481) {
			RuntimeException_Sub2.anInt6869 = -1832102248;
			if (local481 instanceof InvocationTargetException) {
				@Pc(490) Throwable local490 = ((InvocationTargetException) local481).getTargetException();
				if (local490 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5748(local481.toString(), this, local490);
			} else {
				RuntimeException_Sub2.method5748(null, this, local481);
			}
			this.method5809("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!de;Lloader!g;I)[B")
	private byte[] method5811(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class224 arg1, @OriginalArg(2) Class226 arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg1.method5786(arg2.aString271);
		} catch (@Pc(7) Exception local7) {
			this.method5809("nocache");
			return null;
		}
		@Pc(18) byte[] local18 = this.method5807(local5);
		if (!this.method5812(arg0, local18, arg2)) {
			local18 = this.method5808(arg2, false);
			if (local18 == null) {
				local18 = this.method5808(arg2, true);
			}
			if (local18 == null) {
				this.method5809("download");
				return null;
			}
			if (!this.method5810(local5, local18)) {
				return null;
			}
			local18 = this.method5807(local5);
			if (!this.method5812(false, local18, arg2)) {
				this.method5809("mismatch");
				return null;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z[BLloader!g;I)Z")
	private boolean method5812(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class226 arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(17) MessageDigest local17 = MessageDigest.getInstance("SHA");
			local17.reset();
			local17.update(arg1);
			@Pc(25) byte[] local25 = local17.digest();
			for (@Pc(27) int local27 = 0; local27 < 20; local27++) {
				if (arg2.anIntArray572[local27] != local25[local27]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(47) Exception local47) {
			this.method5809("sha");
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
		this.aBoolean459 = this.aBoolean458 = false;
		this.aBoolean457 = true;
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

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean457 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}
}
