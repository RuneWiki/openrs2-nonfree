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
	private static String aString88;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString89;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "I")
	private static int anInt7559 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "I")
	private int anInt7557;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt7560;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt7558 = 0;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean510 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean512 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean511 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean513 = false;

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean511 = true;
		this.aBoolean512 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!d;ZI)[B")
	private byte[] method6135(@OriginalArg(0) Class273 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(22) FontMetrics local22 = this.getFontMetrics(local8);
		@Pc(29) Color local29 = new Color(Class275.anIntArray523[anInt7559]);
		@Pc(36) Color local36 = new Color(Class275.anIntArray524[anInt7559]);
		@Pc(40) byte[] local40 = new byte[arg0.anInt7551];
		try {
			@Pc(51) InputStream local51;
			if (arg1) {
				@Pc(56) URL local56 = this.getCodeBase();
				@Pc(64) Socket local64 = new Socket(InetAddress.getByName(local56.getHost()), 443);
				local64.setSoTimeout(10000);
				@Pc(70) OutputStream local70 = local64.getOutputStream();
				local70.write(17);
				local70.write(("JAGGRAB " + local56.getFile() + arg0.aString77 + "\n\n").getBytes());
				local51 = local64.getInputStream();
			} else {
				local51 = (new URL(this.getCodeBase(), arg0.aString77)).openStream();
			}
			@Pc(95) int local95 = -1;
			@Pc(97) int local97 = 0;
			while (local97 < local40.length) {
				@Pc(110) int local110 = local40.length - local97;
				if (local110 > 1000) {
					local110 = 1000;
				}
				@Pc(123) int local123 = local51.read(local40, local97, local110);
				if (local123 < 0) {
					throw new EOFException();
				}
				local97 += local123;
				@Pc(141) int local141 = local97 * 100 / local40.length;
				if (local95 != local141) {
					try {
						@Pc(148) Graphics local148 = this.getGraphics();
						if (local148 == null) {
							this.repaint();
						} else {
							local148.setColor(Color.black);
							local148.fillRect(0, 0, this.anInt7557, this.anInt7560);
							local148.setColor(local29);
							local148.drawRect(this.anInt7557 / 2 - 152, this.anInt7560 / 2 + -18, 303, 33);
							@Pc(197) String local197 = arg0.aStringArray49[this.anInt7558] + " - " + local141 + "%";
							local148.setFont(local8);
							local148.setColor(local36);
							local95 = local141;
							local148.drawString(local197, (this.anInt7557 - local22.stringWidth(local197)) / 2, this.anInt7560 / 2 + 4);
						}
					} catch (@Pc(229) Exception local229) {
					}
				}
			}
			local51.close();
			if (arg0.anInt7551 != arg0.anInt7552) {
				@Pc(247) byte[] local247 = new byte[arg0.anInt7552];
				@Pc(252) Inflater local252 = new Inflater(true);
				local252.setInput(local40);
				local252.inflate(local247);
				local40 = local247;
			}
		} catch (@Pc(263) Exception local263) {
			return null;
		}
		return this.method6137(local40, false, arg0) ? local40 : null;
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
		this.aBoolean510 = true;
		this.aBoolean511 = this.aBoolean512 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;Z)[B")
	private byte[] method6136(@OriginalArg(0) File arg0) {
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
		} catch (@Pc(37) IOException local37) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BZLloader!d;B)Z")
	private boolean method6137(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class273 arg2) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg0);
			@Pc(21) byte[] local21 = local8.digest();
			for (@Pc(23) int local23 = 0; local23 < 20; local23++) {
				if (arg2.anIntArray522[local23] != local21[local23]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(48) Exception local48) {
			this.method6140("sha");
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;[B)Z")
	private boolean method6138(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg0);
			local9.write(arg1, 0, arg1.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method6140("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString89 = this.getParameter("unsignedurl");
			if (aString89 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean513 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString89), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString88 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || Class275.aStringArray50.length <= local38) {
					local38 = 0;
				}
			}
			@Pc(63) String local63 = this.getParameter("colourid");
			if (local63 != null) {
				anInt7559 = Integer.parseInt(local63);
				if (anInt7559 < 0 || anInt7559 >= Class275.anIntArray523.length) {
					anInt7559 = 0;
				}
			}
			this.anInt7557 = this.getSize().width;
			this.anInt7560 = this.getSize().height;
			@Pc(97) int local97 = 32;
			try {
				@Pc(102) int local102 = Integer.parseInt(this.getParameter("modewhat"));
				local97 += local102;
			} catch (@Pc(108) Exception local108) {
			}
			try {
				@Pc(112) String local112 = this.getParameter("lang");
				if (local112 != null) {
					this.anInt7558 = Integer.parseInt(local112);
				}
			} catch (@Pc(121) Exception local121) {
			}
			@Pc(131) Class276 local131;
			try {
				local131 = new Class276(this, local97, Class275.aStringArray50[local38], 30);
			} catch (@Pc(133) Exception local133) {
				this.method6140("nocache");
				return;
			}
			@Pc(140) unpack local140 = null;
			@Pc(150) byte[] local150;
			try {
				Class.forName("java.util.jar.Pack200");
				local150 = this.method6139(local131, Class275.aClass273_2, false);
				if (local150 == null) {
					return;
				}
				local140 = new unpack_Sub1(local150);
			} catch (@Pc(161) Throwable local161) {
			}
			if (local140 == null) {
				local150 = this.method6139(local131, Class275.aClass273_1, false);
				if (local150 == null) {
					return;
				}
				@Pc(180) unpack local180 = new unpack(local150);
				@Pc(185) ClassLoader_Sub1 local185 = new ClassLoader_Sub1(local180);
				@Pc(188) Class local188 = Class.forName("unpack");
				local185.method6077(local188.getName(), local188);
				@Pc(198) Class local198 = local185.loadClass("unpackclass");
				@Pc(205) byte[] local205 = this.method6139(local131, Class275.aClass273_3, false);
				if (local205 == null) {
					return;
				}
				local140 = (unpack) local198.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local205, Boolean.TRUE);
			}
			@Pc(240) ClassLoader_Sub1 local240 = new ClassLoader_Sub1(local140);
			@Pc(242) byte local242 = -1;
			@Pc(246) String local246 = System.getProperty("os.name").toLowerCase();
			@Pc(250) String local250 = System.getProperty("os.arch").toLowerCase();
			if (local246.startsWith("win")) {
				if (local250.startsWith("amd64") || local250.startsWith("x86_64")) {
					local242 = 1;
				} else {
					local242 = 0;
				}
			} else if (local246.startsWith("linux")) {
				if (local250.startsWith("amd64") || local250.startsWith("x86_64")) {
					local242 = 3;
				} else {
					local242 = 2;
				}
			} else if (local246.startsWith("mac")) {
				if (local250.startsWith("ppc")) {
					local242 = 4;
				} else if (local250.startsWith("x86_64")) {
					local242 = 6;
				} else {
					local242 = 7;
				}
			}
			if (local242 != -1) {
				this.method6139(local131, Class275.aClass273Array1[local242], this.getParameter("suppress_sha") != null);
			}
			if (Class275.aClass273Array2 != null) {
				local242 = -1;
				local246 = System.getProperty("os.name").toLowerCase();
				local250 = System.getProperty("os.arch").toLowerCase();
				if (local246.startsWith("win")) {
					if (local250.startsWith("amd64") || local250.startsWith("x86_64")) {
						local242 = 2;
					} else {
						local242 = 0;
					}
				}
				if (local242 != -1) {
					this.method6139(local131, Class275.aClass273Array2[local242], this.getParameter("suppress_sha") != null);
				}
			}
			if (Class275.aClass273Array3 != null) {
				local242 = -1;
				local246 = System.getProperty("os.name").toLowerCase();
				local250 = System.getProperty("os.arch").toLowerCase();
				if (local246.startsWith("win") && !local250.startsWith("amd64") && !local250.startsWith("x86_64")) {
					local242 = 0;
				}
				if (local242 != -1) {
					this.method6139(local131, Class275.aClass273Array3[local242], this.getParameter("suppress_sha") != null);
				}
			}
			@Pc(433) Class local433 = Class.forName("Class278");
			local240.method6077(local433.getName(), local433);
			@Pc(442) Class local442 = Class.forName("Class276");
			local240.method6077(local442.getName(), local442);
			@Pc(451) Class local451 = Class.forName("Class280");
			local240.method6077(local451.getName(), local451);
			@Pc(460) Class local460 = Class.forName("Class279");
			local240.method6077(local460.getName(), local460);
			@Pc(469) Class local469 = Class.forName("Interface15");
			local240.method6077(local469.getName(), local469);
			@Pc(479) Class local479 = local240.loadClass("client");
			synchronized (this) {
				if (this.aBoolean510) {
					return;
				}
				this.anApplet3 = (Applet) local479.getDeclaredConstructor().newInstance();
				local479.getMethod("providesignlink", local442).invoke(null, local131);
				this.anApplet3.init();
				if (this.aBoolean511) {
					this.anApplet3.start();
				}
				if (this.aBoolean512) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(538) Exception local538) {
			RuntimeException_Sub2.anInt7553 = 1136875827;
			if (local538 instanceof InvocationTargetException) {
				@Pc(554) Throwable local554 = ((InvocationTargetException) local538).getTargetException();
				if (local554 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6081(this, local538.toString(), local554);
			} else {
				RuntimeException_Sub2.method6081(this, null, local538);
			}
			this.method6140("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean511 = false;
		this.aBoolean512 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!gt;Lloader!d;BZ)[B")
	private byte[] method6139(@OriginalArg(0) Class276 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg0.method6099(arg1.aString78);
		} catch (@Pc(7) Exception local7) {
			this.method6140("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method6136(local5);
		if (!this.method6137(local24, arg2, arg1)) {
			local24 = this.method6135(arg1, false);
			if (local24 == null) {
				local24 = this.method6135(arg1, true);
			}
			if (local24 == null) {
				this.method6140("download");
				return null;
			}
			if (!this.method6138(local5, local24)) {
				return null;
			}
			local24 = this.method6136(local5);
			if (!this.method6137(local24, false, arg1)) {
				this.method6140("mismatch");
				return null;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method6140(@OriginalArg(0) String arg0) {
		if (this.aBoolean513) {
			return;
		}
		this.aBoolean513 = true;
		try {
			if (aString88 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString88 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(58) Exception local58) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean510 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}
}
