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

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Ljava/lang/String;")
	private static String aString86;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString87;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private static int anInt8031 = 0;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt8030;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt8032;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean591 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean590 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean592 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean593 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt8033 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method6367(@OriginalArg(1) String arg0) {
		if (this.aBoolean591) {
			return;
		}
		this.aBoolean591 = true;
		try {
			if (aString87 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString87 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(55) Exception local55) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean590 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZBLloader!c;)[B")
	private byte[] method6368(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class278 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class280.anIntArray632[anInt8031]);
		@Pc(34) Color local34 = new Color(Class280.anIntArray631[anInt8031]);
		@Pc(38) byte[] local38 = new byte[arg1.anInt8023];
		try {
			@Pc(80) InputStream local80;
			if (arg0) {
				@Pc(43) URL local43 = this.getCodeBase();
				@Pc(51) Socket local51 = new Socket(InetAddress.getByName(local43.getHost()), 443);
				local51.setSoTimeout(10000);
				@Pc(57) OutputStream local57 = local51.getOutputStream();
				local57.write(17);
				local57.write(("JAGGRAB " + local43.getFile() + arg1.aString84 + "\n\n").getBytes());
				local80 = local51.getInputStream();
			} else {
				local80 = (new URL(this.getCodeBase(), arg1.aString84)).openStream();
			}
			@Pc(93) int local93 = -1;
			@Pc(95) int local95 = 0;
			while (local38.length > local95) {
				@Pc(109) int local109 = local38.length - local95;
				if (local109 > 1000) {
					local109 = 1000;
				}
				@Pc(123) int local123 = local80.read(local38, local95, local109);
				if (local123 < 0) {
					throw new EOFException();
				}
				local95 += local123;
				@Pc(140) int local140 = local95 * 100 / local38.length;
				if (local93 != local140) {
					try {
						@Pc(147) Graphics local147 = this.getGraphics();
						if (local147 == null) {
							this.repaint();
						} else {
							local147.setColor(Color.black);
							local147.fillRect(0, 0, this.anInt8030, this.anInt8032);
							local147.setColor(local19);
							local147.drawRect(this.anInt8030 / 2 - 152, this.anInt8032 / 2 - 18, 303, 33);
							@Pc(196) String local196 = arg1.aStringArray38[this.anInt8033] + " - " + local140 + "%";
							local147.setFont(local8);
							local147.setColor(local34);
							local93 = local140;
							local147.drawString(local196, (this.anInt8030 - local12.stringWidth(local196)) / 2, this.anInt8032 / 2 + 4);
						}
					} catch (@Pc(227) Exception local227) {
					}
				}
			}
			local80.close();
			if (arg1.anInt8022 != arg1.anInt8023) {
				@Pc(241) byte[] local241 = new byte[arg1.anInt8022];
				@Pc(246) Inflater local246 = new Inflater(true);
				local246.setInput(local38);
				local246.inflate(local241);
				local38 = local241;
			}
		} catch (@Pc(257) Exception local257) {
			return null;
		}
		return this.method6371(false, local38, arg1) ? local38 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method6369(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method6367("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!c;ZLloader!ul;)[B")
	private byte[] method6370(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class278 arg1, @OriginalArg(3) Class283 arg2) {
		@Pc(11) File local11;
		try {
			local11 = arg2.method6388(arg1.aString83);
		} catch (@Pc(13) Exception local13) {
			this.method6367("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method6372(local11);
		if (!this.method6371(arg0, local24, arg1)) {
			local24 = this.method6368(false, arg1);
			if (local24 == null) {
				local24 = this.method6368(true, arg1);
			}
			if (local24 == null) {
				this.method6367("download");
				return null;
			}
			if (!this.method6369(local11, local24)) {
				return null;
			}
			local24 = this.method6372(local11);
			if (!this.method6371(false, local24, arg1)) {
				this.method6367("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString86 = this.getParameter("unsignedurl");
			if (aString86 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(16) SecurityException local16) {
					this.aBoolean591 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString86), "_parent");
					} catch (@Pc(29) Exception local29) {
					}
					return;
				}
			}
			aString87 = this.getParameter("crashurl");
			@Pc(36) int local36 = 0;
			@Pc(40) String local40 = this.getParameter("cachesubdirid");
			if (local40 != null) {
				local36 = Integer.parseInt(local40);
				if (local36 < 0 || Class280.aStringArray39.length <= local36) {
					local36 = 0;
				}
			}
			@Pc(61) String local61 = this.getParameter("colourid");
			if (local61 != null) {
				anInt8031 = Integer.parseInt(local61);
				if (anInt8031 < 0 || anInt8031 >= Class280.anIntArray632.length) {
					anInt8031 = 0;
				}
			}
			this.anInt8030 = this.getSize().width;
			this.anInt8032 = this.getSize().height;
			@Pc(88) int local88 = 32;
			try {
				@Pc(93) int local93 = Integer.parseInt(this.getParameter("modewhat"));
				local88 += local93;
			} catch (@Pc(99) Exception local99) {
			}
			try {
				@Pc(103) String local103 = this.getParameter("lang");
				if (local103 != null) {
					this.anInt8033 = Integer.parseInt(local103);
				}
			} catch (@Pc(111) Exception local111) {
			}
			@Pc(121) Class283 local121;
			try {
				local121 = new Class283(this, local88, Class280.aStringArray39[local36], 30);
			} catch (@Pc(123) Exception local123) {
				this.method6367("nocache");
				return;
			}
			@Pc(130) unpack local130 = null;
			@Pc(140) byte[] local140;
			try {
				Class.forName("java.util.jar.Pack200");
				local140 = this.method6370(false, Class280.aClass278_2, local121);
				if (local140 == null) {
					return;
				}
				local130 = new unpack_Sub1(local140);
			} catch (@Pc(150) Throwable local150) {
			}
			if (local130 == null) {
				local140 = this.method6370(false, Class280.aClass278_1, local121);
				if (local140 == null) {
					return;
				}
				@Pc(170) unpack local170 = new unpack(local140);
				@Pc(175) ClassLoader_Sub1 local175 = new ClassLoader_Sub1(local170);
				@Pc(178) Class local178 = Class.forName("unpack");
				local175.method6359(local178.getName(), local178);
				@Pc(188) Class local188 = local175.loadClass("unpackclass");
				@Pc(195) byte[] local195 = this.method6370(false, Class280.aClass278_3, local121);
				if (local195 == null) {
					return;
				}
				local130 = (unpack) local188.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local195, Boolean.TRUE);
			}
			@Pc(230) ClassLoader_Sub1 local230 = new ClassLoader_Sub1(local130);
			@Pc(232) byte local232 = -1;
			@Pc(236) String local236 = System.getProperty("os.name").toLowerCase();
			@Pc(240) String local240 = System.getProperty("os.arch").toLowerCase();
			if (local236.startsWith("win")) {
				if (local240.startsWith("amd64") || local240.startsWith("x86_64")) {
					local232 = 1;
				} else {
					local232 = 0;
				}
			} else if (local236.startsWith("linux")) {
				if (local240.startsWith("amd64") || local240.startsWith("x86_64")) {
					local232 = 3;
				} else {
					local232 = 2;
				}
			} else if (local236.startsWith("mac")) {
				if (local240.startsWith("ppc")) {
					local232 = 4;
				} else if (local240.startsWith("x86_64")) {
					local232 = 6;
				} else {
					local232 = 7;
				}
			}
			if (local232 != -1) {
				this.method6370(this.getParameter("suppress_sha") != null, Class280.aClass278Array1[local232], local121);
			}
			if (Class280.aClass278Array2 != null) {
				local232 = -1;
				local236 = System.getProperty("os.name").toLowerCase();
				local240 = System.getProperty("os.arch").toLowerCase();
				if (local236.startsWith("win")) {
					if (local240.startsWith("amd64") || local240.startsWith("x86_64")) {
						local232 = 2;
					} else {
						local232 = 0;
					}
				}
				if (local232 != -1) {
					this.method6370(this.getParameter("suppress_sha") != null, Class280.aClass278Array2[local232], local121);
				}
			}
			if (Class280.aClass278Array3 != null) {
				local232 = -1;
				local236 = System.getProperty("os.name").toLowerCase();
				local240 = System.getProperty("os.arch").toLowerCase();
				if (local236.startsWith("win") && !local240.startsWith("amd64") && !local240.startsWith("x86_64")) {
					local232 = 0;
				}
				if (local232 != -1) {
					this.method6370(this.getParameter("suppress_sha") != null, Class280.aClass278Array3[local232], local121);
				}
			}
			@Pc(425) Class local425 = Class.forName("Class282");
			local230.method6359(local425.getName(), local425);
			@Pc(434) Class local434 = Class.forName("Class283");
			local230.method6359(local434.getName(), local434);
			@Pc(443) Class local443 = Class.forName("Class279");
			local230.method6359(local443.getName(), local443);
			@Pc(452) Class local452 = Class.forName("Class281");
			local230.method6359(local452.getName(), local452);
			@Pc(461) Class local461 = Class.forName("Interface15");
			local230.method6359(local461.getName(), local461);
			@Pc(471) Class local471 = local230.loadClass("client");
			synchronized (this) {
				if (this.aBoolean590) {
					return;
				}
				this.anApplet2 = (Applet) local471.getDeclaredConstructor().newInstance();
				local471.getMethod("providesignlink", local434).invoke(null, local121);
				this.anApplet2.init();
				if (this.aBoolean592) {
					this.anApplet2.start();
				}
				if (this.aBoolean593) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(530) Exception local530) {
			RuntimeException_Sub2.anInt8024 = -1198981908;
			if (local530 instanceof InvocationTargetException) {
				@Pc(546) Throwable local546 = ((InvocationTargetException) local530).getTargetException();
				if (local546 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6350(local530.toString(), local546, this);
			} else {
				RuntimeException_Sub2.method6350(null, local530, this);
			}
			this.method6367("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Z[BILloader!c;)Z")
	private boolean method6371(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) Class278 arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg1);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(19) int local19 = 0; local19 < 20; local19++) {
				if (arg2.anIntArray630[local19] != local17[local19]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(37) Exception local37) {
			this.method6367("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean592 = true;
		this.aBoolean593 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean592 = this.aBoolean593 = false;
		this.aBoolean590 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method6372(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(15) int local15 = (int) arg0.length();
			@Pc(26) DataInputStream local26 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			@Pc(29) byte[] local29 = new byte[local15];
			local26.readFully(local29, 0, local15);
			local26.close();
			return local29;
		} catch (@Pc(39) IOException local39) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean592 = false;
		this.aBoolean593 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.paint(arg0);
		}
	}
}
