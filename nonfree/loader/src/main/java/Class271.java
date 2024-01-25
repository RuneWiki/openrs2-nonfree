import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!d")
public final class Class271 {

	@OriginalMember(owner = "loader!d", name = "b", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!d", name = "<init>", descriptor = "()V")
	public Class271() throws Exception {
		@Pc(3) GraphicsEnvironment local3 = GraphicsEnvironment.getLocalGraphicsEnvironment();
		this.aGraphicsDevice1 = local3.getDefaultScreenDevice();
		if (!this.aGraphicsDevice1.isFullScreenSupported()) {
			@Pc(14) GraphicsDevice[] local14 = local3.getScreenDevices();
			for (@Pc(18) int local18 = 0; local18 < local14.length; local18++) {
				@Pc(26) GraphicsDevice local26 = local14[local18];
				if (local26 != null && local26.isFullScreenSupported()) {
					this.aGraphicsDevice1 = local26;
					return;
				}
			}
			throw new Exception();
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(I)[I")
	public int[] method6081() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(11) int local11 = 0; local11 < local3.length; local11++) {
			local9[local11 << 2] = local3[local11].getWidth();
			local9[(local11 << 2) + 1] = local3[local11].getHeight();
			local9[(local11 << 2) + 2] = local3[local11].getBitDepth();
			local9[(local11 << 2) + 3] = local3[local11].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(B)V")
	public void method6082() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method6083(null);
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(ILjava/awt/Frame;)V")
	private void method6083(@OriginalArg(1) Frame arg0) {
		@Pc(9) boolean local9 = false;
		try {
			@Pc(14) Field local14 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local14.setAccessible(true);
			@Pc(24) boolean local24 = (Boolean) local14.get(this.aGraphicsDevice1);
			if (local24) {
				local9 = true;
				local14.set(this.aGraphicsDevice1, Boolean.FALSE);
			}
		} catch (@Pc(36) Throwable local36) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local9) {
				try {
					@Pc(63) Field local63 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local63.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(70) Throwable local70) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!d", name = "a", descriptor = "(IIIIILjava/awt/Frame;)V")
	public void method6084(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Frame arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg4.setUndecorated(true);
		arg4.enableInputMethods(false);
		this.method6083(arg4);
		if (arg0 == 0) {
			@Pc(32) int local32 = this.aDisplayMode1.getRefreshRate();
			@Pc(36) DisplayMode[] local36 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(38) boolean local38 = false;
			for (@Pc(40) int local40 = 0; local40 < local36.length; local40++) {
				if (local36[local40].getWidth() == arg3 && local36[local40].getHeight() == arg2 && arg1 == local36[local40].getBitDepth()) {
					@Pc(68) int local68 = local36[local40].getRefreshRate();
					if (!local38 || Math.abs(local68 - local32) < Math.abs(arg0 - local32)) {
						arg0 = local68;
						local38 = true;
					}
				}
			}
			if (!local38) {
				arg0 = local32;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg3, arg2, arg1, arg0));
	}
}
