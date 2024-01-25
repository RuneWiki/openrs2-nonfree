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
	private static String aString212;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString213;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private static int anInt7331 = 0;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt7333;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "I")
	private int anInt7334;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean537 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean535 = false;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "I")
	private int anInt7332 = 0;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean538 = false;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Z")
	private boolean aBoolean536 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;[BB)Z")
	private boolean method5778(@OriginalArg(0) File arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(4) FileOutputStream local4 = new FileOutputStream(arg0);
			local4.write(arg1, 0, arg1.length);
			local4.close();
			return true;
		} catch (@Pc(25) IOException local25) {
			this.method5783("savefile");
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;ZB)[B")
	private byte[] method5779(@OriginalArg(0) Class276 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(19) Color local19 = new Color(Class273.anIntArray647[anInt7331]);
		@Pc(26) Color local26 = new Color(Class273.anIntArray648[anInt7331]);
		@Pc(30) byte[] local30 = new byte[arg0.anInt7326];
		try {
			@Pc(78) InputStream local78;
			if (arg1) {
				@Pc(41) URL local41 = this.getCodeBase();
				@Pc(49) Socket local49 = new Socket(InetAddress.getByName(local41.getHost()), 443);
				local49.setSoTimeout(10000);
				@Pc(55) OutputStream local55 = local49.getOutputStream();
				local55.write(17);
				local55.write(("JAGGRAB " + local41.getFile() + arg0.aString211 + "\n\n").getBytes());
				local78 = local49.getInputStream();
			} else {
				local78 = (new URL(this.getCodeBase(), arg0.aString211)).openStream();
			}
			@Pc(91) int local91 = -1;
			@Pc(93) int local93 = 0;
			while (local30.length > local93) {
				@Pc(106) int local106 = local30.length - local93;
				if (local106 > 1000) {
					local106 = 1000;
				}
				@Pc(120) int local120 = local78.read(local30, local93, local106);
				if (local120 < 0) {
					throw new EOFException();
				}
				local93 += local120;
				@Pc(140) int local140 = local93 * 100 / local30.length;
				if (local140 != local91) {
					try {
						@Pc(147) Graphics local147 = this.getGraphics();
						if (local147 == null) {
							this.repaint();
						} else {
							local147.setColor(Color.black);
							local147.fillRect(0, 0, this.anInt7333, this.anInt7334);
							local147.setColor(local19);
							local147.drawRect(this.anInt7333 / 2 - 152, this.anInt7334 / 2 + -18, 303, 33);
							@Pc(197) String local197 = arg0.aStringArray44[this.anInt7332] + " - " + local140 + "%";
							local147.setFont(local8);
							local147.setColor(local26);
							local91 = local140;
							local147.drawString(local197, (this.anInt7333 - local12.stringWidth(local197)) / 2, this.anInt7334 / 2 + 4);
						}
					} catch (@Pc(228) Exception local228) {
					}
				}
			}
			local78.close();
			if (arg0.anInt7325 != arg0.anInt7326) {
				@Pc(242) byte[] local242 = new byte[arg0.anInt7325];
				@Pc(247) Inflater local247 = new Inflater(true);
				local247.setInput(local30);
				local247.inflate(local242);
				local30 = local242;
			}
		} catch (@Pc(258) Exception local258) {
			return null;
		}
		return this.method5781(local30, arg0, false) ? local30 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean536 = this.aBoolean535 = false;
		this.aBoolean538 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;BLloader!or;Z)[B")
	private byte[] method5780(@OriginalArg(0) Class276 arg0, @OriginalArg(2) Class280 arg1, @OriginalArg(3) boolean arg2) {
		@Pc(5) File local5;
		try {
			local5 = arg1.method5809(arg0.aString210);
		} catch (@Pc(7) Exception local7) {
			this.method5783("nocache");
			return null;
		}
		@Pc(18) byte[] local18 = this.method5782(local5);
		if (!this.method5781(local18, arg0, arg2)) {
			local18 = this.method5779(arg0, false);
			if (local18 == null) {
				local18 = this.method5779(arg0, true);
			}
			if (local18 == null) {
				this.method5783("download");
				return null;
			}
			if (!this.method5778(local5, local18)) {
				return null;
			}
			local18 = this.method5782(local5);
			if (!this.method5781(local18, arg0, false)) {
				this.method5783("mismatch");
				return null;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLloader!f;ZI)Z")
	private boolean method5781(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg0);
			@Pc(22) byte[] local22 = local9.digest();
			for (@Pc(24) int local24 = 0; local24 < 20; local24++) {
				if (arg1.anIntArray649[local24] != local22[local24]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(47) Exception local47) {
			this.method5783("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean538 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString212 = this.getParameter("unsignedurl");
			if (aString212 != null) {
				try {
					@Pc(10) SecurityManager local10 = System.getSecurityManager();
					if (local10 != null) {
						local10.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean537 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString212), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString213 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || local37 >= Class273.aStringArray43.length) {
					local37 = 0;
				}
			}
			@Pc(62) String local62 = this.getParameter("colourid");
			if (local62 != null) {
				anInt7331 = Integer.parseInt(local62);
				if (anInt7331 < 0 || anInt7331 >= Class273.anIntArray647.length) {
					anInt7331 = 0;
				}
			}
			this.anInt7333 = this.getSize().width;
			this.anInt7334 = this.getSize().height;
			@Pc(96) int local96 = 32;
			try {
				@Pc(101) int local101 = Integer.parseInt(this.getParameter("modewhat"));
				local96 += local101;
			} catch (@Pc(107) Exception local107) {
			}
			try {
				@Pc(111) String local111 = this.getParameter("lang");
				if (local111 != null) {
					this.anInt7332 = Integer.parseInt(local111);
				}
			} catch (@Pc(119) Exception local119) {
			}
			@Pc(129) Class280 local129;
			try {
				local129 = new Class280(this, local96, Class273.aStringArray43[local37], 30);
			} catch (@Pc(131) Exception local131) {
				this.method5783("nocache");
				return;
			}
			@Pc(138) unpack local138 = null;
			@Pc(148) byte[] local148;
			try {
				Class.forName("java.util.jar.Pack200");
				local148 = this.method5780(Class273.aClass276_2, local129, false);
				if (local148 == null) {
					return;
				}
				local138 = new unpack_Sub1(local148);
			} catch (@Pc(159) Throwable local159) {
			}
			if (local138 == null) {
				local148 = this.method5780(Class273.aClass276_1, local129, false);
				if (local148 == null) {
					return;
				}
				@Pc(178) unpack local178 = new unpack(local148);
				@Pc(183) ClassLoader_Sub1 local183 = new ClassLoader_Sub1(local178);
				@Pc(186) Class local186 = Class.forName("unpack");
				local183.method5774(local186.getName(), local186);
				@Pc(196) Class local196 = local183.loadClass("unpackclass");
				@Pc(203) byte[] local203 = this.method5780(Class273.aClass276_3, local129, false);
				if (local203 == null) {
					return;
				}
				local138 = (unpack) local196.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local203, Boolean.TRUE);
			}
			@Pc(237) ClassLoader_Sub1 local237 = new ClassLoader_Sub1(local138);
			@Pc(239) byte local239 = -1;
			@Pc(243) String local243 = System.getProperty("os.name").toLowerCase();
			@Pc(247) String local247 = System.getProperty("os.arch").toLowerCase();
			if (local243.startsWith("win")) {
				if (local247.startsWith("amd64") || local247.startsWith("x86_64")) {
					local239 = 1;
				} else {
					local239 = 0;
				}
			} else if (local243.startsWith("linux")) {
				if (local247.startsWith("amd64") || local247.startsWith("x86_64")) {
					local239 = 3;
				} else {
					local239 = 2;
				}
			} else if (local243.startsWith("mac")) {
				if (local247.startsWith("ppc")) {
					local239 = 4;
				} else if (local247.startsWith("x86_64")) {
					local239 = 6;
				} else {
					local239 = 7;
				}
			}
			if (local239 != -1) {
				this.method5780(Class273.aClass276Array1[local239], local129, this.getParameter("suppress_sha") != null);
			}
			if (Class273.aClass276Array2 != null) {
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
					this.method5780(Class273.aClass276Array2[local239], local129, this.getParameter("suppress_sha") != null);
				}
			}
			if (Class273.aClass276Array3 != null) {
				local239 = -1;
				local243 = System.getProperty("os.name").toLowerCase();
				local247 = System.getProperty("os.arch").toLowerCase();
				if (local243.startsWith("win") && !local247.startsWith("amd64") && !local247.startsWith("x86_64")) {
					local239 = 0;
				}
				if (local239 != -1) {
					this.method5780(Class273.aClass276Array3[local239], local129, this.getParameter("suppress_sha") != null);
				}
			}
			@Pc(430) Class local430 = Class.forName("Class279");
			local237.method5774(local430.getName(), local430);
			@Pc(439) Class local439 = Class.forName("Class280");
			local237.method5774(local439.getName(), local439);
			@Pc(448) Class local448 = Class.forName("Class278");
			local237.method5774(local448.getName(), local448);
			@Pc(457) Class local457 = Class.forName("Class277");
			local237.method5774(local457.getName(), local457);
			@Pc(466) Class local466 = Class.forName("Interface14");
			local237.method5774(local466.getName(), local466);
			@Pc(476) Class local476 = local237.loadClass("client");
			synchronized (this) {
				if (this.aBoolean538) {
					return;
				}
				this.anApplet2 = (Applet) local476.getDeclaredConstructor().newInstance();
				local476.getMethod("providesignlink", local439).invoke(null, local129);
				this.anApplet2.init();
				if (this.aBoolean536) {
					this.anApplet2.start();
				}
				if (this.aBoolean535) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(535) Exception local535) {
			RuntimeException_Sub2.anInt7323 = -118856111;
			if (local535 instanceof InvocationTargetException) {
				@Pc(551) Throwable local551 = ((InvocationTargetException) local535).getTargetException();
				if (local551 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5758(this, local535.toString(), local551);
			} else {
				RuntimeException_Sub2.method5758(this, null, local535);
			}
			this.method5783("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;I)[B")
	private byte[] method5782(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean536 = false;
		this.aBoolean535 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;I)V")
	private void method5783(@OriginalArg(0) String arg0) {
		if (this.aBoolean537) {
			return;
		}
		this.aBoolean537 = true;
		try {
			if (aString213 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString213 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(53) Exception local53) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean535 = false;
		this.aBoolean536 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
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
