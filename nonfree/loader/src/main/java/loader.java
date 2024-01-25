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
	private static String aString82;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString83;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private static int anInt7864 = 0;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt7865;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt7867;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean670 = false;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Z")
	private boolean aBoolean671 = false;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean672 = false;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Z")
	private boolean aBoolean673 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt7866 = 0;

	@OriginalMember(owner = "loader!loader", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void paint(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.paint(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean672 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!g;[BZ)Z")
	private boolean method6152(@OriginalArg(1) Class273 arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg1);
			@Pc(24) byte[] local24 = local9.digest();
			for (@Pc(26) int local26 = 0; local26 < 20; local26++) {
				if (local24[local26] != arg0.anIntArray524[local26]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(51) Exception local51) {
			this.method6155("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!g;ZLloader!js;I)[B")
	private byte[] method6153(@OriginalArg(0) Class273 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class275 arg2) {
		@Pc(12) File local12;
		try {
			local12 = arg2.method6131(arg0.aString72);
		} catch (@Pc(14) Exception local14) {
			this.method6155("nocache");
			return null;
		}
		@Pc(25) byte[] local25 = this.method6154(local12);
		if (!this.method6152(arg0, local25, arg1)) {
			local25 = this.method6156(arg0, false);
			if (local25 == null) {
				local25 = this.method6156(arg0, true);
			}
			if (local25 == null) {
				this.method6155("download");
				return null;
			}
			if (!this.method6157(local12, local25)) {
				return null;
			}
			local25 = this.method6154(local12);
			if (!this.method6152(arg0, local25, false)) {
				this.method6155("mismatch");
				return null;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet3 != null) {
			this.anApplet3.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method6154(@OriginalArg(1) File arg0) {
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
		} catch (@Pc(40) IOException local40) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean671 = true;
		this.aBoolean673 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/lang/String;)V")
	private void method6155(@OriginalArg(1) String arg0) {
		if (this.aBoolean670) {
			return;
		}
		this.aBoolean670 = true;
		try {
			if (aString82 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString82 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean673 = this.aBoolean671 = false;
		this.aBoolean672 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!g;Z)[B")
	private byte[] method6156(@OriginalArg(1) Class273 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class272.anIntArray523[anInt7864]);
		@Pc(26) Color local26 = new Color(Class272.anIntArray522[anInt7864]);
		@Pc(35) byte[] local35 = new byte[arg0.anInt7857];
		try {
			@Pc(46) InputStream local46;
			if (arg1) {
				@Pc(51) URL local51 = this.getCodeBase();
				@Pc(59) Socket local59 = new Socket(InetAddress.getByName(local51.getHost()), 443);
				local59.setSoTimeout(10000);
				@Pc(65) OutputStream local65 = local59.getOutputStream();
				local65.write(17);
				local65.write(("JAGGRAB " + local51.getFile() + arg0.aString73 + "\n\n").getBytes());
				local46 = local59.getInputStream();
			} else {
				local46 = (new URL(this.getCodeBase(), arg0.aString73)).openStream();
			}
			@Pc(90) int local90 = -1;
			@Pc(92) int local92 = 0;
			while (local92 < local35.length) {
				@Pc(106) int local106 = local35.length - local92;
				if (local106 > 1000) {
					local106 = 1000;
				}
				@Pc(118) int local118 = local46.read(local35, local92, local106);
				if (local118 < 0) {
					throw new EOFException();
				}
				local92 += local118;
				@Pc(136) int local136 = local92 * 100 / local35.length;
				if (local136 != local90) {
					try {
						@Pc(143) Graphics local143 = this.getGraphics();
						if (local143 == null) {
							this.repaint();
						} else {
							local143.setColor(Color.black);
							local143.fillRect(0, 0, this.anInt7865, this.anInt7867);
							local143.setColor(local19);
							local143.drawRect(this.anInt7865 / 2 - 152, this.anInt7867 / 2 - 18, 303, 33);
							@Pc(197) String local197 = arg0.aStringArray45[this.anInt7866] + " - " + local136 + "%";
							local143.setFont(local8);
							local143.setColor(local26);
							local90 = local136;
							local143.drawString(local197, (this.anInt7865 - local12.stringWidth(local197)) / 2, this.anInt7867 / 2 + 4);
						}
					} catch (@Pc(224) Exception local224) {
					}
				}
			}
			local46.close();
			if (arg0.anInt7857 != arg0.anInt7856) {
				@Pc(242) byte[] local242 = new byte[arg0.anInt7856];
				@Pc(247) Inflater local247 = new Inflater(true);
				local247.setInput(local35);
				local35 = local242;
				local247.inflate(local242);
			}
		} catch (@Pc(258) Exception local258) {
			return null;
		}
		return this.method6152(arg0, local35, false) ? local35 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean671 = false;
		this.aBoolean673 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString83 = this.getParameter("unsignedurl");
			if (aString83 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(19) SecurityException local19) {
					this.aBoolean670 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString83), "_parent");
					} catch (@Pc(32) Exception local32) {
					}
					return;
				}
			}
			aString82 = this.getParameter("crashurl");
			@Pc(39) int local39 = 0;
			@Pc(43) String local43 = this.getParameter("cachesubdirid");
			if (local43 != null) {
				local39 = Integer.parseInt(local43);
				if (local39 < 0 || Class272.aStringArray44.length <= local39) {
					local39 = 0;
				}
			}
			@Pc(67) String local67 = this.getParameter("colourid");
			if (local67 != null) {
				anInt7864 = Integer.parseInt(local67);
				if (anInt7864 < 0 || anInt7864 >= Class272.anIntArray523.length) {
					anInt7864 = 0;
				}
			}
			this.anInt7865 = this.getSize().width;
			this.anInt7867 = this.getSize().height;
			@Pc(102) int local102 = 32;
			try {
				@Pc(107) int local107 = Integer.parseInt(this.getParameter("modewhat"));
				local102 += local107;
			} catch (@Pc(113) Exception local113) {
			}
			try {
				@Pc(117) String local117 = this.getParameter("lang");
				if (local117 != null) {
					this.anInt7866 = Integer.parseInt(local117);
				}
			} catch (@Pc(126) Exception local126) {
			}
			@Pc(136) Class275 local136;
			try {
				local136 = new Class275(this, local102, Class272.aStringArray44[local39], 30);
			} catch (@Pc(138) Exception local138) {
				this.method6155("nocache");
				return;
			}
			@Pc(145) unpack local145 = null;
			@Pc(155) byte[] local155;
			try {
				Class.forName("java.util.jar.Pack200");
				local155 = this.method6153(Class272.aClass273_2, false, local136);
				if (local155 == null) {
					return;
				}
				local145 = new unpack_Sub1(local155);
			} catch (@Pc(165) Throwable local165) {
			}
			if (local145 == null) {
				local155 = this.method6153(Class272.aClass273_1, false, local136);
				if (local155 == null) {
					return;
				}
				@Pc(182) unpack local182 = new unpack(local155);
				@Pc(187) ClassLoader_Sub1 local187 = new ClassLoader_Sub1(local182);
				@Pc(190) Class local190 = Class.forName("unpack");
				local187.method6102(local190, local190.getName());
				@Pc(200) Class local200 = local187.loadClass("unpackclass");
				@Pc(207) byte[] local207 = this.method6153(Class272.aClass273_3, false, local136);
				if (local207 == null) {
					return;
				}
				local145 = (unpack) local200.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local207, Boolean.TRUE);
			}
			@Pc(242) ClassLoader_Sub1 local242 = new ClassLoader_Sub1(local145);
			@Pc(244) byte local244 = -1;
			@Pc(248) String local248 = System.getProperty("os.name").toLowerCase();
			@Pc(252) String local252 = System.getProperty("os.arch").toLowerCase();
			if (local248.startsWith("win")) {
				if (local252.startsWith("amd64") || local252.startsWith("x86_64")) {
					local244 = 1;
				} else {
					local244 = 0;
				}
			} else if (local248.startsWith("linux")) {
				if (local252.startsWith("amd64") || local252.startsWith("x86_64")) {
					local244 = 3;
				} else {
					local244 = 2;
				}
			} else if (local248.startsWith("mac")) {
				if (local252.startsWith("ppc")) {
					local244 = 4;
				} else if (local252.startsWith("x86_64")) {
					local244 = 6;
				} else {
					local244 = 7;
				}
			}
			if (local244 != -1) {
				this.method6153(Class272.aClass273Array1[local244], this.getParameter("suppress_sha") != null, local136);
			}
			if (Class272.aClass273Array2 != null) {
				local244 = -1;
				local248 = System.getProperty("os.name").toLowerCase();
				local252 = System.getProperty("os.arch").toLowerCase();
				if (local248.startsWith("win")) {
					if (local252.startsWith("amd64") || local252.startsWith("x86_64")) {
						local244 = 2;
					} else {
						local244 = 0;
					}
				}
				if (local244 != -1) {
					this.method6153(Class272.aClass273Array2[local244], this.getParameter("suppress_sha") != null, local136);
				}
			}
			if (Class272.aClass273Array3 != null) {
				local244 = -1;
				local248 = System.getProperty("os.name").toLowerCase();
				local252 = System.getProperty("os.arch").toLowerCase();
				if (local248.startsWith("win") && !local252.startsWith("amd64") && !local252.startsWith("x86_64")) {
					local244 = 0;
				}
				if (local244 != -1) {
					this.method6153(Class272.aClass273Array3[local244], this.getParameter("suppress_sha") != null, local136);
				}
			}
			@Pc(434) Class local434 = Class.forName("Class277");
			local242.method6102(local434, local434.getName());
			@Pc(443) Class local443 = Class.forName("Class275");
			local242.method6102(local443, local443.getName());
			@Pc(452) Class local452 = Class.forName("Class274");
			local242.method6102(local452, local452.getName());
			@Pc(461) Class local461 = Class.forName("Class276");
			local242.method6102(local461, local461.getName());
			@Pc(470) Class local470 = Class.forName("Interface13");
			local242.method6102(local470, local470.getName());
			@Pc(480) Class local480 = local242.loadClass("client");
			synchronized (this) {
				if (this.aBoolean672) {
					return;
				}
				this.anApplet3 = (Applet) local480.getDeclaredConstructor().newInstance();
				local480.getMethod("providesignlink", local443).invoke(null, local136);
				this.anApplet3.init();
				if (this.aBoolean673) {
					this.anApplet3.start();
				}
				if (this.aBoolean671) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(540) Exception local540) {
			RuntimeException_Sub2.anInt7854 = 460380035;
			if (local540 instanceof InvocationTargetException) {
				@Pc(556) Throwable local556 = ((InvocationTargetException) local540).getTargetException();
				if (local556 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method6118(local556, this, local540.toString());
			} else {
				RuntimeException_Sub2.method6118(local540, this, null);
			}
			this.method6155("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I[B)Z")
	private boolean method6157(@OriginalArg(0) File arg0, @OriginalArg(2) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(15) IOException local15) {
			this.method6155("savefile");
			return false;
		}
	}
}
