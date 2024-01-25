import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("loader!b")
public final class Class219 {

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "Ljava/awt/DisplayMode;")
	private DisplayMode aDisplayMode1;

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "Ljava/awt/GraphicsDevice;")
	private GraphicsDevice aGraphicsDevice1;

	@OriginalMember(owner = "loader!b", name = "<init>", descriptor = "()V")
	public Class219() throws Exception {
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

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Z)[I")
	public int[] method5735() {
		@Pc(3) DisplayMode[] local3 = this.aGraphicsDevice1.getDisplayModes();
		@Pc(9) int[] local9 = new int[local3.length << 2];
		for (@Pc(18) int local18 = 0; local18 < local3.length; local18++) {
			local9[local18 << 2] = local3[local18].getWidth();
			local9[(local18 << 2) + 1] = local3[local18].getHeight();
			local9[(local18 << 2) + 2] = local3[local18].getBitDepth();
			local9[(local18 << 2) + 3] = local3[local18].getRefreshRate();
		}
		return local9;
	}

	@OriginalMember(owner = "loader!b", name = "b", descriptor = "(Z)V")
	public void method5736() {
		if (this.aDisplayMode1 != null) {
			this.aGraphicsDevice1.setDisplayMode(this.aDisplayMode1);
			if (!this.aGraphicsDevice1.getDisplayMode().equals(this.aDisplayMode1)) {
				throw new RuntimeException("Did not return to correct resolution!");
			}
			this.aDisplayMode1 = null;
		}
		this.method5737(null);
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(Ljava/awt/Frame;I)V")
	private void method5737(@OriginalArg(0) Frame arg0) {
		@Pc(1) boolean local1 = false;
		try {
			@Pc(6) Field local6 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			local6.setAccessible(true);
			@Pc(16) boolean local16 = (Boolean) local6.get(this.aGraphicsDevice1);
			if (local16) {
				local6.set(this.aGraphicsDevice1, Boolean.FALSE);
				local1 = true;
			}
		} catch (@Pc(35) Throwable local35) {
		}
		try {
			this.aGraphicsDevice1.setFullScreenWindow(arg0);
		} finally {
			if (local1) {
				try {
					@Pc(62) Field local62 = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					local62.set(this.aGraphicsDevice1, Boolean.TRUE);
				} catch (@Pc(69) Throwable local69) {
				}
			}
		}
	}

	@OriginalMember(owner = "loader!b", name = "a", descriptor = "(ILjava/awt/Frame;IIII)V")
	public void method5738(@OriginalArg(0) int arg0, @OriginalArg(1) Frame arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aDisplayMode1 = this.aGraphicsDevice1.getDisplayMode();
		if (this.aDisplayMode1 == null) {
			throw new NullPointerException();
		}
		arg1.setUndecorated(true);
		arg1.enableInputMethods(false);
		this.method5737(arg1);
		if (arg4 == 0) {
			@Pc(36) int local36 = this.aDisplayMode1.getRefreshRate();
			@Pc(40) DisplayMode[] local40 = this.aGraphicsDevice1.getDisplayModes();
			@Pc(42) boolean local42 = false;
			for (@Pc(44) int local44 = 0; local44 < local40.length; local44++) {
				if (arg2 == local40[local44].getWidth() && arg0 == local40[local44].getHeight() && arg3 == local40[local44].getBitDepth()) {
					@Pc(75) int local75 = local40[local44].getRefreshRate();
					if (!local42 || Math.abs(local75 - local36) < Math.abs(arg4 - local36)) {
						arg4 = local75;
						local42 = true;
					}
				}
			}
			if (!local42) {
				arg4 = local36;
			}
		}
		this.aGraphicsDevice1.setDisplayMode(new DisplayMode(arg2, arg0, arg3, arg4));
	}
}
