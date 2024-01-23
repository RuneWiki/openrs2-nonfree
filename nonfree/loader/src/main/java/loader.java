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
	private static String aString307;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "Ljava/lang/String;")
	private static String aString308;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2;

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "I")
	private int anInt6235;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt6236;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "I")
	private int anInt6234 = 0;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Z")
	private boolean aBoolean516 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "I")
	private int anInt6237 = 32;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "Z")
	private boolean aBoolean518 = false;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "Z")
	private boolean aBoolean517 = false;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean519 = false;

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean518 = this.aBoolean517 = false;
		this.aBoolean519 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.destroy();
		}
		this.anApplet2 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString308 = this.getParameter("unsignedurl");
			if (aString308 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean516 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString308), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			@Pc(35) String local35 = this.getParameter("pre142url");
			@Pc(41) String local41;
			if (local35 != null) {
				try {
					local41 = System.getProperty("java.version");
					if (local41.startsWith("1.3.") || local41.startsWith("1.4.0") || local41.startsWith("1.4.1")) {
						this.getAppletContext().showDocument(new URL(local35), "_self");
					}
				} catch (@Pc(64) Exception local64) {
				}
			}
			aString307 = this.getParameter("crashurl");
			this.anInt6235 = this.getSize().width;
			this.anInt6236 = this.getSize().height;
			try {
				@Pc(83) int local83 = Integer.parseInt(this.getParameter("modewhat"));
				this.anInt6237 += local83;
			} catch (@Pc(91) Exception local91) {
			}
			try {
				local41 = this.getParameter("lang");
				if (local41 != null) {
					this.anInt6234 = Integer.parseInt(local41);
				}
			} catch (@Pc(104) Exception local104) {
			}
			@Pc(113) Class211 local113;
			try {
				local113 = new Class211(this, this.anInt6237, "runescape", 29);
			} catch (@Pc(115) Exception local115) {
				this.method5266("nocache");
				return;
			}
			@Pc(124) ClassLoader_Sub1 local124 = new ClassLoader_Sub1();
			@Pc(133) byte[] local133;
			try {
				Class.forName("java.util.jar.Pack200");
				local133 = this.method5269(local113, Class205.aClass208_2);
				if (local133 == null) {
					return;
				}
				local124.anUnpack2 = new unpack_Sub1(local133);
				@Pc(150) byte[] local150 = this.method5269(local113, Class205.aClass208_4);
				if (local150 == null) {
					return;
				}
				local124.anUnpack1 = new unpack_Sub1(local150);
			} catch (@Pc(161) Throwable local161) {
			}
			@Pc(242) byte[] local242;
			if (local124.anUnpack2 == null) {
				local133 = this.method5269(local113, Class205.aClass208_1);
				if (local133 == null) {
					return;
				}
				@Pc(179) ClassLoader_Sub1 local179 = new ClassLoader_Sub1();
				local179.anUnpack2 = new unpack(local133);
				@Pc(188) Class local188 = Class.forName("unpack");
				local179.aHashtable1.put(local188.getName(), local188);
				@Pc(199) Class local199 = local179.loadClass("unpackclass");
				@Pc(205) byte[] local205 = this.method5269(local113, Class205.aClass208_3);
				if (local205 == null) {
					return;
				}
				local124.anUnpack2 = (unpack) local199.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local205, Boolean.TRUE);
				local242 = this.method5269(local113, Class205.aClass208_5);
				if (local242 == null) {
					return;
				}
				local124.anUnpack1 = (unpack) local199.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local242, Boolean.TRUE);
			}
			@Pc(278) String local278 = System.getProperty("os.name").toLowerCase();
			@Pc(282) String local282 = System.getProperty("os.arch").toLowerCase();
			@Pc(296) byte local296;
			if (local278.startsWith("win")) {
				if (local282.startsWith("amd64") || local282.startsWith("x86_64")) {
					local296 = 1;
				} else {
					local296 = 0;
				}
			} else if (local278.startsWith("linux")) {
				if (local282.startsWith("amd64") || local282.startsWith("x86_64")) {
					local296 = 3;
				} else {
					local296 = 2;
				}
			} else if (!local278.startsWith("mac")) {
				if (!local278.startsWith("sunos")) {
					this.method5266("os");
					return;
				}
				if (local282.startsWith("amd64") || local282.startsWith("x86_64")) {
					local296 = 6;
				} else if (local282.startsWith("sparc")) {
					local296 = 8;
				} else if (local282.startsWith("sparcv9")) {
					local296 = 9;
				} else {
					local296 = 7;
				}
			} else if (local282.startsWith("ppc")) {
				local296 = 4;
			} else {
				local296 = 5;
			}
			for (@Pc(370) int local370 = 0; local370 < Class205.aClass208ArrayArray1[local296].length; local370++) {
				local242 = this.method5269(local113, Class205.aClass208ArrayArray1[local296][local370]);
				if (local242 == null) {
					return;
				}
			}
			@Pc(401) Class local401 = Class.forName("Class210");
			local124.aHashtable1.put(local401.getName(), local401);
			@Pc(411) Class local411 = Class.forName("Class211");
			local124.aHashtable1.put(local411.getName(), local411);
			@Pc(421) Class local421 = Class.forName("Class206");
			local124.aHashtable1.put(local421.getName(), local421);
			@Pc(431) Class local431 = Class.forName("Class204");
			local124.aHashtable1.put(local431.getName(), local431);
			@Pc(441) Class local441 = Class.forName("Interface10");
			local124.aHashtable1.put(local441.getName(), local441);
			@Pc(452) Class local452 = local124.loadClass("client");
			synchronized (this) {
				if (this.aBoolean519) {
					return;
				}
				this.anApplet2 = (Applet) local452.getDeclaredConstructor().newInstance();
				local452.getMethod("providesignlink", local411).invoke(null, local113);
				this.anApplet2.init();
				if (this.aBoolean518) {
					this.anApplet2.start();
				}
				if (this.aBoolean517) {
					this.anApplet2.stop();
				}
			}
		} catch (@Pc(512) Exception local512) {
			RuntimeException_Sub2.anInt6232 = 1017330138;
			if (local512 instanceof InvocationTargetException) {
				@Pc(528) Throwable local528 = ((InvocationTargetException) local512).getTargetException();
				if (local528 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method5261(this, local528, local512.toString());
			} else {
				RuntimeException_Sub2.method5261(this, local512, null);
			}
			this.method5266("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method5266(@OriginalArg(0) String arg0) {
		if (this.aBoolean516) {
			return;
		}
		this.aBoolean516 = true;
		try {
			if (aString307 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString307 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(58) Exception local58) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(BLjava/io/File;)[B")
	private byte[] method5267(@OriginalArg(1) File arg0) {
		try {
			if (!arg0.exists()) {
				return null;
			}
			@Pc(16) int local16 = (int) arg0.length();
			@Pc(19) byte[] local19 = new byte[local16];
			@Pc(30) DataInputStream local30 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg0)));
			local30.readFully(local19, 0, local16);
			local30.close();
			return local19;
		} catch (@Pc(40) IOException local40) {
			return null;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ZLloader!e;B)[B")
	private byte[] method5268(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class208 arg1) {
		@Pc(8) Font local8 = new Font("Helvetica", 1, 13);
		@Pc(12) FontMetrics local12 = this.getFontMetrics(local8);
		@Pc(23) Color local23 = new Color(9179409);
		@Pc(27) byte[] local27 = new byte[arg1.anInt6229];
		try {
			@Pc(38) InputStream local38;
			if (arg0) {
				@Pc(43) URL local43 = this.getCodeBase();
				@Pc(51) Socket local51 = new Socket(InetAddress.getByName(local43.getHost()), 443);
				local51.setSoTimeout(10000);
				@Pc(57) OutputStream local57 = local51.getOutputStream();
				local57.write(17);
				local57.write(("JAGGRAB " + local43.getFile() + arg1.aString304 + "\n\n").getBytes());
				local38 = local51.getInputStream();
			} else {
				local38 = (new URL(this.getCodeBase(), arg1.aString304)).openStream();
			}
			@Pc(82) int local82 = 0;
			@Pc(84) int local84 = -1;
			while (local82 < local27.length) {
				@Pc(98) int local98 = local27.length - local82;
				if (local98 > 1000) {
					local98 = 1000;
				}
				@Pc(111) int local111 = local38.read(local27, local82, local98);
				if (local111 < 0) {
					throw new EOFException();
				}
				local82 += local111;
				@Pc(128) int local128 = local82 * 100 / local27.length;
				if (local84 != local128) {
					try {
						@Pc(139) Graphics local139 = this.getGraphics();
						if (local139 == null) {
							this.repaint();
						} else {
							local84 = local128;
							local139.setColor(Color.black);
							local139.fillRect(0, 0, this.anInt6235, this.anInt6236);
							local139.setColor(local23);
							local139.drawRect(this.anInt6235 / 2 - 152, this.anInt6236 / 2 + -18, 303, 33);
							@Pc(190) String local190 = arg1.aStringArray39[this.anInt6234] + " - " + local128 + "%";
							local139.setFont(local8);
							local139.setColor(Color.white);
							local139.drawString(local190, (this.anInt6235 - local12.stringWidth(local190)) / 2, this.anInt6236 / 2 + 4);
						}
					} catch (@Pc(219) Exception local219) {
					}
				}
			}
			local38.close();
			if (arg1.anInt6230 != arg1.anInt6229) {
				@Pc(236) byte[] local236 = new byte[arg1.anInt6230];
				@Pc(241) Inflater local241 = new Inflater(true);
				local241.setInput(local27);
				local27 = local236;
				local241.inflate(local236);
			}
		} catch (@Pc(252) Exception local252) {
			return null;
		}
		return this.method5270(local27, arg1) ? local27 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
	@Override
	public void update(@OriginalArg(0) Graphics arg0) {
		if (this.anApplet2 != null) {
			this.anApplet2.update(arg0);
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean519 = false;
		@Pc(7) Thread local7 = new Thread(this);
		local7.start();
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!vl;Lloader!e;B)[B")
	private byte[] method5269(@OriginalArg(0) Class211 arg0, @OriginalArg(1) Class208 arg1) {
		@Pc(13) File local13;
		try {
			local13 = Class211.method5299("runescape", this.anInt6237, arg1.aString305);
		} catch (@Pc(15) Exception local15) {
			this.method5266("nocache");
			return null;
		}
		@Pc(26) byte[] local26 = this.method5267(local13);
		if (!this.method5270(local26, arg1)) {
			local26 = this.method5268(false, arg1);
			if (local26 == null) {
				local26 = this.method5268(true, arg1);
			}
			if (local26 == null) {
				this.method5266("download");
				return null;
			}
			if (!this.method5271(local26, local13)) {
				return null;
			}
			local26 = this.method5267(local13);
			if (!this.method5270(local26, arg1)) {
				this.method5266("mismatch");
				return null;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean517 = false;
		this.aBoolean518 = true;
		if (this.anApplet2 != null) {
			this.anApplet2.start();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BBLloader!e;)Z")
	private boolean method5270(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class208 arg1) {
		try {
			if (arg0 == null) {
				return false;
			}
			@Pc(9) MessageDigest local9 = MessageDigest.getInstance("SHA");
			local9.reset();
			local9.update(arg0);
			@Pc(17) byte[] local17 = local9.digest();
			for (@Pc(24) int local24 = 0; local24 < 20; local24++) {
				if (local17[local24] != arg1.anIntArray529[local24]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(43) Exception local43) {
			this.method5266("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean517 = true;
		this.aBoolean518 = false;
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "([BLjava/io/File;I)Z")
	private boolean method5271(@OriginalArg(0) byte[] arg0, @OriginalArg(1) File arg1) {
		try {
			@Pc(10) FileOutputStream local10 = new FileOutputStream(arg1);
			local10.write(arg0, 0, arg0.length);
			local10.close();
			return true;
		} catch (@Pc(21) IOException local21) {
			this.method5266("savefile");
			return false;
		}
	}
}
