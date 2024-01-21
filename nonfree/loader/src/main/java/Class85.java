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

@OriginalClass("loader!w")
public final class Class85 implements Runnable {

	@OriginalMember(owner = "loader!w", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString7;

	@OriginalMember(owner = "loader!w", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString8;

	@OriginalMember(owner = "loader!w", name = "p", descriptor = "Ljava/lang/String;")
	private static String aString9;

	@OriginalMember(owner = "loader!w", name = "o", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod3;

	@OriginalMember(owner = "loader!w", name = "f", descriptor = "Ljava/lang/reflect/Method;")
	private static Method aMethod4;

	@OriginalMember(owner = "loader!w", name = "k", descriptor = "I")
	private static final int anInt3176 = 1;

	@OriginalMember(owner = "loader!w", name = "i", descriptor = "[Lloader!ic;")
	private Class83[] aClass83Array1;

	@OriginalMember(owner = "loader!w", name = "e", descriptor = "Lloader!ve;")
	private Interface4 anInterface4_1;

	@OriginalMember(owner = "loader!w", name = "n", descriptor = "Ljava/applet/Applet;")
	private Applet anApplet3 = null;

	@OriginalMember(owner = "loader!w", name = "d", descriptor = "Lloader!jc;")
	private Class84 aClass84_2 = null;

	@OriginalMember(owner = "loader!w", name = "g", descriptor = "Ljava/io/File;")
	private File aFile5 = null;

	@OriginalMember(owner = "loader!w", name = "m", descriptor = "Lloader!ic;")
	private Class83 aClass83_1 = null;

	@OriginalMember(owner = "loader!w", name = "b", descriptor = "Ljava/io/File;")
	public File aFile6 = null;

	@OriginalMember(owner = "loader!w", name = "j", descriptor = "Lloader!jc;")
	private Class84 aClass84_3 = null;

	@OriginalMember(owner = "loader!w", name = "c", descriptor = "Lloader!ic;")
	private Class83 aClass83_2 = null;

	@OriginalMember(owner = "loader!w", name = "s", descriptor = "I")
	private int anInt3177 = 0;

	@OriginalMember(owner = "loader!w", name = "l", descriptor = "Z")
	private boolean aBoolean256 = false;

	@OriginalMember(owner = "loader!w", name = "h", descriptor = "Ljava/awt/EventQueue;")
	private EventQueue anEventQueue2;

	@OriginalMember(owner = "loader!w", name = "q", descriptor = "Ljava/lang/Thread;")
	private final Thread aThread2;

	@OriginalMember(owner = "loader!w", name = "<init>", descriptor = "(ZLjava/applet/Applet;ILjava/lang/String;I)V")
	public Class85(@OriginalArg(0) boolean arg0, @OriginalArg(1) Applet arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(4) int arg4) {
		aString8 = "Unknown";
		this.anApplet3 = arg1;
		aString7 = "1.1";
		try {
			aString8 = System.getProperty("java.vendor");
			aString7 = System.getProperty("java.version");
		} catch (@Pc(43) Exception local43) {
		}
		try {
			aString9 = System.getProperty("user.home");
			if (aString9 != null) {
				aString9 = aString9 + "/";
			}
		} catch (@Pc(60) Exception local60) {
		}
		if (aString9 == null) {
			aString9 = "~/";
		}
		try {
			this.anEventQueue2 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (@Pc(71) Throwable local71) {
		}
		try {
			if (arg1 == null) {
				aMethod4 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			} else {
				aMethod4 = arg1.getClass().getMethod("setFocusTraversalKeysEnabled", Boolean.TYPE);
			}
		} catch (@Pc(98) Exception local98) {
		}
		try {
			if (arg1 == null) {
				aMethod3 = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", Boolean.TYPE);
			} else {
				aMethod3 = arg1.getClass().getMethod("setFocusCycleRoot", Boolean.TYPE);
			}
		} catch (@Pc(125) Exception local125) {
		}
		this.method2240(arg4, arg3, arg2);
		this.aBoolean256 = false;
		this.aThread2 = new Thread(this);
		this.aThread2.setPriority(10);
		this.aThread2.setDaemon(true);
		this.aThread2.start();
	}

	@OriginalMember(owner = "loader!w", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (true) {
			@Pc(17) Class84 local17;
			synchronized (this) {
				while (true) {
					if (this.aBoolean256) {
						return;
					}
					if (this.aClass84_2 != null) {
						local17 = this.aClass84_2;
						this.aClass84_2 = this.aClass84_2.aClass84_1;
						if (this.aClass84_2 == null) {
							this.aClass84_3 = null;
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
				@Pc(46) int local46 = local17.anInt3173;
				if (local46 == 1) {
					local17.anObject6 = new Socket(InetAddress.getByName((String) local17.anObject5), local17.anInt3172);
				} else if (local46 == 2) {
					@Pc(61) Thread local61 = new Thread((Runnable) local17.anObject5);
					local61.setDaemon(true);
					local61.start();
					local61.setPriority(local17.anInt3172);
					local17.anObject6 = local61;
				} else if (local46 == 4) {
					local17.anObject6 = new DataInputStream(((URL) local17.anObject5).openStream());
				} else {
					@Pc(88) Object[] local88;
					if (local46 == 8) {
						local88 = (Object[]) local17.anObject5;
						if (((Class) local88[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local88[0]).getDeclaredMethod((String) local88[1], (Class[]) local88[2]);
					} else if (local46 == 9) {
						local88 = (Object[]) local17.anObject5;
						if (((Class) local88[0]).getClassLoader() == null) {
							throw new SecurityException();
						}
						local17.anObject6 = ((Class) local88[0]).getDeclaredField((String) local88[1]);
					} else if (local46 == 3) {
						@Pc(151) String local151 = (local17.anInt3172 >> 24 & 0xFF) + "." + (local17.anInt3172 >> 16 & 0xFF) + "." + (local17.anInt3172 >> 8 & 0xFF) + "." + (local17.anInt3172 & 0xFF);
						local17.anObject6 = InetAddress.getByName(local151).getHostName();
					}
				}
				local17.anInt3171 = 1;
			} catch (@Pc(216) ThreadDeath local216) {
				throw local216;
			} catch (@Pc(219) Throwable local219) {
				local17.anInt3171 = 2;
			}
		}
	}

	@OriginalMember(owner = "loader!w", name = "a", descriptor = "(IILjava/lang/String;I)V")
	private void method2240(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 32 || arg2 > 34) {
			arg2 = 32;
		}
		@Pc(51) String[] local51 = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", "/tmp/", aString9, "" };
		@Pc(76) String[] local76 = new String[] { ".jagex_cache_" + arg2, ".file_store_" + arg2 };
		@Pc(78) boolean local78 = false;
		for (@Pc(80) int local80 = 0; local80 < 2; local80++) {
			for (@Pc(85) int local85 = 0; local85 < local76.length; local85++) {
				for (@Pc(91) int local91 = 0; local91 < local51.length; local91++) {
					try {
						@Pc(99) String local99 = local51[local91];
						if (local99.length() > 0 && !(new File(local99)).exists()) {
							continue;
						}
						@Pc(127) File local127 = new File(local99 + local76[local85]);
						@Pc(139) boolean local139;
						if (local80 == 1 && !local127.exists()) {
							local139 = local127.mkdir();
							if (!local139) {
								continue;
							}
						}
						@Pc(167) int local167;
						@Pc(151) File local151;
						if (!local78) {
							try {
								local151 = new File(local127, "uid.dat");
								if (local80 == 1 && (!local151.exists() || local151.length() < 4L)) {
									local167 = -1;
									@Pc(171) Random local171 = new Random();
									while (local167 == -1) {
										local167 = local171.nextInt();
									}
									@Pc(187) DataOutputStream local187 = new DataOutputStream(new FileOutputStream(local151));
									local187.writeInt(local167);
									local187.close();
								}
								if (local151.exists()) {
									@Pc(204) DataInputStream local204 = new DataInputStream(new FileInputStream(local151));
									local78 = true;
									this.anInt3177 = local204.readInt() + 1;
									local204.close();
								}
							} catch (@Pc(216) Exception local216) {
							}
						}
						if (this.aFile5 == null) {
							try {
								local127 = new File(local127, arg1);
								if (local80 == 1 && !local127.exists()) {
									local139 = local127.mkdir();
									if (!local139) {
										continue;
									}
								}
								local151 = new File(local127, "main_file_cache.dat2");
								if (local80 == 0 && !local151.exists()) {
									continue;
								}
								this.aClass83_2 = new Class83(local151, "rw", 52428800L);
								this.aClass83Array1 = new Class83[16];
								for (local167 = 0; local167 < 16; local167++) {
									this.aClass83Array1[local167] = new Class83(new File(local127, "main_file_cache.idx" + local167), "rw", 1048576L);
								}
								this.aClass83_1 = new Class83(new File(local127, "main_file_cache.idx255"), "rw", 1048576L);
								this.aFile6 = this.aFile5 = local127;
							} catch (@Pc(313) Exception local313) {
								try {
									this.aClass83_2.method2224();
									for (local167 = 0; local167 < 16; local167++) {
										this.aClass83Array1[local167].method2224();
									}
									this.aClass83_1.method2224();
								} catch (@Pc(340) Exception local340) {
								}
								this.aClass83Array1 = null;
								this.aFile6 = this.aFile5 = null;
								this.aClass83_2 = this.aClass83_1 = null;
							}
						}
					} catch (@Pc(357) Exception local357) {
					}
					if (local78 && this.aFile5 != null) {
						return;
					}
				}
			}
		}
		if (this.aFile5 == null) {
			throw new RuntimeException();
		}
	}
}
