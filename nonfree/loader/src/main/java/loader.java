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

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/lang/String;")
	private static String aString76;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString77;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private static int anInt7158 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt7155;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt7157;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean514 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt7156 = 0;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean515 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean513 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean516 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!d;BLloader!kd;Z)[B")
	private byte[] method6194(@OriginalArg(0) Class253 arg0, @OriginalArg(2) Class258 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(12) File local12;
		try {
			local12 = arg1.method6192(arg0.aString67);
		} catch (@Pc(14) Exception local14) {
			this.method6197("nocache");
			return null;
		}
		@Pc(25) byte[] local25 = this.method6199(local12);
		if (!this.method6198(arg2, local25, arg0)) {
			local25 = this.method6195(arg0, false);
			if (local25 == null) {
				local25 = this.method6195(arg0, true);
			}
			if (local25 == null) {
				this.method6197("download");
				return null;
			}
			if (!this.method6196(local12, local25)) {
				return null;
			}
			local25 = this.method6199(local12);
			if (!this.method6198(false, local25, arg0)) {
				this.method6197("mismatch");
				return null;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!d;Z)[B")
	private byte[] method6195(@OriginalArg(1) Class253 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class252.anIntArray590[anInt7158]);
		@Pc(26) Color local26 = new Color(Class252.anIntArray589[anInt7158]);
		@Pc(30) byte[] local30 = new byte[arg0.anInt7148];
		try {
			@Pc(47) InputStream local47;
			if (arg1) {
				@Pc(52) URL local52 = this.getCodeBase();
				@Pc(60) Socket local60 = new Socket(InetAddress.getByName(local52.getHost()), 443);
				local60.setSoTimeout(10000);
				@Pc(66) OutputStream local66 = local60.getOutputStream();
				local66.write(17);
				local66.write(("JAGGRAB " + local52.getFile() + arg0.aString66 + "\n\n").getBytes());
				local47 = local60.getInputStream();
			} else {
				local47 = (new URL(this.getCodeBase(), arg0.aString66)).openStream();
			}
			@Pc(91) int local91 = -1;
			@Pc(93) int local93 = 0;
			while (local93 < local30.length) {
				@Pc(102) int local102 = local30.length - local93;
				if (local102 > 1000) {
					local102 = 1000;
				}
				@Pc(114) int local114 = local47.read(local30, local93, local102);
				if (local114 < 0) {
					throw new EOFException();
				}
				local93 += local114;
				@Pc(131) int local131 = local93 * 100 / local30.length;
				if (local91 != local131) {
					try {
						@Pc(138) Graphics local138 = this.getGraphics();
						if (local138 == null) {
							this.repaint();
						} else {
							local138.setColor(Color.black);
							local138.fillRect(0, 0, this.anInt7155, this.anInt7157);
							local138.setColor(local19);
							local138.drawRect(this.anInt7155 / 2 - 152, this.anInt7157 / 2 - 18, 303, 33);
							@Pc(188) String local188 = arg0.aStringArray47[this.anInt7156] + " - " + local131 + "%";
							local138.setFont(local8);
							local138.setColor(local26);
							local91 = local131;
							local138.drawString(local188, (this.anInt7155 - local12.stringWidth(local188)) / 2, this.anInt7157 / 2 + 4);
						}
					} catch (@Pc(219) Exception local219) {
					}
				}
			}
			local47.close();
			if (arg0.anInt7147 != arg0.anInt7148) {
				@Pc(233) byte[] local233 = new byte[arg0.anInt7147];
				@Pc(238) Inflater local238 = new Inflater(true);
				local238.setInput(local30);
				local30 = local233;
				local238.inflate(local233);
			}
		} catch (@Pc(249) Exception local249) {
			return null;
		}
		return this.method6198(false, local30, arg0) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/io/File;[B)Z")
	private boolean method6196(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method6197("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean514 = false;
		this.aBoolean513 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean514 = true;
		this.aBoolean513 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method6197(@OriginalArg(1) String arg0) {
		if (this.aBoolean515) {
			return;
		}
		this.aBoolean515 = true;
		try {
			if (aString76 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString76 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(62) Exception local62) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString77 = this.getParameter("unsignedurl");
			if (aString77 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean515 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString77), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString76 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || local37 >= Class252.aStringArray46.length) {
					local37 = 0;
				}
			}
			@Pc(63) String local63 = this.getParameter("colourid");
			if (local63 != null) {
				anInt7158 = Integer.parseInt(local63);
				if (anInt7158 < 0 || Class252.anIntArray590.length <= anInt7158) {
					anInt7158 = 0;
				}
			}
			this.anInt7155 = this.getSize().width;
			this.anInt7157 = this.getSize().height;
			@Pc(95) int local95 = 32;
			try {
				@Pc(100) int local100 = Integer.parseInt(this.getParameter("modewhat"));
				local95 += local100;
			} catch (@Pc(106) Exception local106) {
			}
			try {
				@Pc(110) String local110 = this.getParameter("lang");
				if (local110 != null) {
					this.anInt7156 = Integer.parseInt(local110);
				}
			} catch (@Pc(119) Exception local119) {
			}
			@Pc(129) Class258 local129;
			try {
				local129 = new Class258(this, local95, Class252.aStringArray46[local37], 29);
			} catch (@Pc(131) Exception local131) {
				this.method6197("nocache");
				return;
			}
			@Pc(138) unpack local138 = null;
			@Pc(148) byte[] local148;
			try {
				Class.forName("java.util.jar.Pack200");
				local148 = this.method6194(Class252.aClass253_2, local129, false);
				if (local148 == null) {
					return;
				}
				local138 = new unpack_Sub1(local148);
			} catch (@Pc(158) Throwable local158) {
			}
			if (local138 == null) {
				local148 = this.method6194(Class252.aClass253_1, local129, false);
				if (local148 == null) {
					return;
				}
				@Pc(177) unpack local177 = new unpack(local148);
				@Pc(182) ClassLoader_Sub1 local182 = new ClassLoader_Sub1(local177);
				@Pc(185) Class local185 = Class.forName("unpack");
				local182.method6158(local185.getName(), local185);
				@Pc(195) Class local195 = local182.loadClass("unpackclass");
				@Pc(202) byte[] local202 = this.method6194(Class252.aClass253_3, local129, false);
				if (local202 == null) {
					return;
				}
				local138 = (unpack) local195.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local202, Boolean.TRUE);
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
				} else if (local246.startsWith("x86_64")) {
					local238 = 5;
				} else {
					local238 = 3;
				}
			}
			if (local238 != -1) {
				for (@Pc(304) int local304 = 0; local304 < Class252.aClass253ArrayArray1[local238].length; local304++) {
					this.method6194(Class252.aClass253ArrayArray1[local238][local304], local129, this.getParameter("suppress_sha") != null);
				}
			}
			if (Class252.aClass253Array1 != null) {
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
					this.method6194(Class252.aClass253Array1[local238], local129, this.getParameter("suppress_sha") != null);
				}
			}
			@Pc(392) Class local392 = Class.forName("Class259");
			local236.method6158(local392.getName(), local392);
			@Pc(401) Class local401 = Class.forName("Class258");
			local236.method6158(local401.getName(), local401);
			@Pc(410) Class local410 = Class.forName("Class256");
			local236.method6158(local410.getName(), local410);
			@Pc(419) Class local419 = Class.forName("Class255");
			local236.method6158(local419.getName(), local419);
			@Pc(428) Class local428 = Class.forName("Interface13");
			local236.method6158(local428.getName(), local428);
			@Pc(438) Class local438 = local236.loadClass("client");
			synchronized (this) {
				if (this.aBoolean516) {
					return;
				}
				this.anApplet3 = (Applet) local438.getDeclaredConstructor().newInstance();
				local438.getMethod("providesignlink", local401).invoke(null, local129);
				this.anApplet3.init();
				if (this.aBoolean514) {
					this.anApplet3.start();
				}
				if (this.aBoolean513) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(497) Exception local497) {
			RuntimeException_Sub2.anInt7145 = 1847138438;
			if (local497 instanceof InvocationTargetException) {
				@Pc(513) Throwable local513 = ((InvocationTargetException) local497).getTargetException();
				if (local513 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6147(local513, local497.toString(), this);
			} else {
				RuntimeException_Sub2.method6147(local497, null, this);
			}
			this.method6197("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z[BLloader!d;I)Z")
	private boolean method6198(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class253 arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(10) MessageDigest local10 = MessageDigest.getInstance("SHA");
			local10.reset();
			local10.update(arg1);
			@Pc(24) byte[] local24 = local10.digest();
			for (@Pc(26) int local26 = 0; local26 < 20; local26++) {
				if (local24[local26] != arg2.anIntArray591[local26]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(46) Exception local46) {
			this.method6197("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method6199(@OriginalArg(1) File arg0) {
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
		this.aBoolean514 = this.aBoolean513 = false;
		this.aBoolean516 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean516 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}
}
