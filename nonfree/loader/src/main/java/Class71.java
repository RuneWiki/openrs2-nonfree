import java.applet.Applet;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!c")
public final class Class71 implements Runnable {

	@OriginalMember(owner = "loader!c", name = "k", descriptor = "Ljava/lang/String;")
	private static String aString11;

	@OriginalMember(owner = "loader!c", name = "l", descriptor = "Ljava/lang/String;")
	public static String aString13;

	@OriginalMember(owner = "loader!c", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString15;

	@OriginalMember(owner = "loader!c", name = "n", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!c", name = "b", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!c", name = "d", descriptor = "I")
	private static final int anInt3003 = 1;

	@OriginalMember(owner = "loader!c", name = "e", descriptor = "Lloader!he;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "loader!c", name = "w", descriptor = "Lloader!be;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "loader!c", name = "o", descriptor = "Ljava/lang/String;")
	private String aString12 = null;

	@OriginalMember(owner = "loader!c", name = "u", descriptor = "Lloader!da;")
	private Class73 aClass73_1 = null;

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "Lloader!jd;")
	private Class74 aClass74_1 = null;

	@OriginalMember(owner = "loader!c", name = "i", descriptor = "Lloader!jd;")
	private Class74 aClass74_2 = null;

	@OriginalMember(owner = "loader!c", name = "t", descriptor = "I")
	private int anInt3005 = 0;

	@OriginalMember(owner = "loader!c", name = "h", descriptor = "Ljava/lang/String;")
	private String aString10 = null;

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!c", name = "q", descriptor = "Z")
	private boolean aBoolean142 = false;

	@OriginalMember(owner = "loader!c", name = "v", descriptor = "Ljava/lang/String;")
	public String aString16 = null;

	@OriginalMember(owner = "loader!c", name = "f", descriptor = "Lloader!da;")
	private Class73 aClass73_2 = null;

	@OriginalMember(owner = "loader!c", name = "p", descriptor = "I")
	private int anInt3004 = 0;

	@OriginalMember(owner = "loader!c", name = "g", descriptor = "Ljava/lang/String;")
	private String aString14 = null;

	@OriginalMember(owner = "loader!c", name = "r", descriptor = "Ljava/net/InetAddress;")
	private final InetAddress anInetAddress2;

	@OriginalMember(owner = "loader!c", name = "m", descriptor = "[Lloader!da;")
	private final Class73[] aClass73Array1;

