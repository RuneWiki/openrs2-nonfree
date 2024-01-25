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
	private static String aString83;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/lang/String;")
	private static String aString84;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private static int anInt7387 = 0;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt7388;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt7389;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean695 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean696 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "Z")
	private boolean aBoolean698 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean697 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt7390 = 0;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!b;BZ)[B")
	private byte[] method5733(@OriginalArg(0) Class270 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class271.anIntArray560[anInt7387]);
		@Pc(26) Color local26 = new Color(Class271.anIntArray559[anInt7387]);
		@Pc(30) byte[] local30 = new byte[arg0.anInt7381];
		try {
			@Pc(41) InputStream local41;
			if (arg1) {
				@Pc(46) URL local46 = this.getCodeBase();
				@Pc(54) Socket local54 = new Socket(InetAddress.getByName(local46.getHost()), 443);
				local54.setSoTimeout(10000);
				@Pc(60) OutputStream local60 = local54.getOutputStream();
				local60.write(17);
				local60.write(("JAGGRAB " + local46.getFile() + arg0.aString73 + "\n\n").getBytes());
				local41 = local54.getInputStream();
			} else {
				local41 = (new URL(this.getCodeBase(), arg0.aString73)).openStream();
			}
			@Pc(92) int local92 = -1;
			@Pc(94) int local94 = 0;
			while (local30.length > local94) {
				@Pc(108) int local108 = local30.length - local94;
				if (local108 > 1000) {
					local108 = 1000;
				}
				@Pc(120) int local120 = local41.read(local30, local94, local108);
				if (local120 < 0) {
					throw new EOFException();
				}
				local94 += local120;
				@Pc(140) int local140 = local94 * 100 / local30.length;
				if (local140 != local92) {
					try {
						@Pc(150) Graphics local150 = this.getGraphics();
						if (local150 == null) {
							this.repaint();
						} else {
							local150.setColor(Color.black);
							local150.fillRect(0, 0, this.anInt7389, this.anInt7388);
							local150.setColor(local19);
							local150.drawRect(this.anInt7389 / 2 - 152, this.anInt7388 / 2 + -18, 303, 33);
							@Pc(203) String local203 = arg0.aStringArray42[this.anInt7390] + " - " + local140 + "%";
							local150.setFont(local8);
							local150.setColor(local26);
							local150.drawString(local203, (this.anInt7389 - local12.stringWidth(local203)) / 2, this.anInt7388 / 2 + 4);
							local92 = local140;
						}
					} catch (@Pc(230) Exception local230) {
					}
				}
			}
			local41.close();
			if (arg0.anInt7381 != arg0.anInt7382) {
				@Pc(248) byte[] local248 = new byte[arg0.anInt7382];
				@Pc(253) Inflater local253 = new Inflater(true);
				local253.setInput(local30);
				local30 = local248;
				local253.inflate(local248);
			}
		} catch (@Pc(264) Exception local264) {
			return null;
		}
		return this.method5735(arg0, false, local30) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLjava/io/File;[B)Z")
	private boolean method5734(@OriginalArg(1) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg0);
			local9.write(arg1, 0, arg1.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method5738("savefile");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!b;ZI[B)Z")
	private boolean method5735(@OriginalArg(0) Class270 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg2 == null) {
				return false;
			}
			@Pc(19) MessageDigest local19 = MessageDigest.getInstance("SHA");
			local19.reset();
			local19.update(arg2);
			@Pc(27) byte[] local27 = local19.digest();
			for (@Pc(29) int local29 = 0; local29 < 20; local29++) {
				if (arg0.anIntArray558[local29] != local27[local29]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(49) Exception local49) {
			this.method5738("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;Z)[B")
	private byte[] method5736(@OriginalArg(0) File arg0) {
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
		} catch (@Pc(38) IOException local38) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean696 = true;
		this.aBoolean698 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString84 = this.getParameter("unsignedurl");
			if (aString84 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(18) SecurityException local18) {
					this.aBoolean695 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString84), "_parent");
					} catch (@Pc(31) Exception local31) {
					}
					return;
				}
			}
			aString83 = this.getParameter("crashurl");
			@Pc(38) int local38 = 0;
			@Pc(42) String local42 = this.getParameter("cachesubdirid");
			if (local42 != null) {
				local38 = Integer.parseInt(local42);
				if (local38 < 0 || local38 >= Class271.aStringArray43.length) {
					local38 = 0;
				}
			}
			@Pc(61) String local61 = this.getParameter("colourid");
			if (local61 != null) {
				anInt7387 = Integer.parseInt(local61);
				if (anInt7387 < 0 || Class271.anIntArray560.length <= anInt7387) {
					anInt7387 = 0;
				}
			}
			this.anInt7389 = this.getSize().width;
			this.anInt7388 = this.getSize().height;
			@Pc(90) int local90 = 32;
			try {
				@Pc(95) int local95 = Integer.parseInt(this.getParameter("modewhat"));
				local90 += local95;
			} catch (@Pc(101) Exception local101) {
			}
			try {
				@Pc(105) String local105 = this.getParameter("lang");
				if (local105 != null) {
					this.anInt7390 = Integer.parseInt(local105);
				}
			} catch (@Pc(114) Exception local114) {
			}
			@Pc(124) Class272 local124;
			try {
				local124 = new Class272(this, local90, Class271.aStringArray43[local38], 30);
			} catch (@Pc(126) Exception local126) {
				this.method5738("nocache");
				return;
			}
			@Pc(133) unpack local133 = null;
			@Pc(143) byte[] local143;
			try {
				Class.forName("java.util.jar.Pack200");
				local143 = this.method5737(local124, Class271.aClass270_2, false);
				if (local143 == null) {
					return;
				}
				local133 = new unpack_Sub1(local143);
			} catch (@Pc(154) Throwable local154) {
			}
			if (local133 == null) {
				local143 = this.method5737(local124, Class271.aClass270_1, false);
				if (local143 == null) {
					return;
				}
				@Pc(172) unpack local172 = new unpack(local143);
				@Pc(177) ClassLoader_Sub1 local177 = new ClassLoader_Sub1(local172);
				@Pc(180) Class local180 = Class.forName("unpack");
				local177.method5732(local180.getName(), local180);
				@Pc(190) Class local190 = local177.loadClass("unpackclass");
				@Pc(197) byte[] local197 = this.method5737(local124, Class271.aClass270_3, false);
				if (local197 == null) {
					return;
				}
				local133 = (unpack) local190.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local197, Boolean.TRUE);
			}
			@Pc(233) ClassLoader_Sub1 local233 = new ClassLoader_Sub1(local133);
			@Pc(235) byte local235 = -1;
			@Pc(239) String local239 = System.getProperty("os.name").toLowerCase();
			@Pc(243) String local243 = System.getProperty("os.arch").toLowerCase();
			if (local239.startsWith("win")) {
				if (local243.startsWith("amd64") || local243.startsWith("x86_64")) {
					local235 = 1;
				} else {
					local235 = 0;
				}
			} else if (local239.startsWith("linux")) {
				if (local243.startsWith("amd64") || local243.startsWith("x86_64")) {
					local235 = 3;
				} else {
					local235 = 2;
				}
			} else if (local239.startsWith("mac")) {
				if (local243.startsWith("ppc")) {
					local235 = 4;
				} else if (local243.startsWith("x86_64")) {
					local235 = 6;
				} else {
					local235 = 7;
				}
			}
			if (local235 != -1) {
				this.method5737(local124, Class271.aClass270Array1[local235], this.getParameter("suppress_sha") != null);
			}
			if (Class271.aClass270Array2 != null) {
				local235 = -1;
				local239 = System.getProperty("os.name").toLowerCase();
				local243 = System.getProperty("os.arch").toLowerCase();
				if (local239.startsWith("win")) {
					if (local243.startsWith("amd64") || local243.startsWith("x86_64")) {
						local235 = 2;
					} else {
						local235 = 0;
					}
				}
				if (local235 != -1) {
					this.method5737(local124, Class271.aClass270Array2[local235], this.getParameter("suppress_sha") != null);
				}
			}
			if (Class271.aClass270Array3 != null) {
				local235 = -1;
				local239 = System.getProperty("os.name").toLowerCase();
				local243 = System.getProperty("os.arch").toLowerCase();
				if (local239.startsWith("win") && !local243.startsWith("amd64") && !local243.startsWith("x86_64")) {
					local235 = 0;
				}
				if (local235 != -1) {
					this.method5737(local124, Class271.aClass270Array3[local235], this.getParameter("suppress_sha") != null);
				}
			}
			@Pc(429) Class local429 = Class.forName("Class277");
			local233.method5732(local429.getName(), local429);
			@Pc(438) Class local438 = Class.forName("Class272");
			local233.method5732(local438.getName(), local438);
			@Pc(447) Class local447 = Class.forName("Class276");
			local233.method5732(local447.getName(), local447);
			@Pc(456) Class local456 = Class.forName("Class275");
			local233.method5732(local456.getName(), local456);
			@Pc(465) Class local465 = Class.forName("Interface14");
			local233.method5732(local465.getName(), local465);
			@Pc(475) Class local475 = local233.loadClass("client");
			synchronized (this) {
				if (this.aBoolean697) {
					return;
				}
				this.anApplet3 = (Applet) local475.getDeclaredConstructor().newInstance();
				local475.getMethod("providesignlink", local438).invoke(null, local124);
				this.anApplet3.init();
				if (this.aBoolean696) {
					this.anApplet3.start();
				}
				if (this.aBoolean698) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(536) Exception local536) {
			RuntimeException_Sub2.anInt7383 = -682932437;
			if (local536 instanceof InvocationTargetException) {
				@Pc(545) Throwable local545 = ((InvocationTargetException) local536).getTargetException();
				if (local545 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5690(local545, local536.toString(), this);
			} else {
				RuntimeException_Sub2.method5690(local536, null, this);
			}
			this.method5738("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!et;Lloader!b;BZ)[B")
	private byte[] method5737(@OriginalArg(0) Class272 arg0, @OriginalArg(1) Class270 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(11) File local11;
		try {
			local11 = arg0.method5699(arg1.aString72);
		} catch (@Pc(13) Exception local13) {
			this.method5738("nocache");
			return null;
		}
		@Pc(24) byte[] local24 = this.method5736(local11);
		if (!this.method5735(arg1, arg2, local24)) {
			local24 = this.method5733(arg1, false);
			if (local24 == null) {
				local24 = this.method5733(arg1, true);
			}
			if (local24 == null) {
				this.method5738("download");
				return null;
			}
			if (!this.method5734(local11, local24)) {
				return null;
			}
			local24 = this.method5736(local11);
			if (!this.method5735(arg1, false, local24)) {
				this.method5738("mismatch");
				return null;
			}
		}
		return local24;
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
		this.aBoolean697 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method5738(@OriginalArg(0) String arg0) {
		if (this.aBoolean695) {
			return;
		}
		this.aBoolean695 = true;
		try {
			if (aString83 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString83 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(56) Exception local56) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean696 = false;
		this.aBoolean698 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
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
		this.aBoolean697 = true;
		this.aBoolean696 = this.aBoolean698 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}
}
