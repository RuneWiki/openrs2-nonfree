import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class48 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "e", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!ki;[Lclient!qe;)V")
	public dxVertexLayout(@OriginalArg(0) Class143_Sub1_Sub1 arg0, @OriginalArg(1) Class284[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.anIn1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = 0;
			@Pc(21) Class284 local21 = arg1[local11];
			for (@Pc(23) int local23 = 0; local23 < local21.method6963(); local23++) {
				@Pc(33) Class137 local33 = local21.method6964(local23);
				if (local33 == Static199.aClass137_1) {
					local7.addElement(local11, 2, 0, 0, 0, local17);
				} else if (Static199.aClass137_2 == local33) {
					local7.addElement(local11, 2, 0, 3, 0, local17);
				} else if (Static199.aClass137_3 == local33) {
					local7.addElement(local11, 4, 0, 10, 0, local17);
				} else if (local33 == Static199.aClass137_4) {
					local7.addElement(local11, 0, 0, 5, local9++, local17);
				} else if (Static199.aClass137_5 == local33) {
					local7.addElement(local11, 1, 0, 5, local9++, local17);
				} else if (local33 == Static199.aClass137_6) {
					local7.addElement(local11, 2, 0, 5, local9++, local17);
				} else if (local33 == Static199.aClass137_7) {
					local7.addElement(local11, 3, 0, 5, local9++, local17);
				}
				local17 += local33.anInt3219;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, (IDirect3DVertexDeclaration) null);
	}
}
