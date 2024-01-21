import java.applet.Applet;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.Socket;
import java.net.URL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!kc")
public final class Class84 implements Runnable {

	@OriginalMember(owner = "loader!kc", name = "n", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!kc", name = "s", descriptor = "Ljava/lang/String;")
	private static String aString8;

	@OriginalMember(owner = "loader!kc", name = "r", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!kc", name = "q", descriptor = "Ljava/lang/String;")
	public static String aString9;

	@OriginalMember(owner = "loader!kc", name = "d", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!kc", name = "o", descriptor = "I")
	private static final int anInt3234 = 1;

	@OriginalMember(owner = "loader!kc", name = "c", descriptor = "[Lloader!ka;")
	private Class83[] aClass83Array1;

	@OriginalMember(owner = "loader!kc", name = "b", descriptor = "Lloader!aa;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!kc", name = "l", descriptor = "Z")
	private boolean aBoolean173 = false;

	@OriginalMember(owner = "loader!kc", name = "i", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!kc", name = "m", descriptor = "Lloader!nc;")
	private Class85 aClass85_2 = null;

	@OriginalMember(owner = "loader!kc", name = "g", descriptor = "Lloader!ka;")
	private Class83 aClass83_2 = null;

	@OriginalMember(owner = "loader!kc", name = "p", descriptor = "I")
	private int anInt3235 = 0;

	@OriginalMember(owner = "loader!kc", name = "e", descriptor = "Lloader!ka;")
	private Class83 aClass83_1 = null;

	@OriginalMember(owner = "loader!kc", name = "j", descriptor = "Lloader!nc;")
	private Class85 aClass85_1 = null;

	@OriginalMember(owner = "loader!kc", name = "a", descriptor = "Ljava/io/File;")
	public File aFile6 = null;

	@OriginalMember(owner = "loader!kc", name = "f", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet2 = null;

	@OriginalMember(owner = "loader!kc", name = "k", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!kc", name = "h", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!kc", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class84(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString7 = "1.1";
		aString9 = "Unknown";
		this.anApplet2 = arg1;
		try {
			aString9 = System.getProperty("java.vendor");
			aString7 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString8 = System.getProperty("user.home");
			if (aString8 != null) {
				aString8 = aString8 + "/";
			}
		} catch (@Pc(59) Exception local59) {
		}
		if (aString8 == null) {
			aString8 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(70) Throwable local70) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(98) Exception local98) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		this.method2094(arg3, arg4, arg2);
		this.aBoolean173 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!kc", name = "a", descriptor = "(ILjava/lang/String;II)V")
	private void method2094(@OriginalArg(1) String arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(34) String[] local34 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", aString8, "" };
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(45) boolean local45 = false;
		@Pc(70) String[] local70 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		for (@Pc(72) int local72 = 0; local72 < 2; local72++) {
			for (@Pc(79) int local79 = 0; local79 < local70.length; local79++) {
				for (@Pc(89) int local89 = 0; local89 < local34.length; local89++) {
					try {
						@Pc(97) String local97 = local34[local89];
						if (local97.length() > 0 && !(new File(local97)).exists()) {
							continue;
						}
						@Pc(122) File local122 = new File(local97 + local70[local79]);
						@Pc(134) boolean local134;
						if (local72 == 1 && !local122.exists()) {
							local134 = local122.mkdir();
							if (!local134) {
								continue;
							}
						}
						@Pc(165) int local165;
						@Pc(146) File local146;
						if (!local45) {
							try {
								local146 = new File(local122, "uid.dat");
								if (local72 == 1 && (!local146.exists() || local146.length() < 4L)) {
									@Pc(163) Random local163 = new Random();
									for (local165 = -1; local165 == -1; local165 = local163.nextInt()) {
									}
									@Pc(180) DataOutputStream local180 = new DataOutputStream(new FileOutputStream(local146));
									local180.writeInt(local165);
									local180.close();
								}
								if (local146.exists()) {
									local45 = true;
									@Pc(198) DataInputStream local198 = new DataInputStream(new FileInputStream(local146));
									this.anInt3235 = local198.readInt() + 1;
									local198.close();
								}
							} catch (@Pc(208) Exception local208) {
							}
						}
						if (this.aFile5 == null) {
							try {
								local122 = new File(local122, arg0);
								if (local72 == 1 && !local122.exists()) {
									local134 = local122.mkdir();
									if (!local134) {
										continue;
									}
								}
								local146 = new File(local122, "main_file_cache.dat2");
								if (local72 == 0 && !local146.exists()) {
									continue;
								}
								this.aClass83_1 = new Class83(local146, "rw", 52428800L);
								this.aClass83Array1 = new Class83[16];
								for (local165 = 0; local165 < 16; local165++) {
									this.aClass83Array1[local165] = new Class83(new File(local122, "main_file_cache.idx" + local165), "rw", 1048576L);
								}
								this.aClass83_2 = new Class83(new File(local122, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile6 = this.aFile5 = local122;
							} catch (@Pc(309) Exception local309) {
								try {
									this.aClass83_1.method2085();
									for (local165 = 0; local165 < 16; local165++) {
										this.aClass83Array1[local165].method2085();
									}
									this.aClass83_2.method2085();
								} catch (@Pc(336) Exception local336) {
								}
								this.aClass83_1 = this.aClass83_2 = null;
								this.aClass83Array1 = null;
								this.aFile6 = this.aFile5 = null;
							}
						}
					} catch (@Pc(353) Exception local353) {
					}
					if (local45 && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "loader!kc", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(18) Class85 local18;
			synchronized (this) {
				while (true) {
					if (this.aBoolean173) {
						return;
					}
					if (this.aClass85_1 != null) {
						local18 = this.aClass85_1;
						this.aClass85_1 = this.aClass85_1.aClass85_3;
						if (this.aClass85_1 == null) {
							this.aClass85_2 = null;
						}
						break;
					}
					try {
						this.wait();
					} catch (@Pc(35) InterruptedException local35) {
					}
				}
			}
			try {
				@Pc(47) int local47 = local18.anInt3238;
				if (local47 == 1) {
					local18.anObject6 = new Socket(InetAddress.getByName((String) local18.anObject5), local18.anInt3240);
				} else if (local47 == 2) {
					@Pc(62) Thread local62 = new Thread((Runnable) local18.anObject5);
					local62.setDaemon(true);
					local62.start();
					local62.setPriority(local18.anInt3240);
					local18.anObject6 = local62;
				} else if (local47 == 4) {
					local18.anObject6 = new DataInputStream(((URL) local18.anObject5).openStream());
				} else {
					@Pc(98) Object[] local98;
					if (local47 == 9) {
						local98 = (Object[]) local18.anObject5;
						if (((Class) local98[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject6 = ((Class) local98[0]).getDeclaredMethod((String) local98[1], (Class[]) local98[2]);
					} else if (local47 == 10) {
						local98 = (Object[]) local18.anObject5;
						if (((Class) local98[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local18.anObject6 = ((Class) local98[0]).getDeclaredField((String) local98[1]);
					} else if (local47 == 3) {
						@Pc(199) String local199 = (local18.anInt3240 >> 24 & 0xFF) + "." + (local18.anInt3240 >> 16 & 0xFF) + "." + (local18.anInt3240 >> 8 & 0xFF) + "." + (local18.anInt3240 & 0xFF);
						local18.anObject6 = InetAddress.getByName(local199).getHostName();
					}
				}
				local18.anInt3239 = 1;
			} catch (@Pc(221) ThreadDeath local221) {
				throw local221;
			} catch (@Pc(224) Throwable local224) {
				local18.anInt3239 = 2;
			}
		}
	}
}