	@OriginalMember(owner = "loader!c", name = "s", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!c", name = "<init>", descriptor = "(ZLjava/applet/Applet;Ljava/net/InetAddress;ILjava/lang/String;I)V")
	public Class71(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) InetAddress arg2, @OriginalArg(3) int arg3, @OriginalArg(4) String arg4, @OriginalArg(5) int arg5) throws IOException {
		this.anApplet2 = arg1;
		aString13 = "Unknown";
		aString15 = "1.1";
		this.anInetAddress2 = arg2;
		try {
			aString13 = System.getProperty("java.vendor");
			aString15 = System.getProperty("java.version");
			aString11 = System.getProperty("user.home");
			if (aString11 != null) {
				aString11 = aString11 + "/";
			}
		} catch (@Pc(69) Exception local69) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(97) Exception local97) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		this.method2092(arg3, arg4);
		this.aClass73_1 = new Class73(new File(this.aString12 + "main_file_cache.dat2"), "rw", 52428800L);
		this.aClass73Array1 = new Class73[arg5];
		for (@Pc(158) int local158 = 0; local158 < arg5; local158++) {
			this.aClass73Array1[local158] = new Class73(new File(this.aString12 + "main_file_cache.idx" + local158), "rw", 1048576L);
		}
		this.aClass73_2 = new Class73(new File(this.aString12 + "main_file_cache.idx255"), "rw", 1048576L);
		this.method2099();
		this.aBoolean142 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!c", name = "a", descriptor = "(BILjava/lang/String;)V")
	private void method2092(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		if (aString11 == null) {
			aString11 = "~/";
		}
		@Pc(64) String[] local64 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "d:/windows/", "d:/winnt/", "e:/windows/", "e:/winnt/", "f:/windows/", "f:/winnt/", "c:/", aString11, "/tmp/", "" };
		if (arg0 < 32 || arg0 > 34) {
			arg0 = 32;
		}
		@Pc(90) String local90 = ".file_store_" + arg0;
		for (@Pc(92) int local92 = 0; local92 < local64.length; local92++) {
			try {
				@Pc(104) String local104 = local64[local92];
				@Pc(116) File local116;
				if (local104.length() > 0) {
					local116 = new File(local104);
					if (!local116.exists()) {
						continue;
					}
				}
				local116 = new File(local104 + local90);
				if (local116.exists() || local116.mkdir()) {
					if (arg1.length() > 0) {
						local116 = new File(local116, arg1);
						if (!local116.exists() && !local116.mkdir()) {
							continue;
						}
					}
					this.aString14 = this.aString10 = local116.getParent() + "/";
					this.aString16 = this.aString12 = local116.getPath() + "/";
					return;
				}
			} catch (@Pc(188) Exception local188) {
			}
		}
		throw new RuntimeException();
	}

	@OriginalMember(owner = "loader!c", name = "c", descriptor = "(B)V")
	private void method2099() {
		try {
			@Pc(12) File local12 = new File(this.aString10 + "uid.dat");
			if (!local12.exists() || local12.length() < 4L) {
				@Pc(38) DataOutputStream local38 = new DataOutputStream(new FileOutputStream(this.aString10 + "uid.dat"));
				local38.writeInt((int) (Math.random() * 9.9999999E7D));
				local38.close();
			}
		} catch (@Pc(48) Exception local48) {
		}
		try {
			@Pc(70) DataInputStream local70 = new DataInputStream(new FileInputStream(this.aString10 + "uid.dat"));
			this.anInt3005 = local70.readInt() + 1;
			local70.close();
		} catch (@Pc(80) Exception local80) {
		}
	}

	@OriginalMember(owner = "loader!c", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(16) Class74 local16;
			synchronized (this) {
				while (true) {
					if (this.aBoolean142) {
						return;
					}
					if (this.aClass74_1 != null) {
						local16 = this.aClass74_1;
						this.aClass74_1 = this.aClass74_1.aClass74_3;
						if (this.aClass74_1 == null) {
							this.aClass74_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(34) InterruptedException local34) {
					}
				}
			}
			try {
				@Pc(46) int local46 = local16.anInt3006;
				if (local46 == 1) {
					local16.anObject5 = new Socket(this.anInetAddress2, local16.anInt3008);
				} else if (local46 == 2) {
					@Pc(71) Thread local71 = new Thread((Runnable) local16.anObject6);
					local71.setDaemon(true);
					local71.start();
					local71.setPriority(local16.anInt3008);
					local16.anObject5 = local71;
				} else if (local46 == 4) {
					local16.anObject5 = new DataInputStream(((URL) local16.anObject6).openStream());
				} else {
					@Pc(107) Object[] local107;
					if (local46 == 9) {
						local107 = (Object[]) local16.anObject6;
						if (((Class) local107[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject5 = ((Class) local107[0]).getDeclaredMethod((String) local107[1], (Class[]) local107[2]);
					} else if (local46 == 10) {
						local107 = (Object[]) local16.anObject6;
						if (((Class) local107[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local16.anObject5 = ((Class) local107[0]).getDeclaredField((String) local107[1]);
					} else if (local46 == 3) {
						@Pc(246) String local246 = (local16.anInt3008 >> 24 & 0xFF) + "." + (local16.anInt3008 >> 16 & 0xFF) + "." + (local16.anInt3008 >> 8 & 0xFF) + "." + (local16.anInt3008 & 0xFF);
						local16.anObject5 = InetAddress.getByName(local246).getHostName();
					} else if (local46 == 5) {
						local16.anObject5 = new Class73(new File(this.aString10 + "music" + this.anInt3004 + ".mid"), "rw", 1048576L);
						this.anInt3004 = (this.anInt3004 + 1) % 5;
					}
				}
				local16.anInt3007 = 1;
			} catch (@Pc(256) Exception local256) {
				local16.anInt3007 = 2;
			}
		}
	}
}
