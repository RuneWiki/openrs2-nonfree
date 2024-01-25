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
	private static String aString70;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString71;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private static int anInt6829 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt6827;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt6830;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean494 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean492 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt6828 = 0;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean493 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean495 = false;

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean493 = true;
		this.aBoolean492 = false;
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!ml;Lloader!c;B)[B")
	private byte[] method5729(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class223 arg1, @OriginalArg(2) Class219 arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg1.method5742(arg2.aString68);
		} catch (@Pc(7) Exception local7) {
			this.method5731("nocache");
			return null;
		}
		@Pc(23) byte[] local23 = this.method5732(local5);
		if (!this.method5733(arg2, local23, arg0)) {
			local23 = this.method5730(arg2, false);
			if (local23 == null) {
				local23 = this.method5730(arg2, true);
			}
			if (local23 == null) {
				this.method5731("download");
				return null;
			}
			if (!this.method5734(local23, local5)) {
				return null;
			}
			local23 = this.method5732(local5);
			if (!this.method5733(arg2, local23, false)) {
				this.method5731("mismatch");
				return null;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean494 = true;
		this.aBoolean492 = this.aBoolean493 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLloader!c;Z)[B")
	private byte[] method5730(@OriginalArg(1) Class219 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(24) Color local24 = new Color(Class218.anIntArray516[anInt6829]);
		@Pc(31) Color local31 = new Color(Class218.anIntArray515[anInt6829]);
		@Pc(35) byte[] local35 = new byte[arg0.anInt6824];
		try {
			@Pc(77) InputStream local77;
			if (arg1) {
				@Pc(40) URL local40 = this.getCodeBase();
				@Pc(48) Socket local48 = new Socket(InetAddress.getByName(local40.getHost()), 443);
				local48.setSoTimeout(10000);
				@Pc(54) OutputStream local54 = local48.getOutputStream();
				local54.write(17);
				local54.write(("JAGGRAB " + local40.getFile() + arg0.aString67 + "\n\n").getBytes());
				local77 = local48.getInputStream();
			} else {
				local77 = (new URL(this.getCodeBase(), arg0.aString67)).openStream();
			}
			@Pc(90) int local90 = -1;
			@Pc(92) int local92 = 0;
			while (local92 < local35.length) {
				@Pc(102) int local102 = local35.length - local92;
				if (local102 > 1000) {
					local102 = 1000;
				}
				@Pc(114) int local114 = local77.read(local35, local92, local102);
				if (local114 < 0) {
					throw new EOFException();
				}
				local92 += local114;
				@Pc(135) int local135 = local92 * 100 / local35.length;
				if (local135 != local90) {
					try {
						@Pc(146) Graphics local146 = this.getGraphics();
						if (local146 == null) {
							this.repaint();
						} else {
							local146.setColor(Color.black);
							local146.fillRect(0, 0, this.anInt6827, this.anInt6830);
							local146.setColor(local24);
							local146.drawRect(this.anInt6827 / 2 - 152, this.anInt6830 / 2 + -18, 303, 33);
							@Pc(200) String local200 = arg0.aStringArray88[this.anInt6828] + " - " + local135 + "%";
							local146.setFont(local8);
							local146.setColor(local31);
							local146.drawString(local200, (this.anInt6827 - local12.stringWidth(local200)) / 2, this.anInt6830 / 2 + 4);
							local90 = local135;
						}
					} catch (@Pc(228) Exception local228) {
					}
				}
			}
			local77.close();
			if (arg0.anInt6823 != arg0.anInt6824) {
				@Pc(246) byte[] local246 = new byte[arg0.anInt6823];
				@Pc(251) Inflater local251 = new Inflater(true);
				local251.setInput(local35);
				local35 = local246;
				local251.inflate(local246);
			}
		} catch (@Pc(262) Exception local262) {
			return null;
		}
		return this.method5733(arg0, local35, false) ? local35 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/lang/String;)V")
	private void method5731(@OriginalArg(1) String arg0) {
		if (this.aBoolean495) {
			return;
		}
		this.aBoolean495 = true;
		try {
			if (aString70 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString70 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILjava/io/File;)[B")
	private byte[] method5732(@OriginalArg(1) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString71 = this.getParameter("unsignedurl");
			if (aString71 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(16) SecurityException local16) {
					this.aBoolean495 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString71), "_parent");
					} catch (@Pc(29) Exception local29) {
					}
					return;
				}
			}
			aString70 = this.getParameter("crashurl");
			@Pc(36) int local36 = 0;
			@Pc(40) String local40 = this.getParameter("cachesubdirid");
			if (local40 != null) {
				local36 = Integer.parseInt(local40);
				if (local36 < 0 || Class218.aStringArray87.length <= local36) {
					local36 = 0;
				}
			}
			@Pc(61) String local61 = this.getParameter("colourid");
			if (local61 != null) {
				anInt6829 = Integer.parseInt(local61);
				if (anInt6829 < 0 || anInt6829 >= Class218.anIntArray516.length) {
					anInt6829 = 0;
				}
			}
			this.anInt6827 = this.getSize().width;
			this.anInt6830 = this.getSize().height;
			@Pc(87) int local87 = 32;
			try {
				@Pc(92) int local92 = Integer.parseInt(this.getParameter("modewhat"));
				local87 += local92;
			} catch (@Pc(98) Exception local98) {
			}
			try {
				@Pc(102) String local102 = this.getParameter("lang");
				if (local102 != null) {
					this.anInt6828 = Integer.parseInt(local102);
				}
			} catch (@Pc(110) Exception local110) {
			}
			@Pc(120) Class223 local120;
			try {
				local120 = new Class223(this, local87, Class218.aStringArray87[local36], 29);
			} catch (@Pc(122) Exception local122) {
				this.method5731("nocache");
				return;
			}
			@Pc(129) unpack local129 = null;
			@Pc(139) byte[] local139;
			try {
				Class.forName("java.util.jar.Pack200");
				local139 = this.method5729(false, local120, Class218.aClass219_2);
				if (local139 == null) {
					return;
				}
				local129 = new unpack_Sub1(local139);
			} catch (@Pc(150) Throwable local150) {
			}
			if (local129 == null) {
				local139 = this.method5729(false, local120, Class218.aClass219_1);
				if (local139 == null) {
					return;
				}
				@Pc(168) unpack local168 = new unpack(local139);
				@Pc(173) ClassLoader_Sub1 local173 = new ClassLoader_Sub1(local168);
				@Pc(176) Class local176 = Class.forName("unpack");
				local173.method5707(local176.getName(), local176);
				@Pc(186) Class local186 = local173.loadClass("unpackclass");
				@Pc(193) byte[] local193 = this.method5729(false, local120, Class218.aClass219_3);
				if (local193 == null) {
					return;
				}
				local129 = (unpack) local186.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local193, Boolean.TRUE);
			}
			@Pc(227) ClassLoader_Sub1 local227 = new ClassLoader_Sub1(local129);
			@Pc(229) byte local229 = -1;
			@Pc(233) String local233 = System.getProperty("os.name").toLowerCase();
			@Pc(237) String local237 = System.getProperty("os.arch").toLowerCase();
			if (local233.startsWith("win")) {
				if (local237.startsWith("amd64") || local237.startsWith("x86_64")) {
					local229 = 4;
				} else {
					local229 = 0;
				}
			} else if (local233.startsWith("linux")) {
				local229 = 1;
			} else if (local233.startsWith("mac")) {
				if (local237.startsWith("ppc")) {
					local229 = 2;
				} else {
					local229 = 3;
				}
			}
			if (local229 != -1) {
				for (@Pc(285) int local285 = 0; local285 < Class218.aClass219ArrayArray1[local229].length; local285++) {
					this.method5729(this.getParameter("suppress_sha") != null, local120, Class218.aClass219ArrayArray1[local229][local285]);
				}
			}
			if (Class218.aClass219Array1 != null) {
				local229 = -1;
				local233 = System.getProperty("os.name").toLowerCase();
				local237 = System.getProperty("os.arch").toLowerCase();
				if (local233.startsWith("win")) {
					if (local237.startsWith("amd64") || local237.startsWith("x86_64")) {
						local229 = 2;
					} else {
						local229 = 0;
					}
				}
				if (local229 != -1) {
					this.method5729(this.getParameter("suppress_sha") != null, local120, Class218.aClass219Array1[local229]);
				}
			}
			@Pc(371) Class local371 = Class.forName("Class222");
			local227.method5707(local371.getName(), local371);
			@Pc(380) Class local380 = Class.forName("Class223");
			local227.method5707(local380.getName(), local380);
			@Pc(389) Class local389 = Class.forName("Class225");
			local227.method5707(local389.getName(), local389);
			@Pc(398) Class local398 = Class.forName("Class224");
			local227.method5707(local398.getName(), local398);
			@Pc(407) Class local407 = Class.forName("Interface11");
			local227.method5707(local407.getName(), local407);
			@Pc(417) Class local417 = local227.loadClass("client");
			synchronized (this) {
				if (this.aBoolean494) {
					return;
				}
				this.anApplet2 = (Applet) local417.getDeclaredConstructor().newInstance();
				local417.getMethod("providesignlink", local380).invoke(null, local120);
				this.anApplet2.init();
				if (this.aBoolean492) {
					this.anApplet2.start();
				}
				if (this.aBoolean493) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(477) Exception local477) {
			RuntimeException_Sub2.anInt6825 = 1798492792;
			if (local477 instanceof InvocationTargetException) {
				@Pc(493) Throwable local493 = ((InvocationTargetException) local477).getTargetException();
				if (local493 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5718(local477.toString(), local493, this);
			} else {
				RuntimeException_Sub2.method5718(null, local477, this);
			}
			this.method5731("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean494 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!c;[BIZ)Z")
	private boolean method5733(@OriginalArg(0) Class219 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg1);
			@Pc(21) byte[] local21 = local8.digest();
			for (@Pc(23) int local23 = 0; local23 < 20; local23++) {
				if (arg0.anIntArray517[local23] != local21[local23]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(41) Exception local41) {
			this.method5731("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;B)Z")
	private boolean method5734(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg1);
			local4.write(arg0, 0, arg0.length);
			local4.close();
			return true;
		} catch (@Pc(23) IOException local23) {
			this.method5731("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean492 = true;
		this.aBoolean493 = false;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}
}
