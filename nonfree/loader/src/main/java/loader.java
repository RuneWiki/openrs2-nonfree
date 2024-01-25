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

	@OriginalMember(owner = "loader!loader", name = "d", descriptor = "Ljava/lang/String;")
	private static String aString92;

	@OriginalMember(owner = "loader!loader", name = "e", descriptor = "Ljava/lang/String;")
	private static String aString93;

	@OriginalMember(owner = "loader!loader", name = "h", descriptor = "I")
	private static int anInt9182 = 0;

	@OriginalMember(owner = "loader!loader", name = "c", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3;

	@OriginalMember(owner = "loader!loader", name = "f", descriptor = "I")
	private int anInt9180;

	@OriginalMember(owner = "loader!loader", name = "j", descriptor = "I")
	private int anInt9183;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "Z")
	private boolean aBoolean644 = false;

	@OriginalMember(owner = "loader!loader", name = "b", descriptor = "Z")
	private boolean aBoolean645 = false;

	@OriginalMember(owner = "loader!loader", name = "i", descriptor = "Z")
	private boolean aBoolean646 = false;

	@OriginalMember(owner = "loader!loader", name = "g", descriptor = "I")
	private int anInt9181 = 0;

	@OriginalMember(owner = "loader!loader", name = "k", descriptor = "Z")
	private boolean aBoolean647 = false;

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(ILloader!f;[B)Z")
	private boolean method7605(@OriginalArg(1) Class324 arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (arg1 == null) {
				return false;
			}
			@Pc(8) MessageDigest local8 = MessageDigest.getInstance("SHA");
			local8.reset();
			local8.update(arg1);
			@Pc(21) byte[] local21 = local8.digest();
			for (@Pc(23) int local23 = 0; local23 < 20; local23++) {
				if (local21[local23] != arg0.anIntArray850[local23]) {
					return false;
				}
			}
			return true;
		} catch (@Pc(44) Exception local44) {
			this.method7608("sha");
			return false;
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/io/File;B)[B")
	private byte[] method7606(@OriginalArg(0) File arg0) {
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

	@OriginalMember(owner = "loader!loader", name = "destroy", descriptor = "()V")
	@Override
	public synchronized void destroy() {
		this.aBoolean646 = this.aBoolean647 = false;
		this.aBoolean645 = true;
		if (this.anApplet3 != null) {
			this.anApplet3.destroy();
		}
		this.anApplet3 = null;
	}

	@OriginalMember(owner = "loader!loader", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			aString92 = this.getParameter("unsignedurl");
			if (aString92 != null) {
				try {
					@Pc(9) SecurityManager local9 = System.getSecurityManager();
					if (local9 != null) {
						local9.checkExec("echo");
					}
				} catch (@Pc(17) SecurityException local17) {
					this.aBoolean644 = true;
					try {
						this.getAppletContext().showDocument(new URL(aString92), "_parent");
					} catch (@Pc(30) Exception local30) {
					}
					return;
				}
			}
			aString93 = this.getParameter("crashurl");
			@Pc(37) int local37 = 0;
			@Pc(41) String local41 = this.getParameter("cachesubdirid");
			if (local41 != null) {
				local37 = Integer.parseInt(local41);
				if (local37 < 0 || Class321.aStringArray45.length <= local37) {
					local37 = 0;
				}
			}
			@Pc(67) String local67 = this.getParameter("colourid");
			if (local67 != null) {
				anInt9182 = Integer.parseInt(local67);
				if (anInt9182 < 0 || anInt9182 >= Class321.anIntArray848.length) {
					anInt9182 = 0;
				}
			}
			this.anInt9183 = this.getSize().width;
			this.anInt9180 = this.getSize().height;
			@Pc(98) int local98 = 32;
			try {
				@Pc(103) int local103 = Integer.parseInt(this.getParameter("modewhat"));
				local98 += local103;
			} catch (@Pc(109) Exception local109) {
			}
			try {
				@Pc(113) String local113 = this.getParameter("lang");
				if (local113 != null) {
					this.anInt9181 = Integer.parseInt(local113);
				}
			} catch (@Pc(121) Exception local121) {
			}
			@Pc(131) Class325 local131;
			try {
				local131 = new Class325(this, local98, Class321.aStringArray45[local37], 32);
			} catch (@Pc(133) Exception local133) {
				this.method7608("nocache");
				return;
			}
			@Pc(140) unpack local140 = null;
			@Pc(149) byte[] local149;
			try {
				Class.forName("java.util.jar.Pack200");
				local149 = this.method7609(Class321.aClass324_2, local131);
				if (local149 == null) {
					return;
				}
				local140 = new unpack_Sub1(local149);
			} catch (@Pc(161) Throwable local161) {
			}
			if (local140 == null) {
				local149 = this.method7609(Class321.aClass324_1, local131);
				if (local149 == null) {
					return;
				}
				@Pc(180) unpack local180 = new unpack(local149);
				@Pc(185) ClassLoader_Sub1 local185 = new ClassLoader_Sub1(local180);
				@Pc(188) Class local188 = Class.forName("unpack");
				local185.method7555(local188, local188.getName());
				@Pc(198) Class local198 = local185.loadClass("unpackclass");
				@Pc(204) byte[] local204 = this.method7609(Class321.aClass324_3, local131);
				if (local204 == null) {
					return;
				}
				local140 = (unpack) local198.getConstructor(Class.forName("[B"), Boolean.TYPE).newInstance(local204, Boolean.TRUE);
			}
			@Pc(239) ClassLoader_Sub1 local239 = new ClassLoader_Sub1(local140);
			@Pc(242) Class local242 = Class.forName("Class327");
			local239.method7555(local242, local242.getName());
			@Pc(251) Class local251 = Class.forName("Class325");
			local239.method7555(local251, local251.getName());
			@Pc(260) Class local260 = Class.forName("Class326");
			local239.method7555(local260, local260.getName());
			@Pc(269) Class local269 = Class.forName("Class323");
			local239.method7555(local269, local269.getName());
			@Pc(278) Class local278 = Class.forName("Interface22");
			local239.method7555(local278, local278.getName());
			@Pc(288) Class local288 = local239.loadClass("client");
			synchronized (this) {
				if (this.aBoolean645) {
					return;
				}
				this.anApplet3 = (Applet) local288.getDeclaredConstructor().newInstance();
				local288.getMethod("providesignlink", local251).invoke(null, local131);
				this.anApplet3.init();
				if (this.aBoolean646) {
					this.anApplet3.start();
				}
				if (this.aBoolean647) {
					this.anApplet3.stop();
				}
			}
		} catch (@Pc(347) Exception local347) {
			RuntimeException_Sub2.anInt9174 = -2074222431;
			if (local347 instanceof InvocationTargetException) {
				@Pc(356) Throwable local356 = ((InvocationTargetException) local347).getTargetException();
				if (local356 instanceof ThreadDeath) {
					return;
				}
				RuntimeException_Sub2.method7589(this, local356, local347.toString());
			} else {
				RuntimeException_Sub2.method7589(this, local347, null);
			}
			this.method7608("crash");
		}
	}

	@OriginalMember(owner = "loader!loader", name = "init", descriptor = "()V")
	@Override
	public synchronized void init() {
		this.aBoolean645 = false;
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

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(I[BLjava/io/File;)Z")
	private boolean method7607(@OriginalArg(1) byte[] arg0, @OriginalArg(2) File arg1) {
		try {
			@Pc(9) FileOutputStream local9 = new FileOutputStream(arg1);
			local9.write(arg0, 0, arg0.length);
			local9.close();
			return true;
		} catch (@Pc(20) IOException local20) {
			this.method7608("savefile");
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

	@OriginalMember(owner = "loader!loader", name = "stop", descriptor = "()V")
	@Override
	public synchronized void stop() {
		this.aBoolean647 = true;
		this.aBoolean646 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.stop();
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Ljava/lang/String;B)V")
	private void method7608(@OriginalArg(0) String arg0) {
		if (this.aBoolean644) {
			return;
		}
		this.aBoolean644 = true;
		try {
			if (aString93 == null) {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_loader_" + arg0 + ".ws"), "_top");
			} else {
				this.getAppletContext().showDocument(new URL(aString93 + "&s=" + arg0), "_parent");
			}
		} catch (@Pc(54) Exception local54) {
		}
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;Lloader!gaa;B)[B")
	private byte[] method7609(@OriginalArg(0) Class324 arg0, @OriginalArg(1) Class325 arg1) {
		@Pc(13) File local13;
		try {
			local13 = arg1.method7562(arg0.aString82);
		} catch (@Pc(15) Exception local15) {
			this.method7608("nocache");
			return null;
		}
		@Pc(26) byte[] local26 = this.method7606(local13);
		if (!this.method7605(arg0, local26)) {
			local26 = this.method7610(arg0, false);
			if (local26 == null) {
				local26 = this.method7610(arg0, true);
			}
			if (local26 == null) {
				this.method7608("download");
				return null;
			}
			if (!this.method7607(local26, local13)) {
				return null;
			}
			local26 = this.method7606(local13);
			if (!this.method7605(arg0, local26)) {
				this.method7608("mismatch");
				return null;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "loader!loader", name = "a", descriptor = "(Lloader!f;ZI)[B")
	private byte[] method7610(@OriginalArg(0) Class324 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(14) Font local14 = new Font("Helvetica", 1, 13);
		@Pc(18) FontMetrics local18 = this.getFontMetrics(local14);
		@Pc(25) Color local25 = new Color(Class321.anIntArray848[anInt9182]);
		@Pc(32) Color local32 = new Color(Class321.anIntArray849[anInt9182]);
		@Pc(36) byte[] local36 = new byte[arg0.anInt9171];
		try {
			@Pc(47) InputStream local47;
			if (arg1) {
				@Pc(52) URL local52 = this.getCodeBase();
				@Pc(60) Socket local60 = new Socket(InetAddress.getByName(local52.getHost()), 443);
				local60.setSoTimeout(10000);
				@Pc(66) OutputStream local66 = local60.getOutputStream();
				local66.write(17);
				local66.write(("JAGGRAB " + local52.getFile() + arg0.aString81 + "\n\n").getBytes());
				local47 = local60.getInputStream();
			} else {
				local47 = (new URL(this.getCodeBase(), arg0.aString81)).openStream();
			}
			@Pc(91) int local91 = -1;
			@Pc(93) int local93 = 0;
			while (local93 < local36.length) {
				@Pc(107) int local107 = local36.length - local93;
				if (local107 > 1000) {
					local107 = 1000;
				}
				@Pc(118) int local118 = local47.read(local36, local93, local107);
				if (local118 < 0) {
					throw new EOFException();
				}
				local93 += local118;
				@Pc(139) int local139 = local93 * 100 / local36.length;
				if (local139 != local91) {
					try {
						@Pc(146) Graphics local146 = this.getGraphics();
						if (local146 == null) {
							this.repaint();
						} else {
							local146.setColor(Color.black);
							local146.fillRect(0, 0, this.anInt9183, this.anInt9180);
							local146.setColor(local25);
							local146.drawRect(this.anInt9183 / 2 - 152, this.anInt9180 / 2 - 18, 303, 33);
							@Pc(200) String local200 = arg0.aStringArray46[this.anInt9181] + " - " + local139 + "%";
							local146.setFont(local14);
							local146.setColor(local32);
							local91 = local139;
							local146.drawString(local200, (this.anInt9183 - local18.stringWidth(local200)) / 2, this.anInt9180 / 2 + 4);
						}
					} catch (@Pc(227) Exception local227) {
					}
				}
			}
			local47.close();
			if (arg0.anInt9170 != arg0.anInt9171) {
				@Pc(240) byte[] local240 = new byte[arg0.anInt9170];
				@Pc(245) Inflater local245 = new Inflater(true);
				local245.setInput(local36);
				local245.inflate(local240);
				local36 = local240;
			}
		} catch (@Pc(256) Exception local256) {
			return null;
		}
		return this.method7605(arg0, local36) ? local36 : null;
	}

	@OriginalMember(owner = "loader!loader", name = "start", descriptor = "()V")
	@Override
	public synchronized void start() {
		this.aBoolean646 = true;
		this.aBoolean647 = false;
		if (this.anApplet3 != null) {
			this.anApplet3.start();
		}
	}
}
